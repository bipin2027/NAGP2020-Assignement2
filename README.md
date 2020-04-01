# NAGP2020-Assignement2

Create 3 microservices (in language of your choice):-

o User Service – Will provide a REST endpoint giving details of user (it should return your name and email id, no need to integrate any database or logic)

§ GET /user/1

{

"name": "John",

"age": "23",

"email": "john.doe@google.com"

}

o Orders Service – Will give a list of all orders of a user. (it should return a predefined list, no database needed)

§ GET /orders/1

{

"orders": [

{

"orderId": 1,

"orderAmount": 250,

"orderDate": "14-Apr-2020"

},

{

"orderId": 2,

"orderAmount": 450,

"orderDate": "15-Apr-2020"

}

]

}

o Aggregator Service – Will aggregate the response from user and orders service to give following response (should get data from user and order service’s rest endpoint)

§ GET /orderdetails/1

{

"userDetails": {

"name": "John",

"age": "23",

"email": "john.doe@google.com"

},

"orders": [

{

"orderId": 1,

"orderAmount": 250,

"orderDate": "14-Apr-2020"

},

{

"orderId": 2,

"orderAmount": 450,

"orderDate": "15-Apr-2020"

}

]

}