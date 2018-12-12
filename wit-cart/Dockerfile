FROM java:8
COPY . /usr/share/service
WORKDIR /usr/share/service
RUN ./mvnw clean install
ENTRYPOINT java -jar /usr/share/service/wit-cart/target/wit-cart-RELEASE.jar --server.port=8094
