## Como levantar el proyecto
  
> Expandir el proyecto hasta llegar a `SeminarioMongoTpFinalApplication.java`. Dar click derecho al archivo y seleccionar `Run As` -> `java Application`.  
  
![Paso 1](/img/image8.png)  
  
> Se vera como corre la aplicacion en un servidor `Tomcat` en el `puerto: 8080`. Podemos usar la URL: `localhost:8080` para empezar a consumir la API.  
  
![Paso 2](/img/image17.png)  

> Al ir a un navegador de internet como por ejemplo el Chrome, ponemos en la URL: `localhost:8080` y si nos muestra un mensaje como se ve en la imagen la aplicacion esta corriendo correctamente.  
  
![Paso 3](/img/image21.png)

La API cuenta con los siguientes recursos:

| Método | ENDPOINT         | Descripción                     |
|--------|------------------|---------------------------------|
| GET    | /productos/      | Lista todos los productos       |
| GET    | /productos/{id}/ | Lista un producto en particular |
| POST   | /productos/      | Agrega un producto              |
| PUT    | /productos/      | Actualiza un producto           |
| DELETE | /productos/      | Elimina un producto             |
| GET    | /ventas/         | Lista todas las ventas          |
| POST   | /ventas/         | Agrega una venta                |
