<!-- src/components/LeftSidebar.vue -->
<template>
  <div class="left-sidebar">
    <!-- <router-link to="/animal-classification-display">Animal Classification </router-link> -->
    <router-link to="/animal-classification-display">动物种类 </router-link>
    <!-- Your other left sidebar content here -->
  </div>
</template>

<style scoped>
/* Add your left sidebar styles here */
.left-sidebar {
  background-color: #ddd;
  width: 200px;
  padding: 10px;
}

/* Style for router links */
a {
  color: #333;
  text-decoration: none;
  display: block;
  margin-bottom: 10px;
}
</style>
