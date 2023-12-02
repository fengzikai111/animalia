// src/router/index.js
import Vue from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';
import Register from '../views/Register.vue';
import Login from '../views/Login.vue';
import CreateCategory from '../components/AnimalClassification/CreateCategory.vue';
import AnimalClassificationDisplay from '../components/AnimalClassification/AnimalClassificationDisplay.vue';
import AnimalClassificationTable from '../components/AnimalClassification/AnimalClassificationTable.vue';
import SpeciesDisplay from '../components/Species/SpeciesDisplay.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: Home },
    { path: '/register', component: Register },
    { path: '/login', component: Login },
    { path: '/create-category', component: CreateCategory },
    { path: '/animal-classification-display', component: AnimalClassificationDisplay },
    {
      path: '/animal-classification-display/:level/:name',
      name: 'AnimalClassificationDisplay',
      component: AnimalClassificationDisplay,
      props: true,
    },
    { path: '/animal-classification-table', component: AnimalClassificationTable },    
    // Add more routes as needed
    // add route to SpeciesDisplay.vue配置route 代码
    { path: '/species-display', component: SpeciesDisplay },
    

  ],
});


export default router;
