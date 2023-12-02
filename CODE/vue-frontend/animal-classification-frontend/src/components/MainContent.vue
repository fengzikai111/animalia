<!-- src/components/MainContent.vue -->
<template>
  <div class="main-content">
    <div class="content-area">
      <!-- Your content here -->
      <router-view></router-view>
    </div>
    <div class="tips-area">
      <!-- Your tips here -->
    </div>
  </div>
</template>
 

<style scoped>
.main-content {
  display: flex; /* Use flexbox to layout the children horizontally */
  width: 100%;
}

.content-area {
  flex: 6; /* Take up 2/3 of the space */
  /* ... other styles ... */
}

.tips-area {
  flex: 1; /* Take up 1/3 of the space */

  border: 1px solid #ccc; /* Add a gray border */
  /* ... other styles ... */
}
</style>