FROM java:8

COPY ../../target/wit-catalog.jar /usr/share/service/wit-catalog.jar

WORKDIR /usr/share/service

CMD java -jar wit-catalog.jar --server.port=8091
