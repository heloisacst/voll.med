# voll.med
This project involves building a CRUD application using Spring Boot and RESTful APIs. The initial development was based on an online course (Alura), and I have since added additional functionality to the project on my own.

## Installation

1. Make sure you have the IntelliJ IDEA or another IDE of your preference installed.
2. A framework for development and testing of APIs/Clients is necessary. (e.g., Insomnia, Postman, etc).
3. MySQL (It will be necessary to execute the SQL file `create-table-pacientes.sql`).

## Endpoints

### POST, PUT

1. URLs: http://localhost:8080/medicos / http://localhost:8080/pacientes
2. Text: JSON
3. JSON Content: To get started the project, you can use the files `PacienteFirstRegistration.json` and `MedicoFirstRegistration.json`.

### GET

1. URLs: http://localhost:8080/medicos / http://localhost:8080/pacientes

### DELETE

1. URLs: http://localhost:8080/medicos / http://localhost:8080/pacientes
2. For the delete method, it is essential to inform the id in the URL.
