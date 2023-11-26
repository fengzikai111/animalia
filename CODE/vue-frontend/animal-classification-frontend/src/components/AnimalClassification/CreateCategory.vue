<!-- src/components/AnimalClassification/CreateCategory.vue -->
<template>
  <div>
    <h2>Create Category</h2>
    <form @submit.prevent="createCategory">
      <label for="categoryName">Category Name:</label>
      <input v-model="categoryName" type="text" id="categoryName" required />
      
      <!-- Select parent category -->
      <label for="parentCategory">Parent Category:</label>
      <select v-model="parentCategory" id="parentCategory">
        <!-- Use options dynamically based on your data or API -->
        <option value="">Select Parent Category</option>
        <option value="1">Category A</option>
        <option value="2">Category B</option>
        <!-- Add more options as needed -->
      </select>

      <button type="submit">Create</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      categoryName: '',
      parentCategory: '',
    };
  },
  methods: {
    createCategory() {
      // Handle category creation logic here
      console.log('Create Category:', this.categoryName, this.parentCategory);
      // You may send an API request to the backend here
    },
  },
};
</script>
