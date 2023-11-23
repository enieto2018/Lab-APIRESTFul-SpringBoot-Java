# Lab-APIRESTFul-SpringBoot-Java
Proyecto Biblioteca APIRESTFul SpringBoot con Java

Java
Version 17
https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html

Spring Boot
Version 3.1.5
https://start.spring.io/

Mysql 8.2.0
https://dev.mysql.com/downloads/mysql/

Consumo de servivio por postman
localhost:8081/api/v1/biblioteca/libros
Ejemplo POST LIBRO
{
    "isbn": "10554",
    "nombre": "La noche",
    "editorial": "Santa",
    "genero": "F",
    "numeroPaginas": 15,
    "precio" : 3885.60,
    "fechaEdicion" : "2023-11-20",
    "idAutor" : 3
}
localhost:8081/api/v1/biblioteca/autores
Ejemplo POST AUTOR
{
    "nombres" : "Maria",
    "apellidos" : "Porras",
    "telefono" : "31598"
}


