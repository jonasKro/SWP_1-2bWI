var userSelection = -1; // Scher , 2 stei 3 papie
var botSelection = -1;
var d = new Date(day);
var day = d.getDate();
console.log(day);


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
    console.log(botSelection);
    console.log(userSelection);

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
                console.log(status);

            } else {
                if (botSelection == 3 && userSelection == 1) {
                    status = "win";
                    console.log(status);
                } else {
                    if (botSelection == 1 && userSelection == 3) {
                        status = "loss";
                        console.log(status);
                    } else {
                        if (botSelection == 2 && userSelection == 3) {
                            status = "loss";
                            console.log(status);
                        } else {
                            if (botSelection == 3 && userSelection == 2) {
                                status = "loss";
                                console.log(status);
                            }
                        }
                    }
                }

            }

        }


    }

    alert(status);
}