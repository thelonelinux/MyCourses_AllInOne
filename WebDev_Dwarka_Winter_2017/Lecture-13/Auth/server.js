const express = require('express');
const app = express();
const request = require('request');
let CLIENTID = 'fe8e4d44283444069fd616883c481791';
let REDIRECTURI = 'http://localhost:8080/insta'

let url = `https://api.instagram.com/oauth/authorize/?client_id=${CLIENTID}&redirect_uri=${REDIRECTURI}&response_type=code`


app.get('/', function(req, res){
	res.redirect(url)
})

app.get('/insta', function(req, res){
	 console.log(req.query.code);
	res.sendStatus(200);
})
app.listen(8080, function(){
	console.log("Server is running on 8080");
})