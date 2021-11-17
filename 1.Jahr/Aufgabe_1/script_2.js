
function f1(){
   let n1 = document.getElementById("nummer1").value;
   let n2 = document.getElementById("nummer2").value;

   console.log(n1);
   console.log(n2);
}

function add(){
    let n1 = parseInt(document.getElementById("nummer1").value);
    let n2 = parseInt(document.getElementById("nummer2").value);
    let ergebnis = n1 + n2;
    console.log(ergebnis);
}

function subtract(){
    let n1 = parseInt(document.getElementById("nummer1").value);
    let n2 = parseInt(document.getElementById("nummer2").value);
    let ergebnis = n1 - n2;
    console.log(ergebnis);
}

function divide(){
    let n1 = parseInt(document.getElementById("nummer1").value);
    let n2 = parseInt(document.getElementById("nummer2").value);
    let ergebnis = n1 / n2;
    console.log(ergebnis);
}

function multiply(){
    let n1 = parseInt(document.getElementById("nummer1").value);
    let n2 = parseInt(document.getElementById("nummer2").value);
    let ergebnis = n1 * n2;
    console.log(ergebnis);
}

function comp(){
    let n1 = parseInt(document.getElementById("nummer1").value);
    let n2 = parseInt(document.getElementById("nummer2").value);
    let n3 = parseInt(document.getElementById("nummer3").value);
    let n4 = parseInt(document.getElementById("nummer4").value);
    let n5 = parseInt(document.getElementById("nummer5").value);
    let n6 = parseInt(document.getElementById("nummer6").value);
}
function highest(){
    comp()
    console.log(math.max(n1,n2,n3))
  
}
