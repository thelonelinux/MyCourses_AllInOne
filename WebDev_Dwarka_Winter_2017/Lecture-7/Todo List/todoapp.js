/**
 * Created by aayusharora on 12/31/17.
 */

var global = {};
window.onload = function() {
    let inp = document.getElementById('inp');
    let result = document.getElementById('result');
    let btn = document.getElementById('btn');

    let todoList = [];
    btn.onclick = function() {

        let task = {
            "task": inp.value,
            "done": false
        }

        todoList.push(task);
        global.todoList = todoList;
        display();
    };

    function display() {
        let finalList = "";
        for(let i=0; i<todoList.length; i++) {

            finalList += `<li>
                            <span>
                               <input onclick="toggle(this)" id="i${i}" type="checkbox">
                           </span>
                            <span id="${i}">${todoList[i].task}</span>
                          </li>`
        }
        result.innerHTML = "";
        result.innerHTML = finalList;

    }


};

function toggle(el){
    let id = el.id.substr(1);
    global.todoList[id].done = !global.todoList[id].done;
    let checked = global.todoList[id].done;
    strikeOff(checked, id);

}

function strikeOff(check, id){
    let el = document.getElementById(id);
    if(check) {
        console.log(check, id);
        el.style.textDecoration = 'line-through'
    }
    else {
        el.style.textDecoration = 'none';
    }
}