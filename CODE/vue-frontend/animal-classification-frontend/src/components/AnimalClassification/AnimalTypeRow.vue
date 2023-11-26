<!-- src/components/AnimalTypeRow.vue -->
<template>
    <tr>
      <td>{{ level }}</td>
      <td>{{ type.name }}</td>
    </tr>
  </template>
  
  <script>
  export default {
    props: {
      type: Object,
      level: {
        type: String,
        default: 'Kingdom', // Default level for the top-level type
      },
    },
  };
  </script>
  