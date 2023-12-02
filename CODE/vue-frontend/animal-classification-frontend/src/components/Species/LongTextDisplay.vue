<template>
    <div>
      <p v-for="(value, index) in values" :key="index">
        {{ value }}
      </p>
    </div>
  </template>
  
  <script>
  export default {
    props: {
      values: {
        type: Array,
        default: () => []
      }
    }
  };
  </script>
  
  <style scoped>
  p {
    color: #333; /* Dark text color for visibility */
    font-size: 18px; /* Increase font size for visibility */
    margin: 10px 0; /* Add some margin around each paragraph */
    text-align: justify; /* Justify the text for a "long text" feel */
  }
  </style>