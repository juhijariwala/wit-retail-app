# wit-customer

ReST endpoints:
1. <b>GET localhost:8080/customer/{id}</b> - retrieve customer record associated with id
2. <b>POST localhost:8080/customer/create</b> - create new customer from form-data
3. <b>PUT localhost:8080/customer/{id}</b> - update customer record associated with id
4. <b>DELETE localhost:8080/customer/{id}</b> - delete customer record associated with id

Working with the microservice:
<pre>
    $ cd wit-customer
    $ docker-compose up --build # this starts the microservice
    ^C # abort the process
    $ docker-compose down # gracefully stop the microservice
</pre>