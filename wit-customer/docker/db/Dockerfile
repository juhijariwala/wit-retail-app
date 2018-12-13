FROM postgres:latest

ENV POSTGRES_USER customer
ENV POSTGRES_PASSWORD customer
ENV POSTGRES_DB customer

COPY ./setup.sh /docker-entrypoint-initdb.d/init-user-db.sh
