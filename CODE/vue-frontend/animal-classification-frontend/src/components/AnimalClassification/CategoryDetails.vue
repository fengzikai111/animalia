<!-- src/components/AnimalClassification/CategoryDetails.vue -->
<template>
  <div>
    <h2>Category Details</h2>
    <div>
      <p><strong>Category Name:</strong> {{ categoryName }}</p>
      <p><strong>Parent Category:</strong> {{ parentCategory || 'N/A' }}</p>
    </div>
    <div>
      <!-- Add other details or actions as needed -->
      <button @click="editCategory">Edit</button>
      <button @click="deleteCategory">Delete</button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      categoryName: 'Sample Category', // You can initialize these values with data from your API
      parentCategory: 'Parent Category',
    };
  },
  methods: {
    editCategory() {
      // Handle category editing navigation or actions here
      this.$router.push('/edit-category');
    },
    deleteCategory() {
      // Handle category deletion logic here
      console.log('Delete Category:', this.categoryName);
      // You may send an API request to the backend here
    },
  },
};
</script>
