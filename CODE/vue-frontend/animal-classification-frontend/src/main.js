import router from './router';
import { createApp } from 'vue'
import App from './App.vue'
import  store  from './store/index'

createApp(App).use(router).use(store).mount('#app')
