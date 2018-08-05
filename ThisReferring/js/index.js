　　
var name = "The Window";　　
var object = {
    name: "My Object",
    getNameFunc: function() {
        return function() { return this.name; };
        //this引用丢失，指向全局作用域，弹出The Window

        // var that = this; 
        // return function() { return that.name; };
        //形成闭包，指向getNameFunc，弹出My Object
    }
};　　
alert(object.getNameFunc()());


var fnArr = [];
for (let i = 0; i < 10; i++) {
    fnArr[i] = function() {
        return i;
    };
}
console.log(fnArr[3]());