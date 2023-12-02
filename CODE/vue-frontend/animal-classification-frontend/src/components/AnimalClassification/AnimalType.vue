<!-- src/components/AnimalType.vue -->
<template>
  <div   class="animal-type">
    <p>
      <router-link :to="getLink(type.level, type.name)"  @click="handleMouseOver(type)">
        {{ type.name }}
      </router-link>
    </p>
    <ul>
      <AnimalType  :initialLevel="type.level"  v-for="child in type.children" :key="child.name" :type="child" />
    </ul>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex';

export default {
  computed: {
    ...mapState(['oneAnimalType', 'twoAnimalType'])
  },
  data() {
    return {
      mouseOverCount: 0,
      rootNode: {
      type: String, 
    },
    i:0,
    index:0,
    tempNameStepOne:{
      type: String, 
    },
    tempNameStepTwo:{
      type: String, 
    },
    };
  },
  props: {
    initialLevel: {
      type: String,
      required: true,
    },
    type: Object,
  },
  methods: {

    ...mapActions(['setOneAnimalType', 'setTwoAnimalType', 'addAnimal', 'setKeyValueData','getKeyValueData']),


    handleMouseOver(type) {
      this.$emit('name-clicked',type);

      


      if(type.level==='Kingdom'||type.level==='Phylum'){
        let ftype ={
          name: '动物界',
          level: 'Phylum',
          children: [],
        };

        this.$store.commit('setKeyValueData', { key: type.name, value: ftype });
        this.tempNameStepOne=type;
      }else{

        
          // this.$store.commit('setKeyValueData', { key: type.name, value: this.tempNameStepOne });
          if(this.rootNode && this.rootNode.level===type.level ){
            // this.$store.commit('setKeyValueData', { key: type.name, value: this.$store.state.keyValueData[type.name] });
            // this.rootNode = this.$store.state.keyValueData[type.name];
            console.log("1"+this.$store.state.keyValueData[type.name].name);
            this.tempNameStepTwo=this.$store.state.keyValueData[this.$store.state.keyValueData[type.name].name];
            console.log("2"+this.tempNameStepTwo.name );
          }else{
            this.$store.commit('setKeyValueData', { key: type.name, value: this.tempNameStepOne });
            this.tempNameStepTwo=this.$store.state.keyValueData[type.name];
            console.log("3"+this.tempNameStepTwo.name );
          }
      
          
          this.tempNameStepOne=type;
      }
      this.rootNode = type;
      


      if (this.$parent && this.$parent.handleMouseOver) {
      this.$parent.handleMouseOver(type);
    }

    this.$nextTick(() => {
      this.getLink();
    });
    this.mouseOverCount++;
    },
     
    getLink(level, name) {
 
  

 if (level === 'Species') {
   return `/species-display`;
 }else if(this.rootNode && this.rootNode.level===level ){
   name = this.$store.state.twoAnimalType;
 
   

   if(level==='Kingdom'){
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
     return { path: `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
   }
   if(level==='Phylum'){
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
     return `/animal-classification-display/Kingdom/${encodeURIComponent("动物界")}`;
   }
  
   if(level==='Subphylum'){
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
     return `/animal-classification-display/Phylum/${encodeURIComponent(this.tempNameStepTwo.name)}`;
   }    
   if(level==='Class'){
    return { path: `/animal-classification-display/Subphylum/${encodeURIComponent(this.tempNameStepTwo.name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
    //  return `/animal-classification-display/Subphylum/${encodeURIComponent(this.tempNameStepTwo.name)}`;
   }  
   if(level==='Order'){
    console.log("4"+this.tempNameStepTwo.name );
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
    //  let path = `/animal-classification-display/Class/${encodeURIComponent(this.tempNameStepTwo.name)}`;

     return { path: `/animal-classification-display/Class/${encodeURIComponent(this.tempNameStepTwo.name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
    //   console.log("5"+path );
    //  return path;
   }    
   if(level==='Family'){
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
     return { path: `/animal-classification-display/Order/${encodeURIComponent(this.tempNameStepTwo.name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
    //  return `/animal-classification-display/Order/${encodeURIComponent(this.tempNameStepTwo.name)}`;
   } 
   if(level==='Genus'){
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
     return { path: `/animal-classification-display/Family/${encodeURIComponent(this.tempNameStepTwo.name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
    //  return `/animal-classification-display/Family/${encodeURIComponent(this.tempNameStepTwo.name)}`;
   } 
   if(level==='Species'){
    return { path: `/animal-classification-display/Genus/${encodeURIComponent(this.tempNameStepTwo.name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
     // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
    //  return `/animal-classification-display/Genus/${encodeURIComponent(this.tempNameStepTwo.name)}`;
   }             
   // if(level=='Kingdom'){
   //   // return `/animal-classification-display/Kingdom/${encodeURIComponent(name)}`;
    
     // return `/animal-classification-display/${this.rootNode.level}/${encodeURIComponent(name)}`;
   // }
 } else {
  this.mouseOverCount++;
  return { path: `/animal-classification-display/${level}/${encodeURIComponent(name)}`, query: { mouseOverCount: this.mouseOverCount } }; 
     
  //  return `/animal-classification-display/${level}/${encodeURIComponent(name)}`;
 }

},

    created() {
    this.rootNode = this.initialLevel;

   },
  //  mounted() {
  //   this.setOneAnimalType('value');
  //   console.log("============"+this.getOneAnimalType());
  // },
   mounted() {
    this.setOneAnimalType('value');
    console.log("============"+this.getOneAnimalType());
  },
  },
 
};
</script>

<style scoped>
.animal-type {
  margin-left: 50px; /* Increase the left margin by 30px */
  /* margin-top: 10px; Increase the top margin by 30px */
  /* ... other styles ... */
  line-height: 10px; 
}

ul {
  list-style-type: none;
  padding-left: 1rem;
}

ul li {
  margin-bottom: 0.5rem;
}

ul li a {
  text-decoration: none;
  color: #000;
}

ul li a:hover {
  color: #00f;
}

ul li a.active {
  color: #f00;
}

ul li a.active:hover {
  color: #f00;
}

ul li a.active:visited {
  color: #f00;
}

ul li a.active:visited:hover {
  color: #f00;
}

ul li a:visited {
  color: #000;
}

ul li a:visited:hover {
  color: #00f;
}

ul li a:visited.active {
  color: #f00;
}

ul li a:visited.active:hover {
  color: #f00;
}

ul li a:visited.active:visited {
  color: #f00;
}

ul li a:visited.active:visited:hover {
  color: #f00;
}
 
a{text-decoration:none;}

/* //调整文字颜色为灰白色系和文字大小 */

a:link{color:#666666; font-size:12px;}

a:visited{color:#666666; font-size:12px;}

a:hover{color:#FF0000; font-size:12px;}

a:active{color:#FF0000; font-size:12px;}


</style>
