var userSelection = -1; // Scher , 2 stein 3 papier
var botSelection = -1;

document.getElementById("Play").addEventListener("click", function() {



    checkWinner();



});

document.getElementById("Schere").addEventListener("click", function() {

    userSelection = 1;
    console.log(userSelection);
    random();


});

document.getElementById("Stein").addEventListener("click", function() {
    userSelection = 2;
    console.log(userSelection);
    random();


});

document.getElementById("Papier").addEventListener("click", function() {
    userSelection = 3;
    console.log(userSelection);
    random();


});


// document.getElementById("ausgabe").innerHTML = egrebnis();

/*
function ergebnis() {
    let html =


}
*/
function random() {
    let random = Math.floor(Math.random() * 100);

    let test = 'eror';
    let bot = 0;
    if (random > 66) {
        //schere
        botSelection = 1
    } else {
        if (random < 66 && random > 33) {
            //stein
            botSelection = 2;

        } else {
            // papier
            botSelection = 3;
        }

    }
    console.log(test);
    // console.log(Number);
}


function checkWinner() {

    if (botSelection == userSelection) {
        status = "Unentschieden";
        console.log(status);

    } else {
        if (botSelection == 1 && userSelection == 2) {
            status = "WIN";
            console.log(status);
        } else {
            if (botSelection == 2 && userSelection == 1) {
                status = "loss";
                console.log("3");

            } else {
                if (botSelection == 3 && userSelection == 1) {
                    status = "win";
                    console.log("2");
                } else {
                    if (botSelection == 1 && userSelection == 3) {
                        status = "loss";
                        console.log("3");
                    } else {
                        status = "error"
                    }
                }

            }

        }


    }

}