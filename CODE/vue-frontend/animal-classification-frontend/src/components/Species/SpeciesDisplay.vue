<template>
  <div>
    <div v-for="(entity, index) in wolfInfo.entities" :key="index">
      <h2>{{ entity.entityType }}</h2>
      <div v-for="(attribute, i) in entity.attributes" :key="i">
        <h3>{{ attribute.attributeName }}</h3>
        <TextDisplay></TextDisplay>
        <component :is="getComponentForType(attribute.type)" :values="attribute.values" ></component>
      </div>
    </div>
  </div>
</template>
  
<script>
import axios from 'axios';
import TextDisplay from './TextDisplay.vue';
import LongTextDisplay from './LongTextDisplay.vue'; 

export default {
    components: {
    TextDisplay,
    LongTextDisplay
  },
  data() {
    return {
      wolfInfo: {
        entities: []
      }
    };
  },
  methods: {
    async getWolfInfo() {
      try {
        const response = await axios.get('http://localhost:9999/api/animal-classification/animalclassificationSpecies/animalclassificationspecies/1');
        this.wolfInfo.entities = response.data.entities;
      } catch (error) {
        console.error(error);
      }
    },
    getComponentForType(type) {
      switch (type) {
        case 'VARCHAR':
          return 'TextDisplay';
        case 'INT':
          return 'NumberDisplay';
        case 'TEXT':
          return 'LongTextDisplay'; // Assuming you have a LongTextDisplay component for TEXT type
        // ...other cases for other types
        default:
          return 'TextDisplay';
      }
    }
  },
  created() {
    this.getWolfInfo();
  }
};
</script>

<style scoped>
  /* Your styles here */
</style>