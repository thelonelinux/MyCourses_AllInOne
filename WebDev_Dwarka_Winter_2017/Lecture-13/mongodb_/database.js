
const mongo = require('mongodb').MongoClient;
const dbname = 'shoppingcart';
const url = "mongodb://localhost:27017";
let db;
let collection;

function connect() {
    mongo.connect(url, function(err, client) {
      console.log("Connected Successfully");
      db = client.db(dbname);
      collection = db.collection('main');
      update(client);

      
    })
  }

function find(client) {

    collection.find({}).toArray(function(err, docs) {
    console.log("Found the following records");
    console.log(docs)
    client.close();
  });
}

function update(client) {
  collection.updateMany({ac:2}, 
     {$set: {ab: 20}},
     function(err, res){
        find(client);
     }

    )

}

function insertDocument(client) {
    	
    	collection.insertMany([  {ab : 1}, {ac : 2}, {ad : 3}], 
        function(err, result){
             // console.log(result);
             
             update(client);
             
             
    	})
    }

    module.exports = {
      connect
    }
