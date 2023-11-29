<!-- src/components/AnimalType.vue -->
<template>
  <div class="animal-type">
    <p>
      <router-link :to="getLink(type.level, type.name)">
        {{ type.name }}
      </router-link>
    </p>
    <ul>
      <AnimalType v-for="child in type.children" :key="child.name" :type="child" />
    </ul>
  </div>
</template>

<script>
export default {
  props: {
    type: Object,
  },
  methods: {
    getLink(level, name) {
      // Create a dynamic link based on the level and name
      return `/animal-classification-display/${level}/${encodeURIComponent(name)}`;
    },
  },
};
</script>

<style scoped>
.animal-type {
  margin-bottom: 10px;
}

ul {
  list-style-type: none;
  margin-left: 20px;
  padding: 0;
}

/* Style for the router-link */
.router-link-active {
  font-weight: bold;
}
</style>
