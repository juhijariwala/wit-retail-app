#!/usr/bin/bash

set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
	CREATE TABLE customer(
     id serial PRIMARY KEY,
     name VARCHAR (255) NOT NULL,
     email_address VARCHAR (355) UNIQUE NOT NULL,
     password VARCHAR (255) NOT NULL,
     mobile_number VARCHAR(15) NOT NULL
    );
EOSQL