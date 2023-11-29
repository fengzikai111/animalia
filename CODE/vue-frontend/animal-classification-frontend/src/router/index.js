// src/router/index.js
import Vue from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';
import Register from '../views/Register.vue';
import Login from '../views/Login.vue';
import CreateCategory from '../components/AnimalClassification/CreateCategory.vue';
import AnimalClassificationDisplay from '../components/AnimalClassification/AnimalClassificationDisplay.vue';
import AnimalClassificationTable from '../components/AnimalClassification/AnimalClassificationTable.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: Home },
    { path: '/register', component: Register },
    { path: '/login', component: Login },
    { path: '/create-category', component: CreateCategory },
    { path: '/animal-classification-display', component: AnimalClassificationDisplay },
    { path: '/animal-classification-table', component: AnimalClassificationTable },    
    // Add more routes as needed
  ],
});


export default router;
