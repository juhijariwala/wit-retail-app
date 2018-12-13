FROM java:8

COPY ../../target/wit-customer.jar /usr/share/service/wit-customer.jar

WORKDIR /usr/share/service

CMD java -jar /usr/share/service/wit-customer.jar --server.port=8092
