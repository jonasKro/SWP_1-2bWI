import Actor from "./Actor.js"

export default class Rectangle extends Actor {
    render() {
        console.log("render")
    }
    update() {
        console.log("update")
    }
}