/**
 * Created by aayusharora on 1/27/18.
 */
const express = require('express');
const app = express();

app.use('/',express.static('public'))
app.use(function (req, res, next) {
  res.setHeader('Access-Control-Allow-Origin', '*');
  next();
});

app.get('/todos', function(req,res){
	console.log(req.query);
   res.send(req.query.todo);

	// res.send(req.query.todo.toUpperCase());
})


app.listen('4000', function(){
	console.log("Server is running on port 4000");
})

