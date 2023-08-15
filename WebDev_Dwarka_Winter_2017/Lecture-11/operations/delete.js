const express = require('express');
const app = express();

function deleteTodo() {

	app.post('/delete', function(req,res) {
    todoArray.splice(req.body.id, 1)
    res.send(todoArray);
   })
}

module.exports = {deleteTodo};