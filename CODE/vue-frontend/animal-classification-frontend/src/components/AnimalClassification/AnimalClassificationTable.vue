<!-- src/components/AnimalClassificationTable.vue -->
<template>
  <div class="animal-classification-table">
    <div class="header">
      <h2>Animal Classification Table</h2>
      <div class="buttons">
        <router-link to="/animal-classification-table/kingdom">Kingdom</router-link>
        <router-link to="/animal-classification-table/phylum">Phylum</router-link>
        <!-- Add more links for other levels as needed -->
      </div>
    </div>
    <table class="classification-table">
      <thead>
        <tr>
          <th>Level</th>
          <th>Name</th>
        </tr>
      </thead>
      <tbody>
        <AnimalTypeRow v-for="type in filteredClassification" :key="type.name" :type="type" />
      </tbody>
    </table>
  </div>
</template>

<script>
import AnimalTypeRow from './AnimalTypeRow.vue';

export default {
  components: {
    AnimalTypeRow,
  },
  props: {
    level: String,
  },
  computed: {
    filteredClassification() {
      return this.animalClassification.filter(type => type.level === this.level);
    },
  },
  data() {
    return {
      animalClassification: [
        { name: 'Animalia', level: 'Kingdom' },
        { name: 'Chordata', level: 'Phylum' },
        { name: 'Mammalia', level: 'Class' },
        { name: 'Carnivora', level: 'Order' },
        { name: 'Felidae', level: 'Family' },
        { name: 'Panthera', level: 'Genus' },
        { name: 'Panthera leo', level: 'Species' },
        // Add more entries as needed
      ],
    };
  },
};
</script>

<style scoped>
.animal-classification-table {
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

.classification-table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}

.classification-table th, .classification-table td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: left;
}

.classification-table th {
  background-color: #f2f2f2;
}
</style>
