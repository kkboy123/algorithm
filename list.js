/**
 * Created by KKBOY on 2016/2/25.
 */
//https://developer.mozilla.org/zh-TW/docs/Web/JavaScript/Reference/Global_Objects/Array/push
var obj = {
    length: 0,

    push: function add (elem) {
        // obj.length is automatically incremented every time an element is added.
        [].push.call(this, elem);
    },

    pop: function remove (){
        return [].pop.call(this);
    }
};

obj.push(1);
obj.push('a');
console.log(obj);
console.log(obj.length);

x = obj.pop();
console.log(obj);
console.log(obj.length);
console.log(x);


var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Kiwi");
console.log(fruits);
fruits.pop();
console.log(fruits);
