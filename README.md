# TestBackend

Este es un proyecto que implementa una API RESTful para gestionar artículos. El proyecto está desarrollado utilizando Spring Boot, H2 como base de datos en memoria, 
y Swagger para la documentación automática de la API.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot**: Para la creación del backend.
- **Spring Data JPA**: Para la interacción con la base de datos.
- **H2 Database**: Base de datos en memoria (contiene datos precargados)
- **Swagger/OpenAPI**: Documentación interactiva de la API.
- **Maven/Gradle**: Gestión de dependencias.
- **Lombok**: Para reducir el boilerplate en el código.
  
## Requisitos previos

- **Java 17**
- **Gradle**
  
# Acceso a Swagger y H2

### Swagger (Documentación interactiva de la API)

Una vez que la aplicación esté en funcionamiento, puedes acceder a la documentación de la API 
generada por Swagger en la siguiente URL: http://localhost:8080/swagger-ui.html
Aquí podrás interactuar con los endpoints y ver detalles adicionales de la API.

### Consola H2
La consola de la base de datos H2 está disponible en: http://localhost:8080/h2-console
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Usuario**: `sa`
- **Contraseña**: `password`

### Coleccion Postman
La colección de Postman para probar la API está disponible en el siguiente enlace: https://hackmd.io/@Ldv8oGabSc6rgt4ESaSfFA/BJx2SWt0R
