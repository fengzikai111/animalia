<!-- src/components/AnimalClassificationDisplay.vue -->
<template>
  <div class="animal-classification-display">
    <div class="header">
      <h2>Animal Classification</h2>
      <div class="buttons">
        <button @click="addNewType">Add New</button>
        <button @click="editClassification">Edit</button>
      </div>
    </div>
    <AnimalType :type="animalClassification" level="Kingdom" />
  </div>
</template>

<script>
import AnimalType from './AnimalType.vue';

export default {
  components: {
    AnimalType,
  },
  data() {
    return {
      animalClassification: {
        name: 'Animalia',
        level: 'Kingdom', // Added level property
        children: [
          {
            name: 'Chordata',
            level: 'Phylum', // Added level property
            children: [
              {
                name: 'Mammalia',
                level: 'Class', // Added level property
                children: [
                  {
                    name: 'Carnivora',
                    level: 'Order', // Added level property
                    children: [
                      {
                        name: 'Felidae',
                        level: 'Family', // Added level property
                        children: [
                          {
                            name: 'Panthera',
                            level: 'Genus', // Added level property
                            children: [
                              {
                                name: 'Panthera leo',
                                level: 'Species', // Added level property
                                children: [],
                              },
                              // ... other species under Panthera genus
                            ],
                          },
                          // ... other genera under Felidae family
                        ],
                      },
                      // ... other families under Carnivora order
                    ],
                  },
                  // ... other orders under Mammalia class
                ],
              },
              // ... other classes under Chordata phylum
            ],
          },
          // ... other phyla under Animalia kingdom
        ],
      },
    };
  },
  
  methods: {
    addNewType() {
      // Implement logic for adding a new type
      console.log('Add New clicked');
    },
    editClassification() {
      // Implement logic for editing classification
      console.log('Edit clicked');
    },
  },
};
</script>

<style scoped>
.animal-classification-display {
  padding: 20px;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

h2 {
  font-size: 1.5em;
}

.buttons {
  display: flex;
}

button {
  margin-left: 10px;
}
</style>
