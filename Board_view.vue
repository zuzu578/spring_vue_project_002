<template>
<h1>게시판 상세보기</h1>
<div class="board_view_area" v-for="(user, idx) in boardData" :key="idx">

    <div class="board_title">
        <h1><small>  {{user.bTitle}}</small></h1>
    
    </div>
    <div class="board_date">
    <small>날짜 : {{user.bDate}}</small>
    </div>
    
    <div class="board_user_name">
    <small>글쓴이 : {{user.bName}}</small>
    </div>
    <div class="board_number">
    <small >게시물 번호 : {{user.bId}}</small>
    </div>
    <div class="board_hit_count">
    <small>조회수 : {{user.bHit}}</small>
    </div>
    <div class="board_content">
    <small>{{user.bContent}}</small>
    </div>
    <div class="btnWrap">

<button type="button" @click="doModify()" id="modify" class="btn btn-primary"><a :href="'/modify_view?bId=' + user.bId" >수정</a></button>
<button type="button" @click="doDelete()" id ="delete" class="btn btn-dark">삭제</button>

</div>	

</div>





</template>

<script>

import axios from 'axios'
export default {

data() {
return {
    accessToken:window.Kakao.Auth.getAccessToken(),
    body:this.$route.query
    ,bId:this.$route.query.bId // => 게시물 시퀀스 
    ,boardData : ''
    ,bName :''
    /*
    ,bName:'' // => 사용자 이름
    ,bTitle:'' // => 제목 
    ,bContent:'' // => 내용
    ,bDate: '' // => 날짜
    ,bHit:''   // => 조회수 
    */
    
}
}

,created() {
/*
인스턴스가 작성된 후 동기적으로 호출됩니다.
    이 단계에서 인스턴스는 데이터 처리, 
    계산된 속성, 메서드, 감시/이벤트 콜백 등과
    같은 옵션 처리를 완료합니다. 그
    러나 마운트가 시작되지 않았으므로 $el 속성을 아직 사용할 수 없습니다.
*/

}

,mounted() {

this.fnGetView();
}

,methods:{
//게시물 상세 내용 보기 
fnGetView() {
    var bId = this.bId;
    axios.get('http://localhost:8082/mymy/Board_view',{
    params: {
        bId : bId
    }
})
    //promise ==> 비동기 처리에 사용되는 객체 
    // 비동기 ex) 1) ajax , 2) callback , 3) promise 
    //promise 는 어떻게 보면 예외처리 를 해줄수있는 과정 이라고 할수도 있다 
    //promise 
    //ex) backend  ==> data ==> front ==> 
    //data failed === > promise X ===> 아무런 효과가 없음 (에러도 안뜸)
    // promise 
    .then((res)=>{
            
        console.log(res);
        this.boardData =res.data;
        console.log("boardData!!!"+ this.boardData);
        console.log("bName ===>" + res.data.bName);
        /*
        ,bName:'' // => 사용자 이름
        ,bTitle:'' // => 제목 
        ,bContent:'' // => 내용
        ,bDate: '' // => 날짜
        ,bHit:'' 
        */
    })
    .catch((err)=>{
        console.log(err);
    })
}
,doDelete(){
    const tokens = this.accessToken;
//alert(tokens);
if(!tokens){
//
console.log("로그인안됨.");
alert("권한이 없습니다.");
return false;
}else{
    var bId = this.bId; //==> 게시물 sequence
    console.log(bId);
    console.log(this.boardData.bName);
    var Q1 = confirm("게시물을 삭제할까요?");
    if(!Q1){
        alert("게시물 삭제를 취소합니다.");
        return false;
    }else{
        alert("게시물을 삭제합니다.");
            axios.get('http://localhost:8082/mymy/delete',{
            params: {
            bId : bId
    }
})
//promise
    .then((res)=>{
        console.log(res)
        if(res.data.success){
            //
            // window.location.href = "/";
        }else{
            alert("삭제되었습니다.");
            window.location.href = "/";
        }
    })

    }
        }

}
,
doModify(){
    //<a :href="'/modify_view?bId=' + user.bId" >
       const tokens = this.accessToken;
//alert(tokens);
    if(!tokens){
        alert("권한이 없습니다.");
        return false;
    }
}
  }
 }
</script>

<style scoped>
a{
text-decoration: none;
color:white;
}
.board_view_area{
width:1000px;
margin:0 auto;

}
.board_title{
text-align: left;
}
.board_date{
text-align: right;
font-size:20px;
font-weight: bold;
}
.board_user_name{
text-align: left;
font-size:20px;
font-weight:bold;

}
.board_number{
text-align: left;
font-size: 20px;
font-weight: bold;
}
.board_hit_count{
text-align: left;
font-size: 20px;
font-weight: bold;
}
.board_content{
text-align: left;
font-size:20px;
height:auto;
}
.button_area{
text-align: right;
margin-top:100px;

}
.btnWrap{
text-align: right;
margin-top:150px;


}
@import 'https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css';
</style>