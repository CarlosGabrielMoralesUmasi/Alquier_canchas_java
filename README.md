# Sistema de Alquiler de Canchas de Fútbol

## Descripción

Este proyecto es una aplicación de escritorio desarrollada en Java que permite gestionar el alquiler de canchas de fútbol. Los usuarios pueden registrarse, realizar reservas, y consultar la disponibilidad de las canchas. La interfaz gráfica fue implementada utilizando Swing, y los datos se almacenan en una base de datos MySQL.

## Características

- **Registro de Usuarios**: Los usuarios pueden registrarse con su nombre y número de teléfono.
- **Gestión de Reservas**: Los usuarios pueden reservar canchas de fútbol, especificando la fecha, hora de inicio y duración de la reserva.
- **Consulta de Horarios Disponibles**: Los usuarios pueden consultar la disponibilidad de las canchas para una fecha específica.
- **Escalabilidad**: Soporte para agregar o remover canchas de fútbol según sea necesario.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Swing**: Biblioteca gráfica utilizada para construir la interfaz de usuario.
- **MySQL**: Sistema de gestión de bases de datos relacional para el almacenamiento de datos.
- **JDBC**: API utilizada para conectar la aplicación Java con la base de datos MySQL.

## Requisitos

- **Java JDK 8 o superior**
- **MySQL 5.7 o superior**
- **Conector JDBC para MySQL** (Versión 8.0.26 utilizada en este proyecto)

## Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/CarlosGabrielMoralesUmasi/Alquier_canchas_java
   cd nombre_del_repositorio
   ```
1. **Configurar la base de datos MySQL:**

Crear la base de datos y las tablas necesarias utilizando el script SQL proporcionado.

Configurar el proyecto en Eclipse o en tu IDE preferido:

- Importar el proyecto.
- Agregar el archivo mysql-connector-java-8.0.26.jar al Build Path.
Compilar y ejecutar:

- Desde Eclipse, selecciona MainFrame.java y ejecútalo como una aplicación Java.
## Uso
1. **Registrar un Usuario:**

Ingrese el nombre y número de teléfono en los campos correspondientes y haga clic en "Registrar".
2. **Realizar una Reserva:**

Seleccione una cancha, ingrese la fecha, hora de inicio y duración, luego haga clic en "Reservar".
3. **Consultar Disponibilidad:**

Ingrese la fecha y seleccione la cancha para ver los horarios disponibles.