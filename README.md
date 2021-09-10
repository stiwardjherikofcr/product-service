# Microservice with Spring Boot & Spring Cloud

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Descripción Y Contexto

En este proyecto trabajaremos con Spring Boot y con Spring Cloud. Mediante a estos dos módulos de Spring, crearemos un CRUD REST SERVICE mediante a JPA y al motor de BBDD H2.

## Requirements

- Java 11
- Spring Boot 2.5.4
- Gradle
- H2 Database


# Microservice Product


## GET

listProduct

    --request GET http://localhost:8091/products

listProductCategoryId

    --request GET http://localhost:8091/products?categoryId=1

getProduct

    --request GET http://localhost:8091/products/1


## POST

createProduct

    --request POST 'localhost:8091/products' \
    --header 'Content-Type: application/json' \
    --data-raw '{
            "name":"Wallabee Men'\''s Suede Shoe",
            "description":"Comfort and tendency do not have to be at odds. This suede wallabee style shoe is all you need for marathon work days. With soft suede design and stitched details, it is perfect to combine with jeans",
            "stock":4,
            "price":30,
            "category":{
                "id":1,
                "name": "shoes"
                }
            }'


## PUT

updateCustomer

    --request PUT 'localhost:8091/products/4' \
    --header 'Content-Type: application/json' \
    --data-raw '{
            "name":"Wallabee Men'\''s Suede Shoe",
            "description":"Comfort and tendency do not have to be at odds. This suede wallabee style shoe is all you need for marathon work days. With soft suede design and stitched details, it is perfect to combine with jeans",
            "stock":4,
            "price":30,
            "category":{
                "id":1,
                "name": "shoes"
                }
            }'


## DELETE

    --request DELETE http://localhost:8091/products/1


## Autor

**Stiward Jherikof Carrillo Ramírez - Desarrollador**

-   <https://gitlab.com/stiwardjherikofcr>


## Institución Académica

[Programa de Ingeniería de Sistemas] de la [Universidad Francisco de Paula Santander]

[Programa de Ingeniería de Sistemas]: https://ingsistemas.cloud.ufps.edu.co/
[Universidad Francisco de Paula Santander]: https://ww2.ufps.edu.co/