const sql = require('mysql');

let config = {
	"host": 'localhost',
	"user": 'aayush',
	"password": '1234',
	"database": 'tasks'
}

let connection = sql.createConnection(config);

function connect(){
	connection.connect();
}

function addTodo(task, done) {
  let query = `Insert into todos(task, done) values(${task}, ${done})`;
  connection.query(query, function(err, data){
     if (err) throw err;
     console.log(data);
  }) 
}

module.exports = {
	connect,
	addTodo
}


