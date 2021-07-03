{\rtf1\ansi\ansicpg949\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-Italic;\f2\fnil\fcharset129 AppleSDGothicNeo-Regular;
\f3\fnil\fcharset0 Menlo-BoldItalic;}
{\colortbl;\red255\green255\blue255;\red204\green108\blue29;\red217\green232\blue247;\red230\green230\blue250;
\red160\green160\blue160;\red18\green144\blue195;\red249\green250\blue244;\red128\green242\blue246;\red102\green225\blue248;
\red141\green218\blue248;\red23\green198\blue163;\red30\green181\blue64;\red177\green102\blue218;\red121\green171\blue255;
\red128\green128\blue128;\red242\green242\blue0;\red128\green246\blue167;\red243\green236\blue121;\red167\green236\blue33;
\red150\green236\blue63;\red205\green246\blue104;\red235\green75\blue100;\red204\green129\blue186;\red104\green151\blue187;
}
{\*\expandedcolortbl;;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c90196\c90196\c98039;
\csgenericrgb\c62745\c62745\c62745;\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c50196\c94902\c96471;\csgenericrgb\c40000\c88235\c97255;
\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c9020\c77647\c63922;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c69412\c40000\c85490;\csgenericrgb\c47451\c67059\c100000;
\csgenericrgb\c50196\c50196\c50196;\csgenericrgb\c94902\c94902\c0;\csgenericrgb\c50196\c96471\c65490;\csgenericrgb\c95294\c92549\c47451;\csgenericrgb\c65490\c92549\c12941;
\csgenericrgb\c58824\c92549\c24706;\csgenericrgb\c80392\c96471\c40784;\csgenericrgb\c92157\c29412\c39216;\csgenericrgb\c80000\c50588\c72941;\csgenericrgb\c40784\c59216\c73333;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 package\cf3  com\cf4 .\cf3 mymy\cf4 .\cf3 mymy\cf4 .\cf3 controller\cf4 ;\cf0 \
\
\cf2 import\cf3  java\cf4 .\cf3 util\cf4 .\cf3 ArrayList\cf4 ;\cf0 \
\
\cf2 import\cf3  javax\cf4 .\cf3 servlet\cf4 .\cf3 http\cf4 .\cf3 HttpServletRequest\cf4 ;\cf0 \
\cf2 import\cf3  javax\cf4 .\cf3 servlet\cf4 .\cf3 http\cf4 .\cf3 HttpSession\cf4 ;\cf0 \
\
\cf2 import\cf3  org\cf4 .\cf3 apache\cf4 .\cf3 ibatis\cf4 .\cf3 session\cf4 .\cf3 SqlSession\cf4 ;\cf0 \
\cf2 import\cf3  \ul org\cf4 \ulc4 .\cf3 \ulc3 json\cf4 \ulc4 .\cf3 \ulc3 simple\cf4 \ulc4 .\cf3 \ulc3 parser\cf4 \ulc4 .\cf3 \ulc3 JSONParser\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 beans\cf4 .\cf3 factory\cf4 .\cf3 annotation\cf4 .\cf3 Autowired\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 stereotype\cf4 .\cf3 Controller\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 ui\cf4 .\cf3 Model\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 web\cf4 .\cf3 bind\cf4 .\cf3 annotation\cf4 .\cf3 RequestMapping\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 web\cf4 .\cf3 bind\cf4 .\cf3 annotation\cf4 .\cf3 RequestMethod\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 web\cf4 .\cf3 bind\cf4 .\cf3 annotation\cf4 .\cf3 ResponseBody\cf4 ;\cf0 \
\
\cf2 import\cf3  com\cf4 .\cf3 mymy\cf4 .\cf3 mymy\cf4 .\cf3 Dao\cf4 .\cf3 Dao\cf4 ;\cf0 \
\cf2 import\cf3  com\cf4 .\cf3 mymy\cf4 .\cf3 mymy\cf4 .\cf3 Dao\cf4 .\cf3 SnsUserData\cf4 ;\cf0 \
\cf2 import\cf3  com\cf4 .\cf3 mymy\cf4 .\cf3 mymy\cf4 .\cf3 Dao\cf4 .\cf3 memberCheckDao\cf4 ;\cf0 \
\cf2 import\cf3  com\cf4 .\cf3 mymy\cf4 .\cf3 mymy\cf4 .\cf3 Dto\cf4 .\cf3 Dto\cf4 ;\cf0 \
\
\pard\pardeftab720\partightenfactor0

\f1\i \cf5 @Controller
\f0\i0 \cf0 \
\pard\pardeftab720\partightenfactor0
\cf2 public\cf3  \cf2 class\cf3  \cf6 Handler\cf0 \
\pard\pardeftab720\partightenfactor0
\cf7 \{\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 	
\f1\i \cf5 @Autowired
\f0\i0 \cf0 \
\cf3 	\cf2 private\cf3  \cf8 SqlSession\cf3  \cf9 sqlSession\cf4 ;\cf0 \
\cf3 	\cf0 \
\cf3 	\cf2 static\cf3  \cf6 String\cf3  
\f1\i \cf10 userName
\f0\i0 \cf3  \cf4 ;\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/home"\cf7 )\cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 home\cf7 ()\cf3  \cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "home"\cf4 ;\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/BoardList"\cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf3  \cf12 BaordList\cf7 (\cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf15 //1) DataBase -> Data -> model -> return View \cf0 \
\cf3 		\cf8 Dao\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 Dao\cf4 .\cf2 class\cf7 )\cf4 ;\cf3    \cf0 \
\cf3 		\cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf16 dtos\cf3  \cf4 =\cf3  \cf18 dao\cf4 .\cf17 BoardList\cf7 ()\cf4 ;\cf0 \
\cf3 		\cf14 model\cf4 .\cf17 addAttribute\cf7 (\cf11 "dtos"\cf4 ,\cf18 dtos\cf7 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 return\cf3  \cf18 dtos\cf4 ;\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 //
\f2 \'c5\'ac\'b8\'af\'c7\'d1\'b0\'d4\'bd\'c3\'b9\'b0\'c1\'b6\'c8\'b8\'c7\'cf\'b1\'e2
\f0   \ul vue\ulnone  
\f2 \'b7\'ce
\f0  \ul reuturn\ulnone  
\f2 \'c7\'d2\'b6\'a7
\f0  \ul json\ulnone  
\f2 \'b9\'e6\'bd\'c4\'c0\'b8\'b7\'ce
\f0  
\f2 \'c7\'d8\'be\'df\'c7\'d4
\f0  \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/Board_view"\cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf3  \cf12 ContentView\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf3  \cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "Content_view_Start!"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf2 int\cf3  \cf16 bId\cf3  \cf4 =\cf3  \cf6 Integer\cf4 .
\f1\i \cf20 parseInt
\f0\i0 \cf7 (\cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bId"\cf7 ))\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "bId ===>"\cf4 +\cf3  \cf18 bId\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 Dao\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 Dao\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf3  \cf16 dtos\cf4 =\cf3  \cf18 dao\cf4 .\cf17 ContentView\cf7 (\cf18 bId\cf7 )\cf4 ;\cf0 \
\cf3 		\cf15 //dao.upHit(bId);\cf0 \
\cf3 		\cf15 //JSONParser parser = new JSONParser();\cf0 \
\cf3 		\cf15 //Object \ul obj\ulnone  = parser.parse( jsonStr );\cf0 \
\cf3 		\cf14 model\cf4 .\cf17 addAttribute\cf7 (\cf11 "ContentView"\cf4 ,\cf18 dtos\cf7 )\cf4 ;\cf0 \
\cf3 		\cf2 return\cf3  \cf18 dtos\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf3   \cf0 \
\cf3 	\cf0 \
\cf3 	\cf15 /*\cf0 \
\pard\pardeftab720\partightenfactor0
\cf15 	@RequestMapping("/BoardList")\cf0 \
\cf15 	public String BaordList(Model model)\cf0 \
\cf15 	\{\cf0 \
\cf15 		//1) DataBase -> Data -> model -> return View \cf0 \
\cf15 		\ul Dao\ulnone  \ul dao\ulnone  = sqlSession.getMapper(Dao.class);   \cf0 \
\cf15 		ArrayList<Dto>\ul dtos\ulnone  = dao.BoardList();\cf0 \
\cf15 		model.addAttribute("\ul dtos\ulnone ",\ul dtos\ulnone );\cf0 \
\cf15 	\cf0 \
\cf15 		return "BoardList";\cf0 \
\cf15 	\}\cf0 \
\cf15 	*/\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 	\cf15 //
\f2 \'b1\'db
\f0  
\f2 \'c0\'db\'bc\'ba
\f0  ==> 
\f2 \'b1\'c7\'c7\'d1\'c0\'cc
\f0  
\f2 \'c0\'d6\'b4\'c2
\f0  ( 
\f2 \'b7\'ce\'b1\'d7\'c0\'ce
\f0  
\f2 \'c7\'d1
\f0  
\f2 \'c0\'af\'c0\'fa\'c7\'d1\'c5\'d7\'b8\'b8
\f0  ) \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/BoardWrite_View"\cf7 )\cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 BoardWrite_View\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf3  \cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf3  \cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf8 HttpSession\cf3  \cf16 session\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getSession\cf7 ()\cf4 ;\cf0 \
\cf3 		\cf2 if\cf7 (\cf18 session\cf4 .\cf17 getAttribute\cf7 (\cf11 "user_id"\cf7 )\cf3  \cf4 ==\cf3  \cf2 null\cf3  \cf4 ||\cf3  \cf18 session\cf4 .\cf17 getAttribute\cf7 (\cf11 "user_id"\cf7 )\cf4 .\cf21 equals\cf7 (\cf11 ""\cf7 ))\cf0 \
\cf3 		\cf7 \{\cf0 \
\cf3 			\cf2 return\cf3  \cf11 "doLogin"\cf4 ;\cf0 \
\cf3 			\cf0 \
\cf3 		\cf7 \}\cf0 \
\cf3 	\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "BoardWrite_View"\cf4 ;\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 //
\f2 \'b1\'db\'be\'b2\'b1\'e2\'be\'e7\'bd\'c4\'bf\'a1\'bc\'ad
\f0  POST
\f2 \'b9\'e6\'bd\'c4\'c0\'b8\'b7\'ce
\f0  
\f2 \'c0\'fc\'b4\'de\'b5\'c8
\f0  data 
\f2 \'b8\'a6
\f0  DataBase 
\f2 \'bf\'a1
\f0  Access 
\f2 \'c7\'d8\'c1\'d6\'b1\'e2
\f0  
\f2 \'c7\'d1
\f0  
\f2 \'c7\'d4\'bc\'f6
\f0 \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/Dowrite"\cf4 ,\cf22 method\cf3  \cf4 =\cf3  
\f1\i \cf23 RequestMethod
\f0\i0 \cf4 .
\f3\i\b \cf10 POST
\f0\i0\b0 \cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 Dowrite\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "Dowrite Start! =============="\cf7 )\cf4 ;\cf0 \
\cf3 		\cf15 //view => \ul paramter\ulnone  => handler \cf0 \
\cf3 		\cf6 String\cf3  \cf16 bTitle\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bTitle"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 bTitle\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bName\cf3  \cf4 =\cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bName"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 bName\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bContent\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bContent"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 bContent\cf7 )\cf4 ;\cf0 \
\cf3 		\cf15 //\ul mybatis\ulnone  sqlSession (AutoWired)\cf0 \
\cf3 		\cf8 Dao\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 Dao\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf18 dao\cf4 .\cf17 Dowrite\cf7 (\cf18 bTitle\cf4 ,\cf18 bName\cf4 ,\cf18 bContent\cf7 )\cf4 ;\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "redirect:BoardList"\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 // \ul kakao\ulnone  
\f2 \'b7\'ce\'b1\'d7\'c0\'ce
\f0  
\f2 \'c1\'a4\'ba\'b8
\f0  
\f2 \'c0\'fa\'c0\'e5
\f0  \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/insertuserData"\cf3  \cf4 ,\cf3  \cf22 method\cf3  \cf4 =\cf3  
\f1\i \cf23 RequestMethod
\f0\i0 \cf4 .
\f3\i\b \cf10 GET
\f0\i0\b0 \cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 insertuserData\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf3  \cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf3  \cf7 \{\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "
\f2 \'c4\'ab\'c4\'ab\'bf\'c0
\f0  
\f2 \'b7\'ce\'b1\'d7\'c0\'ce
\f0  
\f2 \'c1\'a4\'ba\'b8
\f0  
\f2 \'c0\'fc\'b4\'de
\f0 !"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 nickname\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "nickname"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 nickname\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 profile_image\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "profile_image"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 profile_image\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 thumbnail_image\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "thumbnail_image"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 thumbnail_image\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 birthday\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "birthday"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 birthday\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 gender\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "gender"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 gender\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 tokenNumber\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "tokenNumber"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "tokenNumber ======>"\cf3  \cf4 +\cf3  \cf18 tokenNumber\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 SnsUserData\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 SnsUserData\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf18 dao\cf4 .\cf17 insertSnSUserData\cf7 (\cf18 nickname\cf4 ,\cf18 profile_image\cf4 ,\cf18 thumbnail_image\cf4 ,\cf18 birthday\cf4 ,\cf18 gender\cf4 ,\cf18 tokenNumber\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "process completed"\cf7 )\cf4 ;\cf0 \
\cf3 		
\f1\i \cf10 userName
\f0\i0 \cf3  \cf4 =\cf3  \cf18 nickname\cf4 ;\cf0 \
\cf3 		\cf2 return\cf3  
\f1\i \cf10 userName
\f0\i0 \cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 // \ul kakao\ulnone  
\f2 \'b7\'ce\'b1\'d7\'c0\'ce\'c0\'bb
\f0  
\f2 \'c7\'df\'c0\'bb\'b6\'a7
\f0  , 
\f2 \'b7\'ce\'b1\'d7\'c0\'ce\'c7\'d1
\f0  
\f2 \'c0\'af\'c0\'fa\'c0\'c7
\f0  
\f2 \'b5\'a5\'c0\'cc\'c5\'cd\'b8\'a6
\f0  
\f2 \'c1\'b6\'c8\'b8\'c7\'cf\'b1\'e2
\f0  \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/selectUserData"\cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf3  \cf12 selectUserData\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf3  \cf7 )\{\cf0 \
\cf3 		\cf6 String\cf3  \cf16 tokens\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "tokens"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "nickname===> user Data 
\f2 \'c1\'b6\'c8\'b8
\f0  "\cf3  \cf4 +\cf3  \cf18 tokens\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 SnsUserData\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 SnsUserData\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf3  \cf16 dtos\cf4 =\cf3  \cf18 dao\cf4 .\cf17 selectUserData\cf7 (\cf18 tokens\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "process completed ===> select user Data"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 return\cf3  \cf18 dtos\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 //
\f2 \'c4\'ab\'c4\'ab\'bf\'c0
\f0  
\f2 \'b7\'ce\'b1\'d7\'be\'c6\'bf\'f4\'c8\'c4
\f0  , 
\f2 \'c5\'e4\'c5\'ab
\f0  
\f2 \'bb\'e8\'c1\'a6
\f0  \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/deleteToken"\cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 deleteToken\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf3  \cf7 \{\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "
\f2 \'c5\'e4\'c5\'ab\'bb\'e8\'c1\'a6
\f0 "\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "deleteToken start!"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 tokenNumber\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "tokenNumber"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "tokenNumber ====>"\cf4 +\cf18 tokenNumber\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 SnsUserData\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 SnsUserData\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf18 dao\cf4 .\cf17 tokenDelete\cf7 (\cf18 tokenNumber\cf7 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 return\cf3  \cf11 ""\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf0 \
\cf3 	\cf0 \
\cf3 	\cf15 //
\f2 \'c7\'d8\'b4\'e7
\f0  
\f2 \'b0\'d4\'bd\'c3\'b9\'b0
\f0  
\f2 \'bb\'e8\'c1\'a6\'c7\'cf\'b1\'e2
\f0  (
\f2 \'c5\'ac\'b8\'af\'c7\'d1
\f0  
\f2 \'b0\'d4\'bd\'c3\'b9\'b0\'c0\'bb
\f0  
\f2 \'bb\'e8\'c1\'a6\'c7\'cf\'b0\'ed
\f0  
\f2 \'bd\'cd\'c0\'ba\'b0\'cd
\f0  )\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/delete"\cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 delete\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf3  \cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "delete___start!!___"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bId\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bId"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 Dao\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 Dao\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf18 dao\cf4 .\cf17 delete\cf7 (\cf6 Integer\cf4 .
\f1\i \cf20 parseInt
\f0\i0 \cf7 (\cf18 bId\cf7 ))\cf4 ;\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "redirect:BoardList"\cf4 ;\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 //
\f2 \'c5\'ac\'b8\'af\'c7\'d1
\f0  , 
\f2 \'c7\'d8\'b4\'e7
\f0  
\f2 \'b0\'d4\'bd\'c3\'b9\'b0\'c0\'c7
\f0  
\f2 \'bc\'f6\'c1\'a4
\f0  
\f2 \'ba\'ce\'ba\'d0\'c0\'b8\'b7\'ce
\f0  
\f2 \'b0\'a1\'b1\'e2
\f0  \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/modify_view"\cf7 )\cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 modify_view\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf3  \cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 int\cf3  \cf16 bId\cf3  \cf4 =\cf3  \cf6 Integer\cf4 .
\f1\i \cf20 parseInt
\f0\i0 \cf7 (\cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bId"\cf7 ))\cf4 ;\cf0 \
\cf3 		\cf8 Dao\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 Dao\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 ArrayList\cf4 <\cf13 Dto\cf4 >\cf3  \cf16 dto\cf3  \cf4 =\cf3  \cf18 dao\cf4 .\cf17 ContentView\cf7 (\cf18 bId\cf7 )\cf4 ;\cf0 \
\cf3 		\cf14 model\cf4 .\cf17 addAttribute\cf7 (\cf11 "modify_view"\cf4 ,\cf3  \cf18 dto\cf7 )\cf4 ;\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "modify_view"\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/modify"\cf4 ,\cf22 method\cf3  \cf4 =\cf3  
\f1\i \cf23 RequestMethod
\f0\i0 \cf4 .
\f3\i\b \cf10 GET
\f0\i0\b0 \cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 modify\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "modify====> start!!"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf15 /*\cf0 \
\pard\pardeftab720\partightenfactor0
\cf15 		HttpSession session = req.getSession();\cf0 \
\cf15 		if(session.getAttribute("user_id") == null || session.getAttribute("user_id").equals(""))\cf0 \
\cf15 		\{\cf0 \
\cf15 			return "doLogin";\cf0 \
\cf15 			\cf0 \
\cf15 		\}\cf0 \
\cf15 		*/\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 		\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bId\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bId"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bName\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bName"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bTitle\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bTitle"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 bContent\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "bContent"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 Dao\cf3  \cf16 dao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 Dao\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf18 dao\cf4 .\cf17 modify\cf7 (\cf6 Integer\cf4 .
\f1\i \cf20 parseInt
\f0\i0 \cf7 (\cf18 bId\cf7 )\cf4 ,\cf18 bName\cf4 ,\cf18 bTitle\cf4 ,\cf18 bContent\cf7 )\cf4 ;\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "redirect:BoardList"\cf4 ;\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf15 //login page show\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/doLogin"\cf7 )\cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 doLogin\cf7 ()\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "doLogin"\cf4 ;\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf22 value\cf4 =\cf11 "/doCheckUser"\cf4 ,\cf22 method\cf3  \cf4 =\cf3  
\f1\i \cf23 RequestMethod
\f0\i0 \cf4 .
\f3\i\b \cf10 POST
\f0\i0\b0 \cf7 )\cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 doCheckUser\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf6 String\cf3  \cf16 user_id\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "user_id"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 String\cf3  \cf16 user_passowrd\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getParameter\cf7 (\cf11 "user_password"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 user_id\cf4 +\cf11 ","\cf4 +\cf18 user_passowrd\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 HttpSession\cf3  \cf16 session\cf3  \cf4 =\cf14 req\cf4 .\cf17 getSession\cf7 ()\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "check__1"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf8 memberCheckDao\cf3  \cf16 mDao\cf3  \cf4 =\cf3  \cf9 sqlSession\cf4 .\cf17 getMapper\cf7 (\cf8 memberCheckDao\cf4 .\cf2 class\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "check__2"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf2 int\cf3  \cf16 checkCount\cf3  \cf4 =\cf3  \cf18 mDao\cf4 .\cf17 UserCheckLogin\cf7 (\cf18 user_id\cf4 ,\cf18 user_passowrd\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "checkCount ---------"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 checkCount\cf7 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 if\cf7 (\cf18 checkCount\cf3  \cf4 ==\cf3  \cf24 1\cf7 )\cf0 \
\cf3 		\cf7 \{\cf0 \
\cf3 			\cf15 //login 
\f2 \'bf\'a1
\f0  
\f2 \'bc\'ba\'b0\'f8
\f0  
\f2 \'c7\'d1
\f0  
\f2 \'b0\'e6\'bf\'ec
\f0  => session 
\f2 \'bf\'a1
\f0  
\f2 \'c7\'d8\'b4\'e7\'c0\'af\'c0\'fa\'c0\'c7
\f0  id 
\f2 \'b8\'a6
\f0  
\f2 \'b4\'e3\'be\'c6\'c1\'dc
\f0  \cf0 \
\cf3 			\cf18 session\cf4 .\cf17 setAttribute\cf7 (\cf11 "user_id"\cf4 ,\cf3  \cf18 user_id\cf7 )\cf4 ;\cf0 \
\cf3 			\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf18 user_id\cf7 )\cf4 ;\cf0 \
\cf3 		\cf7 \}\cf0 \
\cf3 		\cf2 else\cf3  \cf0 \
\cf3 		\cf7 \{\cf0 \
\cf3 			\cf6 System\cf4 .
\f3\i\b \cf10 out
\f0\i0\b0 \cf4 .\cf19 println\cf7 (\cf11 "
\f2 \'b7\'ce\'b1\'d7\'c0\'ce
\f0  fail"\cf7 )\cf4 ;\cf0 \
\cf3 			\cf6 String\cf3  \cf16 msg\cf3  \cf4 =\cf3  \cf11 "
\f2 \'b0\'e8\'c1\'a4\'c0\'bb
\f0  
\f2 \'c8\'ae\'c0\'ce\'c7\'d8\'c1\'d6\'bc\'bc\'bf\'e4
\f0 ."\cf4 ;\cf0 \
\cf3 			\cf14 model\cf4 .\cf17 addAttribute\cf7 (\cf11 "
\f2 \'b0\'e8\'c1\'a4\'c0\'bb
\f0  
\f2 \'c8\'ae\'c0\'ce\'c7\'d8\'c1\'d6\'bc\'bc\'bf\'e4
\f0 "\cf4 ,\cf18 msg\cf7 )\cf4 ;\cf0 \
\cf3 			\cf14 model\cf4 .\cf17 addAttribute\cf7 (\cf11 "0"\cf4 ,\cf24 0\cf7 )\cf4 ;\cf0 \
\cf3 			\cf2 return\cf3  \cf11 "redirect:doLogin"\cf4 ;\cf0 \
\cf3 		\cf7 \}\cf0 \
\cf3 		\cf0 \
\cf3 		\cf15 //
\f2 \'bc\'ba\'b0\'f8\'bd\'c3
\f0  
\f2 \'b0\'d4\'bd\'c3\'c6\'c7
\f0  
\f2 \'b8\'f1\'b7\'cf\'c0\'b8\'b7\'ce
\f0  redirect \cf0 \
\cf3 		\cf2 return\cf3  \cf11 "redirect:BoardList"\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf0 \
\cf3 	\cf15 //logout \ul url\ulnone  \cf0 \
\cf3 	\cf15 // => logout == 
\f2 \'c7\'d8\'b4\'e7
\f0  
\f2 \'c0\'af\'c0\'fa\'c0\'c7
\f0  session
\f2 \'b2\'f7\'be\'ee\'c1\'d6\'b4\'c2
\f0  
\f2 \'c7\'e0\'c0\'a7
\f0  \cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf11 "/doLogout"\cf7 )\cf0 \
\cf3 	\cf2 public\cf3  \cf6 String\cf3  \cf12 doLogout\cf7 (\cf8 HttpServletRequest\cf3  \cf14 req\cf4 ,\cf3  \cf8 Model\cf3  \cf14 model\cf7 )\cf0 \
\cf3 	\cf7 \{\cf0 \
\cf3 		\cf8 HttpSession\cf3  \cf16 session\cf3  \cf4 =\cf3  \cf14 req\cf4 .\cf17 getSession\cf7 ()\cf4 ;\cf0 \
\cf3 		\cf18 session\cf4 .\cf17 invalidate\cf7 ()\cf4 ;\cf0 \
\cf3 		\cf14 model\cf4 .\cf17 addAttribute\cf7 (\cf11 "logout"\cf4 ,\cf11 "Y"\cf7 )\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 		\cf0 \
\cf3 		\cf2 return\cf3  \cf11 "redirect:BoardList"\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf0 \
\cf3 	\cf0 \
\cf3 	\cf0 \
\pard\pardeftab720\partightenfactor0
\cf7 \}\cf0 \
}