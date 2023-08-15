	const express = require('express');
	const app = express();
	const mongo = require('./database.js');

    
   app.listen(5000, function(){
   	   mongo.connect();
   })