<!-- src/components/LeftSidebar.vue -->
<template>
  <div class="left-sidebar">
    <!-- <router-link to="/animal-classification-display">Animal Classification </router-link> -->
    <router-link to="/animal-classification-display">动物种类 </router-link>
    <router-link to="/animal-classification-display">动物检索 </router-link>
    <router-link to="/animal-classification-display">常见动物 </router-link>
    <router-link to="/animal-classification-display">稀有动物 </router-link>
    <!-- <router-view name="animal-classification-display">动物种类</router-view> -->
    <!-- Your other left sidebar content here -->
  </div>
</template>

<style scoped>
/* Add your left sidebar styles here */
.left-sidebar {
  background-color: rgb(253, 250, 250);
  width: 120px;
  padding: 10px;
}

/* Style for router links */
a {
  color: #333;
  text-decoration: none;
  display: block;
  margin-bottom: 10px;
}


.left-sidebar {
  padding: 50px; /* Add 20px of padding to the top and left */
}

.left-sidebar a {
  color: #666; /* Medium gray color for links */
  text-decoration: none; /* Remove underline from links */
  display: inline-block; /* Needed to add padding */
  transition: background-color 0.3s ease; /* Smooth transition for hover effect */
  padding: 10px 50px; /* Increase padding to make the oval shape more visible */
  border-radius: 50px; /* Make the background an oval shape */
  /* 限制背景块高度为一行 */
  height: 20px; 
  /* 文字显示在一行 */
  white-space: nowrap;
}

.left-sidebar a:hover {
  background-color: #b8b6b6; /* Gray background color on hover */
  color: #fff; /* White text color on hover */
}

.left-sidebar {
  /* ... */
  border-right: 1px solid #aaa7a7; /* Add a black right border to the left sidebar */
}
</style>
