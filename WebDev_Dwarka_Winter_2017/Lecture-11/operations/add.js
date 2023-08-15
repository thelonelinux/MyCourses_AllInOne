const express = require('express');
const app = express();
let todoArray = require('./todolist');


function addTodo(data) {

      todoArray.todolist.push(data);

      // res.status();
      return todoArray;

}

module.exports = {addTodo};
