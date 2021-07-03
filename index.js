import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/Board_view',
    name: 'Board_view',
    propse: true,
    component: () => import('../views/Board_view.vue'),
  },
  {
    path: '/BoardWrite_View',
    name: 'BoardWriteView',
    propse: true,
    component: () => import('../views/BoardWrite_View.vue'),
  },
  {
    path:'/modify_view',
    name: 'modify_view',
    propse: true,
    component: () => import('../views/modify_view.vue'),
  },
  {
    path:'/doLogin',
    name: 'doLogin',
    propose: true,
    component: () => import('../views/doLogin.vue'),
    },
    {
      path:'/successLogin',
      name: 'successLogin',
      propose : true,
      component: () => import('../views/successLogin.vue')
    },
    {
      path:'/dologout',
      name:'dologout',
      propose:true,
      component: () => import('../views/dologout.vue')
    },
    {
      path:'/vuetify',
      name:'vuetify',
      propose: true,
      component: () => import('../views/vuetifyex.vue')
    }


]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
