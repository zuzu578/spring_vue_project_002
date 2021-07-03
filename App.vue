<template>
  <div id="nav">
    <a href="/">메인 페이지</a> |

    <span @click="myPage()"> 
    나의정보 </span>
     |
    
    <span @click="Dowrite()"> 글 작성 </span> | <!--/BoardWrite_View -->
    <a href="/doLogin" v-if="accessToken.length== 0">
    로그인 하러가기
     </a> 
     <span @click="doLogout()" v-else>
     로그아웃 하기 |
     </span> 
     
   
   
  </div>
  <router-view/>
</template>
<script>
import axios from 'axios'
export default {
  data() {
		return {
			accessToken:window.Kakao.Auth.getAccessToken(),
			
		}
	},
  created(){
  },
  methods :{
    doLogout() {
      //logout 하는 방법 
      //1 ) api 에서 가져온 로그인 해서 가져온 토큰을 해제해주면 세션이 끊김
        if (window.Kakao.Auth.getAccessToken()) {
        window.Kakao.API.request({
          url: '/v1/user/unlink',
          success: function (response) {
            console.log(response)
          },
          fail: function (error) {
            console.log(error)
          },
        })
        
      }
        alert("로그아웃 되었습니다.");
        console.log("로그아웃을 위한 토큰출력"+window.Kakao.Auth.getAccessToken())
        const tokenNumber = window.Kakao.Auth.getAccessToken();
        console.log(tokenNumber);
        // ! => 토큰을 서버에 보내고 해당 토큰 삭제 후 토큰제거 
         axios.get('http://localhost:8082/mymy/deleteToken',{
                    params: {
                      tokenNumber : tokenNumber,  
            }
          })
          //토큰 제거 
          window.Kakao.Auth.setAccessToken(undefined)
          window.location.href ='/';

    },
    Dowrite(){
      const tokens = this.accessToken;
      //alert(tokens);
      if(!tokens){
        alert("로그인 해주세요.");
        window.location.href = '/doLogin';
      }else{
        window.location.href = '/BoardWrite_View';
      }
    },
      myPage(){
      
       const tokens = this.accessToken;
       //alert(tokens);
      if(!tokens){
        alert("로그인을 해주세요.");
        window.location.href  = '/doLogin'
       
      }else{
         window.location.href = '/about';
        
      }
    }
    
  }
}
</script>

<style>
.log_out{
  cursor: pointer;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
