<!-- src/components/AnimalClassification/EditCategory.vue -->
<template>
  <div>
    <h2>Edit Category</h2>
    <form @submit.prevent="editCategory">
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

      <button type="submit">Save</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      categoryName: '', // You can initialize these values with data from your API
      parentCategory: '',
    };
  },
  methods: {
    editCategory() {
      // Handle category editing logic here
      console.log('Edit Category:', this.categoryName, this.parentCategory);
      // You may send an API request to the backend here
    },
  },
};
</script>
