# TALLER 3

## Description
Este programa crea un objeto URL e imprima en pantalla cada uno de los componentes de una URL. Es decir, getProtocol, getAuthority, getHost, getPort, getPath, getQuery, getFile, getRef.

Tambien contiene una aplicación browser que dada una URL lee datos de la dirección y los almacene en un archivo con el nombre resultado.html.

Ademas tiene un servidor que recibe un número y responde el cuadrado de este número.

Por ultimo tiene un servidor web que soporte múltiples solicitudes seguidas (no concurrentes). El servidor retorna archivos.

Esto corresponde a:

```
EJERCICIO 1
Escriba un programa en el cual usted cree un objeto URL e imprima en pantalla cada uno de los componentes de una URL. Es decir , debe usar los siguientes métodos: getProtocol, getAuthority, getHost, getPort, getPath, getQuery, getFile, getRef. Asegúrese que ninguno imprima una cadena vacía, esto implica que la URL que use para su objeto debe contener datos suficientes.

EJERCICIO 2
Escriba una aplicación browser que dada una URL lea datos de esa dirección y que los almacene en un archivo con el nombre resultado.html. Intente ver este archivo en el navegador. Su implementación debe ser un programa que reciba el parámetro de URL por medio de la línea de comandos.

Ejercicio 3
Usando sockets escriba un servidor que reciba un número y responda el cuadrado de este número. Escriba un cliente para probarlo y envíele una secuencia de 20 números.

Reto 1
Escriba un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos los archivos solicitados, incluyendo páginas html e imágenes. Construya un sitio web con javascript para probar su servidor. Despliegue su solución en Heroku.
```

## Getting Started
Esta aplicacion esta [desplegada con herku](https://arep-lab03.herokuapp.com/), el link de la aplicacion es [https://arep-lab03.herokuapp.com/](https://arep-lab03.herokuapp.com/).

## Use
Para usar esta aplicacion es necesario descargar el repositorio de github y poner a correr las diferentes clases para utilizar las utilidades que tiene, este codigo se puede compilar mediante cualquier compilador que soporte maven.

## Heroku

[Link de heroku](https://dashboard.heroku.com/apps/arep-lab03)

## CircleCi

[![CircleCI](https://circleci.com/gh/eocampo2728/AREP-Lab03.svg?style=svg)](https://circleci.com/gh/eocampo2728/AREP-Lab03)

## License

MIT lices, para mas informacion de la licensia revisar el archivo LICENSE.

## Autor
Eduardo Ocampo

## Build With
Esta aplicacion web fue creado en Java.
