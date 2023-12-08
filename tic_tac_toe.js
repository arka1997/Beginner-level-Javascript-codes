var turn = 0;
document.getElementById("container").addEventListener('click', function(e){
    console.log(e);
    if(turn === 0){
        e.target.style.backgroundImage = "url('cros2.png')";
        e.target.style.backgroundSize = '100% 100%';
        turn=1;//here turn is used, one time for cross, and another time for circle
    }
    else{
        e.target.style.backgroundImage = "url('cir1.png')";
        e.target.style.backgroundSize = '100% 100%';
        turn=0;
    }
    //turn = 1-turn;
})
// var turn=0;
// document.getElementById(container).addEventListener('click', function(e){
//     if(turn===0)
//     e.style.baclground="url('jhkjh')"
//     e,style.backgroundsize:aut
//     else
// })
var add = (function () {
    var counter = 0;
    return function () {counter += 1; return counter;}
  });
  
  function myFunction(){
    document.getElementById("demo").innerHTML = add();
  }