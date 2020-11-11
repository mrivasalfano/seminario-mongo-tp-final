[Volver a README](README.md)

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
| POST   | /productos/      | Agrega un producto **(1)**      |
| PUT    | /productos/      | Actualiza un producto **(2)**   |
| DELETE | /productos/{id}  | Elimina un producto             |
| GET    | /ventas/         | Lista todas las ventas          |
| POST   | /ventas/         | Agrega una venta **(3)**        |

**(1)** En el body iría un JSON con este formato ignorando el ID ya que se autogenera:

```
{  
    "nombre": "Ejemplo",  
    "stock": 99,  
    "precio": 59.99  
}
```

**(2)** Parecido al POST solo que el ID sí lo tenemos:

```
{  
    "id": "5fac70a3fd2c1206abb48a91",  
    "nombre": "Ejemplo",  
    "stock": 999,  
    "precio": 9999.99  
}
```

**(3)** El JSON a enviar tiene este formato:

```
{
    "productos": [{
        "producto": {
            "id": "5fac70a3fd2c1206abb48a91",
            "nombre": "Ejemplo",
            "stock": 999,
            "precio": 9999.99
        },
        "cantidad": 5
    }],
    "direccionEntrega": "Av.Belgrano 1001"
}
```
