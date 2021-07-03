<template>
  <div class="container">
 <div class="list-group" id="boardList">
  <h1> vue 게시판 </h1>
  <div class="image_items">
  <img src="https://upload.wikimedia.org/wikipedia/commons/f/f1/Vue.png">
  </div>
  <a v-for="board in data.boardList" v-bind:key="board.boardSequence" class="list-group-item list-group-item-action active" aria-current="true">
    <div class="d-flex w-100 justify-content-between">
      <small>번호 : {{board.bId}}</small>
      <!--
      <a :href="'/Board_view?bId=' + board.bId">{{board.bId}}</a>
      -->
      <h5 class="mb-1"><a :href="'/Board_view?bId=' + board.bId" >제목 : {{board.bTitle}}</a> </h5>
      <small>글쓴이 : {{board.bName}}</small>
      <small>조회수 : {{board.bHit}}</small>
      <small>날짜 : {{board.bDate}}</small>
    </div>
    
  </a>

  <a v-if="data.boardList.length == 0" class="list-group-item list-group-item-action">
      게시물이 존재하지않습니다.
  </a>

</div>
<!-- pageNation Area! -->
<div class="paging">
<nav aria-label="...">
  <ul class="pagination">
    <li class="page-item disabled">
      <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item active" aria-current="page">
      <a class="page-link" href="#">2</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#">Next</a>
    </li>
  </ul>
</nav>
</div>
</div>
</template>

<script>
import { reactive } from '@vue/reactivity'
import axios from 'axios'
export default {
  created(){
    
  },
  mounted(){
    //alert("mounted!");
  },

  data(){
    
  },
  computed: {

  },
  name: 'App',
  components: {
  },
  setup () {
    const data = reactive({
      boardList: []
    })
    // spring rest api 를 call 하여 data list 를 select
    const getList = () => {
      // fetch('데이터를 가져오기 위해 호출할 back-end 쪽의 rest api')
      axios.get('http://localhost:8082/mymy/BoardList')
        .then(res => {
          console.log(res)// data
          data.boardList = res.data
        })
    }
    console.log(getList())// undefined
    return {
      data: data,
      getList: getList
    }
  }
}
</script>

<style>
a{
  text-decoration: none;
  color:white;
}
.container{
  width:1300px;
}
.image_items img{
  width:8%;
}
.paging{
  width:300px;
  margin:0 auto;
  margin-top:30px;

}
.boardList{
  border-radius: 10px;
}
@import 'https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css'
</style>

