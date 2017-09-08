var express = require("express");
var mysql = require("mysql");
var app = express();
app.use(express.static(__dirname+"/../Node_MySQLData"));
var connection = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"demo"
});
connection.connect();

app.get("/products",function (req,res) {
    connection.query("select * from products",function (err,recordsArray,fields) {
            res.send(recordsArray);
    });
});

app.listen(8080);
console.log("Server Listening the port no.8080");