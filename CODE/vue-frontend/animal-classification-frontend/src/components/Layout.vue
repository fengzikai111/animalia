<!-- src/components/Layout.vue -->
<template>
    <div class="layout">
      <TopBar />
      <div class="main-container">
        <LeftSidebar />
        <MainContent />
      </div>
      <BottomBar />
    </div>
  </template>
  
  <script>
  import TopBar from './TopBar.vue';
  import LeftSidebar from './LeftSidebar.vue';
  import MainContent from './MainContent.vue';
  import BottomBar from './BottomBar.vue';
  
  export default {
    components: {
      TopBar,
      LeftSidebar,
      MainContent,
      BottomBar,
    },
  };
  </script>
  
  <style scoped>
  /* Add your layout styles here */
  .layout {
    display: flex;
    flex-direction: column;
    height: 100vh;
  }
  
  .main-container {
    display: flex;
    flex: 1;
  }
  </style>
  