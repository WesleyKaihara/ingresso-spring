FROM mysql:8.0.16

ENV MYSQL_ROOT_PASSWORD ingressoDB
COPY ./schema.sql /docker-entrypoint-initdb.d/schema.sql
