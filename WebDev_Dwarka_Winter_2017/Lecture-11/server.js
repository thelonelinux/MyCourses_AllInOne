const express = require('express');
const bodyParser = require('body-parser')
const app = express();
const operations = require('./operations');
let todoArray = require('./operations/todolist');


console.log(operations);

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use('/', express.static('public'));

app.post('/add', function(req, res){

   operations.operation.add.addTodo(req.body.data);
    res.send(todoArray); 
	
})
// Correct

app.get('/todolist', function(req,res){
	res.send(todoArray);
})

app.listen('5000', function(){
	console.log("Server is running");
})