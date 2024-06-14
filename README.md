NOTE : This program uses mariadb Dependency.

This is a spring boot Reactive CRUD  API that manages Teachers Attendence in a university and performs taskes on the database

Some changes you have to do in the program are to run on your system are :-

<1>: go to src/main/resources/application.properties and change your databse name ( spring.r2dbc.url=r2dbc:mariadb://127.0.0.1:3306/(your database name) )

<2>: in the same file change your password to your mariadb password ( spring.r2dbc.password=(mariadb password) )

THE PROGRAM IS TESTED AND VERIFIED ON POSTMAN AND ON ANY BROWSER. DOCUMENTATION FOR THE PROGRAM IS CAN BE SEEN OR TESTED ON SWAGGER.

(.jar) is also included that can be posted on AWS.

so change the above following according to your ec2 instance's mariadb before deploying.
