# sistemas

## Descripción
`sistemas` es una aplicación web desarrollada con Spring Boot y Thymeleaf. Utiliza Tailwind CSS para el diseño y está empaquetada como un archivo WAR para su despliegue en un servidor JBoss.

## Requisitos Previos
- JDK 1.8 o superior
- Maven 3.6.0 o superior
- Node.js y npm (para compilar Tailwind CSS)

## Tecnologías Utilizadas
- Spring Boot 2.7.13
- Thymeleaf
- Tailwind CSS
- Lombok

## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/tu-usuario/appEnlaces.git
    cd appEnlaces
    ```

2. Instala las dependencias de Node.js:
    ```bash
    npm install
    ```

3. Compila los estilos de Tailwind CSS:
    ```bash
    npm run build:tailwind
    ```

4. Construye el proyecto con Maven:
    ```bash
    mvn clean package
    ```

## Despliegue

1. Copia el archivo WAR generado en `target/appEnlaces-0.0.1-SNAPSHOT.war` al directorio de despliegue de tu servidor JBoss.
2. Inicia el servidor JBoss y accede a la aplicación en `http://127.0.0.1:8080/appEnlaces`.

## Estructura del Proyecto

```plaintext
src/
├── main/
│   ├── java/
│   └── resources/
│       ├── static/
│       │   ├── css/
│       │   │   └── output.css
│       │   ├── fonts/
│       │   └── favicon.ico
│       └── templates/
├── test/
└── ...
