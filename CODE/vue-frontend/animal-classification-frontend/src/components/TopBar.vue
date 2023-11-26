<!-- src/components/TopBar.vue -->
<template>
  <div class="top-bar">
    <div class="left-content">
      <!-- Your logo and user info here -->
      <div class="logo">Your Logo</div>
    </div>
    <div class="right-content">
      <!-- Registration and login navigation links -->
      <div class="user-info">User Info</div>
      
      <router-link to="/register">Register</router-link>
      <!-- 关联到Login.vue -->
      <router-link to="/login">Login</router-link>
      <!-- You can customize these links and styles as needed -->
    </div>
  </div>
</template>

<style scoped>
/* Add your top bar styles here */
.top-bar {
  background-color: #333;
  color: white;
  padding: 10px;
  display: flex;
  justify-content: space-between;
}

.left-content {
  display: flex;
  align-items: center;
}

.right-content {
  display: flex;
  align-items: center;
}

.logo {
  margin-right: 10px;
}

.user-info {
  margin-right: 20px;
}

/* Style for router links */
a {
  color: white;
  text-decoration: none;
  margin-left: 10px;
}
</style>
