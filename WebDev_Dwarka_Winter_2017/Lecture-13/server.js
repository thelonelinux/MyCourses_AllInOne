/**
 * Created by aayusharora on 2/3/18.
 */
const express = require('express');
const app = express();
const database = require('./db.js');
const router = require('./route.js');
const bodyParser = require('body-parser');

console.log(router.route);

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())
 
app.use('/todos', router.route);

let port = 5000 || process.env.PORT;

app.listen(port, function(){
	
   console.log("Server is running on port on " + port);
   database.connect();
})

