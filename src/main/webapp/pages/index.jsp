<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<div class="container">
    <div id="app">
        <user-app :users="users"></user-app>
    </div>
    <div id="app1">
        <router-link to="/json">Go to json</router-link>
    </div>
</div>

<script src="../js/vue.js"></script>
<script src="../js/vue-resource.js"></script>
<script src="../js/vue-router.js"></script>
<script>
    const Json = {template: '<div>json</div>'};
    const routes = [{path: 'json', component: Json}];
    const router = new VueRouter({
        routes: routes
    });
    const app = new Vue({
        router: routes
    }).$mount('#app1');
    var demo = new Vue({
        el: '#app',
        data: {
            users: '',
        },
        components: {
            "user-app": {
                template: "<ul><li v-for=\"user in users\"><span>{{user.id}}</span> <span>{{user.username}}</span></li></ul>",
                props: ['users']
            }
        },
        mounted: function () {
            this.$nextTick(function () {
                this.$http.get('json').then(function (res) {
                    this.users = res.data;
                }).catch(function (res) {
                    console.log(res);
                })
            })
        },
    });
</script>
</body>
</html>