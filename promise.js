//Example 1
// function func1(){
//     return new Promise(function( resolve, reject){//declaring a constructor promise, followed by a call back function with two parameters, resolve & reject, which will either solve the error, or show an error
//     setTimeout(() => {
//         const error = true;
//     if(!error)
// {
//     console.log("problem has been resolved");
//     resolve();
// }
// else{
//     console.log("There is an error");
//     reject();
// }
//     }, 2000);
// }) 
// };
// func1().then(function(){//here in func1, if there is no error, "then", we can execute the following function
//     console.log("ok! problem solved");
// })
// .catch(function(){//In catch function the else part or error part is called
//     console.log("Fuck off!");
// })

//EXAMPLE 2
const students = [
    {name:"Harry",
    subject: "java"},
    {name : "tuban",
    subject: "geo",}
]
function enrollStudent(student){
    return new Promise(function(resolve,reject){
        setTimeout(function(){
            students.push(student);
            console.log("Student has been enrolled");
            const error= false;
            if(!error){
                console.log("Enrolling successful");
                resolve();
            }
            else{
                console.log("there is an error");
                reject();
            }
        }, 2000);
    })
}
function getstudent() {
    setTimeout(function () {
        let str = "";
        students.forEach(function (student) {
            str += `<li> ${student.name}</li>`
        });
        document.getElementById('students').innerHTML = str;
        console.log("Students have been fetched");
    }, 1000);
}
let newStudent = { name: "Sunny", subject: "Python" }
enrollStudent(newStudent).then(getstudent).catch(function () {
    console.log("Some error occured");
});
// getStudents();

// function inside then is ran as - resolve()
// function inside catch is ran as - reject()
let promise = new promise(f(r,r){ resolve(param) or reject(kjk)})
promisefunc().then()
promisefunc(){
    return new Promise
}
