var misc = require('./misc');
var events = require('events')
var util = require('util')

var Person = function(name){
    this.name = name;
};

var ram = new Person('james');
var sita = new Person('sita');
var laxman = new Person('laxman');

var people = [ram, sita, laxman];

util.inherits(Person, events.EventEmitter);

people.forEach(function(person){
    person.on('speak',function(message){
        console.log (person.name + ' said ' + message);
    });
});

ram.emit('speak', 'I want to go to jungle');
