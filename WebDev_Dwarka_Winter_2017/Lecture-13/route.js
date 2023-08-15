const route = require('express').Router();
const database = require('./db.js');


route.post('/add', function(req, res){	
   database.addTodo(req.body.todo, req.body.done);
   res.sendStatus(200);
})

module.exports= {
	route
}