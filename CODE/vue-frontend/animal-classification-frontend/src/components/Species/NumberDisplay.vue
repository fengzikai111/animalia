<template>
  <div class="number-display">
    <span class="number">{{ number }}</span>
  </div>
</template>

<script>
export default {
  name: 'NumberDisplay',
  props: {
    number: {
      type: Number,
      required: true
    }
  }
}
</script>

<style scoped>
.number-display {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100px;
  height: 100px;
  border: 1px solid black;
}

.number {
  font-size: 24px;
  font-weight: bold;
}
</style>
