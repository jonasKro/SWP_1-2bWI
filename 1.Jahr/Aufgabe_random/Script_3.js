function f1(){
    let Max =document.getElementById("nummer2").value;
    let Min =document.getElementById("nummer1").value;

//let random = Math.floor(Math.random() * Max);
let random = Math.floor(Math.random() * Max) + Min;
console.log(random);
console.log(Max);
console.log(Min);
}