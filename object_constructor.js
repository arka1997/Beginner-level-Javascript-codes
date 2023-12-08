Number.prototype.myMethod = function() {
  return this.valueOf() / 2;
};

function myFunction() {
  var n = 55;
  console.log(n.myMethod());
}

function ball(){
  this.color = "blue";
}
var newobj = new ball();
ball.prototype.test= "hii";
ball.__proto__.test = "hlw";
console.log(newobj.test);

//prototype method//
//this function is one way to declare properties
function animal(){
  this.height = 5;
  this.color = "yellow";
}
//this below statement is used to declare properties in a different manner
 animal.prototype.test2 = function(){
   console.log(this.color);
 };
 var newobj2 = new animal();//storing the animal object in a new object called "newobj2" and the animal function is called//
//so while creating the animal object, another object is also created called the prototype object, with the help of it we create our own properties or mehods i anotheer way

 console.log(newobj2.test2);
function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
}

Person.prototype.name = function() {
  return this.firstName + " " + this.lastName
};

var myFather = new Person("John", "Doe", 50, "blue");
console.log(myFather.name);

function PrintStuff (myDocuments) {
  this.documents = myDocuments;
  }
  
  // We add the print () method to PrintStuff prototype property so that other instances (objects) can inherit it:
  PrintStuff.prototype.print = function () {
  console.log(this.documents);
  }