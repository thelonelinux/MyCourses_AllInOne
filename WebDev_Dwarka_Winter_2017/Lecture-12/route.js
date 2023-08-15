const route = require('express').Router();
const database = require('./db.js');


route.get('/add', function(req, res){	
   database.addTodo(req.query.todo, req.query.done);
   res.sendStatus(200);
})

module.exports= {
	route
}