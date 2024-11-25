# ShopList_Backend

Este proyecto consiste en el backend desarrollado como un servicio web API REST basado en un anterior proyecto en el que desarrollamos el front end. El backend utiliza Spring Boot y una base de datos H2 para almacenar los datos.

## Funcionalidades

La aplicación implementa las siguientes funcionalidades de CRUD:

- **Crear**: Añadir nuevos elementos a la lista de la compra.
- **Leer**: Consultar los elementos existentes en la lista de la compra.
- **Eliminar**: Quitar elementos de la lista de la compra.

## Tecnologías utilizadas

### Frontend
El frontend está diseñado para interactuar con la API REST mediante solicitudes HTTP con HTML y Javascript.

### Backend
El backend se desarrolla con las siguientes tecnologías:

- **Spring Boot**: Framework para construir la aplicación y gestionar las dependencias.
- **Spring JDBC**: Para interactuar con la base de datos H2.
- **H2 Database**: Base de datos relacional en memoria para almacenar los datos de la lista de la compra.
- **API REST**: Implementación de endpoints para las operaciones CRUD.

## Configuración e instalación

### Prerrequisitos
- Java 21 o superior
- Maven

### Pasos
1. Clona este repositorio:
   ```bash
   git clone <url-del-repositorio>
   ```
2. Ve al directorio del proyecto:
   ```bash
   cd ShopList_Backend
   ```
3. Construye el proyecto con Maven:
   ```bash
   mvn clean install
   ```
4. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```
5. Accede a la base de datos H2 para verificar los datos:
    - URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
    - JDBC URL: `jdbc:h2:mem:list`
    - Usuario: `sa`
    - Contraseña: *sa*

### Endpoints principales
La API REST expone los siguientes endpoints:

- `GET /api/items` - Obtiene la lista de todos los elementos.
- `GET /api/items/{id}` - Obtiene los detalles de un elemento por su ID.
- `POST /api/items` - Crea un nuevo elemento en la lista.
- `DELETE /api/items/{id}` - Elimina un elemento por su ID.

### Ejemplo de entidad `Item`
```json
{
  "id": 1,
  "name": "Manzanas",
  "isBought": false
}
```

## Arquitectura del proyecto

La aplicación sigue una arquitectura en capas:

1. **Controlador (Controller)**: Gestiona las solicitudes HTTP y responde con datos o mensajes de estado.
2. **Servicio (Service)**: Contiene la lógica de negocio.
3. **Repositorio (Repository)**: Interactúa con la base de datos utilizando Spring JDBC.

## Personalización

Puedes personalizar la aplicación para adaptarla a tus necesidades específicas:

- Cambiar el esquema de la base de datos en el archivo `application.properties`.
- Extender el modelo `Item` para incluir más campos.
