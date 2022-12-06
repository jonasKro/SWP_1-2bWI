import Rectangle from "./actors/rectangle.js";
const actors = [];
actors.push(new Rectangle());
actors.push(new Rectangle());


setInterval(function() {
    console.log("geo");
    actors.forEach(actor => {
        actor.update()

    });

}, 1000);