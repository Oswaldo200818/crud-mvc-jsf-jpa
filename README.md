# crud-mvc-jsf-jpa

Introducción Crud: Insertar, Editar, Actualizar, Eliminar. Aplicando modelo vista controlador.
Instalación:

Netbeans 12.0
JDK 8
Glassfish Server 5.0
JDBC 8.25
Base de Datos Mysql
Conexión Base de datos Configuración en servidor Glassfish, ir a:

JDBC JDBC Connection Pools new
Pool name: vacunacionPool
Resource Type: javax.sql.ConnectionPoolDataSource
Database Driver Vendor: Mysql
Hacer clic: Next Add Property
password: admin321
databaseName: vacunacion
serverName: localhost
dataSourceName: com.mysql.cj.jdbc.MysqlDataSource
user: root
portNumber: 3306
useSSL: false
useTimezone: true
serverTimezone: UTC
allowPublicKeyRetrieval: true
Hacer clic: Save
JDBC Resources JDBC Connection Pools new
JNDI Name: jdbc/vacunacionDb
Pool Name: vacunacionPool
Save
*JDBC Connection Pools -> ping -> Ping Succeeded * para continuar.

Creación proyecto IDE Netbeans

New Proyect ->Java with Maven -> Web Application -> nombreProyecto Vacunacion -> next -> Java EE y Glassfish 5.0 -> finish.
Abrir proyecto Vacunacion, ir a:
Agregar en archivo** pom** las siguientes Librerías:

Java Persistencia API
org.eclipse.persistence
Mysql Conector
org. primefaces
Other Sources -> src/main/sources -> META -> persistence.xml agregar siguiente código, dentro del archivo.

<jta-data-source>jdbc/vacunacionDb</jta-data-source>
</persistence-unit>
clic derecho sobre el proyecyo y Clean and Build.

Generación de capas
Vista
lógica de negocio
persistencia


###End
