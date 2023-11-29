<!-- src/components/AnimalClassificationDisplay.vue -->
<template>
  <div class="animal-classification-display">
    <div class="header">
      <h2>动物种类</h2>
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
import axios from 'axios';
import qs from 'qs'

export default {
  components: {
    AnimalType,
  },
  data() {
    return {
      animalClassification: {
        name: '动物界',
        level: 'Kingdom', // Added level property
        children: [
          {
            name: '脊椎动物门',
            level: 'Phylum', // Added level property
          }, 
          {
            name: '节肢动物门',
            level: 'Phylum', // Added level property
          },
          // ... other phyla under Animalia kingdom
        ],
      },
      // animalClassification: null,
      level: 'Kingdom',
    };
  },
  mounted() {
    // Fetch data when the component is mounted
    console.log('Edit clicked');
    this.fetchAnimalClassification('Kingdom', 'Animalia'); 
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
    fetchAnimalClassification(level, name) {
      // Replace the URL with your actual API endpoint
      const apiUrl = `http://localhost:9999/api/animal-classification/${level}/animalclassification${level}/list/`;


      // Assuming your API expects a POST request with some data, modify the payload accordingly
      const postData = {
        // Your payload data here
        "name" : name,
      };

      // Make a POST request to the API
      axios.post(apiUrl, postData)
        .then(response => {
          // Handle the response and set the data to the component's state
          this.animalClassification = response.data;
        })
        .catch(error => {
          console.error('Error fetching animal classification data:', error);
        });
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
