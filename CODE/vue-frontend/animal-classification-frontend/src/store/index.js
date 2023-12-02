import { createStore } from 'vuex';

 //创建俩个全局变量 oneAnimalType 和 twoAnimalType
 const store =  createStore({  
  state(){
    return{ 
      oneAnimalType: '动物界',
      twoAnimalType: '动物界',
      animalArray: {},
      keyValueData: {},
    };
    // oneAnimalType: '',
    // twoAnimalType: ''
  },
  mutations: {
    setOneAnimalType(state, oneAnimalType) {
      state.oneAnimalType = oneAnimalType;
    },
    setTwoAnimalType(state, twoAnimalType) {
      state.twoAnimalType = twoAnimalType;
    } ,
    addAnimal(state, animal) {
      state.animalArray.push(animal);
    },
    setKeyValueData(state, { key, value }) {
      // Store key-value data
      state.keyValueData[key] = value;
    },
  },

  //创建俩个全局方法 setOneAnimalType 和 setTwoAnimalType

  actions: {
    setOneAnimalType({ commit }, oneAnimalType) {
      commit('setOneAnimalType', oneAnimalType);
    },
    setTwoAnimalType({ commit }, twoAnimalType) {
      commit('setTwoAnimalType', twoAnimalType);
    },
    addAnimal({ commit }, animal) {
      commit('addAnimal', animal);
    },
    setKeyValueData({ commit }, { key, value }) {
      commit('setKeyValueData', { key, value });
    },
  },

  //创建俩个全局方法 getOneAnimalType 和 getTwoAnimalType

  getters: {
    getOneAnimalType(state) {
      return state.oneAnimalType;
    },
    getTwoAnimalType(state) {
      return state.twoAnimalType;
    },
    getAnimalArray(state) {
      return state.animalArray;
    }  ,  
    getKeyValueData: (state) => (key) => {
      // Retrieve key-value data
      return state.keyValueData[key];
    },
  },
  modules: {

  }
}); 

 
export default store;

