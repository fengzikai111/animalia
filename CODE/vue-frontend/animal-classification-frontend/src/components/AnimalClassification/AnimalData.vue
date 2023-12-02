<template>
    <div class="animal-data">
      <!-- Display the data here -->
      <!-- <div  class="animal-data-content"  v-if="animalData">{{ animalData }}</div> -->
      <!-- <div  class="animal-data-content"  >{{ animalData}}</div> -->
      <div class="vclass" v-html="animalData"></div>
      <!-- <h1>{{ animalData.name }}</h1>
    <p><strong>Description:</strong> {{ animalData.description }}</p>
    <p><strong>Class ID:</strong> {{ animalData.classId }}</p>
    <p><strong>Level:</strong> {{ animalData.level }}</p> -->
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    props: ['selectedAnimal','selectedAnimallevel'],
    data() {
      return {
        animalData: null,
      };
    },
    watch: {
      selectedAnimal(newVal) {
        this.fetchAnimalData(newVal);
      },
    },
    created() {
      this.fetchAnimalData(this.selectedAnimal);
    },
    methods: {
      async fetchAnimalData(type) {
        // console.log(type.level);
        // console.log(type.name);
        let level=type && type.level?type.level:'Kingdom';
        let  name=type && type.name?type.name:'动物界';

        const response = await axios.get(`http://localhost:9999/api/animal-classification/animalclassification${level}/name/${encodeURIComponent(name)}`);
        this.animalData =  response.data.summary;
      // this.animalData = name;
      },
    },
  };
  </script>
  
  <style scoped>
  .animal-data {
    /* ... styles ... */
  }

  .animal-data-content {
    border: 1px solid #f6ecec; /* Add a gray border */
    background-color: #fff9f9;
  margin: 100px; /* Set the margin to 50px */
  height: 500px;
  width: 500px;
  margin-top: 20px;
  /* ... other styles ... */  
  /* Add your styles here */
}
.vclass{
  margin-top: 20px;
  font-size: 12px;
  color: #666666;
}

  </style>