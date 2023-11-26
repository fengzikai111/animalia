<!-- src/views/Home.vue -->
<template>
    <div>
      <h2>Home</h2>
      <router-link to="/create-category">Create Category</router-link>
      <router-view></router-view>
    </div>
  </template>
  
  <script>
  export default {
    // Add your component logic here
  };
  </script>
  