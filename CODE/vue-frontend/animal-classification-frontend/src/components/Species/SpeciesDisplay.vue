<template>
    <div>
      <h1>{{ wolfInfo.entity_type }}</h1>
      <div v-for="(attribute, key) in wolfInfo.attributes" :key="key">
        <strong>{{ key }}:</strong>
        <component :is="getComponentForType(attribute.type)" :values="attribute.values"></component>
      </div>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  import TextDisplay from './TextDisplay.vue';
  import NumberDisplay from './NumberDisplay.vue';
  // ...import other display components
  
  export default {
    components: {
      TextDisplay,
      NumberDisplay,
      // ...other display components
    },
    data() {
      return {
        wolfInfo: {
          entity_type: '',
          attributes: {}
        }
      };
    },
    methods: {
      async getWolfInfo() {
        try {
          const response = await axios.get('/api/path/to/wolf/info');
          this.wolfInfo.entity_type = response.data.entity_type;
          this.wolfInfo.attributes = response.data.attributes;
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