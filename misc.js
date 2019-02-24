var counter = function(arr){
    return 'There are ' + arr.length + ' elements';
};

var adder = function(a, b){
    return 'The sum of these two numbers is ' + `${a+b}`;
};


module.exports = {
    counter: counter,
    adder: adder
};