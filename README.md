# jee-basics-rest

This application is suppose to run in wildfly in default configurations

Setting up project

0. SET A DATASOURCE IN THE WILDFLY SERVER FOLLOWING THIS [TUTORIAL](https://tomylab.wordpress.com/2016/07/24/how-to-add-a-datasource-to-wildfly/)

1. START A DOCKER MYSQL IMAGE AND CREATE THE FOLLOWING MYSQL TABLE IN THE wildfly1 DATABASE

```shell
docker run --name mysql1 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=12345678 -d mysql:latestdo
```

```SQL
CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
)
```
