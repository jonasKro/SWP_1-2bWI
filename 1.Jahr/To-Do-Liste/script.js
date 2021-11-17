const tasks = ["putzen", "tankzen", "kochen"];
console.log(tasks);


printTasklist();


document.getElementById("addtask").addEventListener("click", function() {

    let newtask = document.getElementById("txtNewTask").value;
    tasks.push(newtask);
    printTasklist();
});

function printTasklist() {

    document.getElementById("tasklist").innerHTML = getHTMLTasks();
}

function getHTMLTasks() {
    let html = "";
    tasks.forEach(element => {
        html += "<li>" + element + "</li>";

    });

    return html;
}