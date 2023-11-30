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

class Classification {
  constructor(name, level, children) {
    this.name = name;
    this.level = level;
    this.children = children;
  }
}

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
          // ... other phyla under Animalia kingdom
        ],
      },
    
      animalClassification1:{
  "name": "动物界",
  "level": "Kingdom",
  "children": [
    {
      "name": "脊椎动物门1",
      "level": "Phylum",
      "children": []
    },
    {
      "name": "节肢动物门1",
      "level": "Phylum",
      "children": []
    }
  ]
},

      // animalClassification: null,
      level: 'Kingdom',
    };
  },
  mounted() {
    // Fetch data when the component is mounted
    console.log('Edit clicked');
    let level = this.$route.params.level ? this.$route.params.level : 'Kingdom';
    let name = this.$route.params.name ? this.$route.params.name : '动物界';
    // this.fetchAnimalClassification('Kingdom', '动物界'); 
    this.fetchAnimalClassification(level, name); 

  },
  beforeRouteEnter(to, from, next) {
    next(vm => {
      // access to component instance via `vm`
      let level = to.params.level ? to.params.level : 'Kingdom';
      let name = to.params.name ? to.params.name : '动物界';
      vm.fetchAnimalClassification(to.params.level, to.params.name);
    });
  },

  beforeRouteUpdate(to, from, next) {
    let level = to.params.level;
    let name = to.params.name;
    this.fetchAnimalClassification(level, name);
    next();
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
      level=level?level:'Kingdom';
      name=name?name:'动物界';
      const apiUrl = `http://localhost:9999/api/animal-classification/animalclassification${level}/list/`;


      // Assuming your API expects a POST request with some data, modify the payload accordingly
      const postData = {
        // Your payload data here
        "name" : name,
      };

      // Make a POST request to the API
      axios.post(apiUrl, postData)
        .then(response => {
          // Handle the response and set the data to the component's state
          // this.animalClassification = response.data;
          console.log(response.data);
          let children = response.data.map(item => new Classification(item.name, item.level, []));
          console.log(Classification)
          let animalClassificationObject = new Classification(
            name,
            level,children
          );
          // this.animalClassification = JSON.stringify(animalClassificationObject);
          this.animalClassification =animalClassificationObject;
          console.log(this.animalClassification);
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
