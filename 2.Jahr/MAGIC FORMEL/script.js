document.getElementById("addstats").addEventListener("click", function() {
    let height = document.getElementById("height").value;
    let weight = document.getElementById("weight").value;
    console.log(weight, height);

    number = ((height * 1.43) / weight) - 3.4;
    console.log(number);

    // document.getElementById("ausgabe").innerHTML = ausgeben();
    if (number > 0) {
        for (let index = 0; index < number; index++) {
            console.log(index);

        }
    } else {
        for (let index = 0; index > number; index--) {
            console.log(index);

        }
    }



});