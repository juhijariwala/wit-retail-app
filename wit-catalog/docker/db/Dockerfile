FROM mysql/mysql-server

ENV MYSQL_USER catalog
ENV MYSQL_PASSWORD catalog
ENV MYSQL_DATABASE catalog

COPY ./seed.sql /docker-entrypoint-initdb.d/

EXPOSE 3306
