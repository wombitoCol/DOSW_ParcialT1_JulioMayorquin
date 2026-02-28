# DOSW_ParcialT1_JulioMayorquin
## Primer punto 
![alt text](https://github.com/wombitoCol/DOSW_ParcialT1_JulioMayorquin/blob/develop/DOSW-ParcialT1/docs/uml/image-1.png)
## Segundo punto
En el caso de estudio podemos utilizar los siguientes dos patrones de diseño:
### Factory (Creacional)
Este lo podemos utilizar ya que necesitamos crear diferentes tipos de eventos y el metodo factory ya que tengo una super clase la cual va a ser los eventos y unas subclases que seran los eventos especificos, entonces diagamos que la superclase va creando el vento que yo quiera en este caso digamos una conferencia entonces la subclase conferencia le pide a la superclase eventos que cree un objeto evento esto es muy util ya que podemos crear varios tipos de eventos bien encapsulados y extensible porque si quiero crear un nuevo tipo de evento solo creo una nueva subclase con el nuevo evento.
### Adapter (Estructural)
Adapter nos es muy util ya que podemos ver que estamos utilizando diferentes sistemas en este caso el sistema academico y sistema RRHH, en estos podemos utilizar un adapter el cual sera un metodo que "traduzca" los datos que les da este sistema a nuestro aplicativo EventSync. 
## Tercer Punto 
### Requerimientos Funcionales
- Crear eventos segun su tipo. (Factory)
- Registrar inscripcion de asistentes. (Adapter)
- Notificiacion de cambios a los inscritos. 
### Requerimientos No Funcionales 
- La aplicacion debe tener el tipo de fuente Arial 12.
- La apliacacion muestra a los usuarios los cambios de fechas en la interfaz con un color rojo.
## Cuarto Punto 
![alt text](https://github.com/wombitoCol/DOSW_ParcialT1_JulioMayorquin/blob/develop/DOSW-ParcialT1/docs/uml/newCaseUsesDiagram.png)
### Primer Caso de uso 
- COMO usuario de EventSync profesor
- QUIERO poder registrar nuevos eventos en una interfaz que me permita ingresar su tipo, fecha y cupo, a la vez de poder Inscribirme en estas.
- PARA que la comunidad de la universidad se puedan enterar e inscribirse si les interesa
### Segundo caso de uso 
- COMO usuario de EventSync Estudiante. 
- QUIERO poder consultar en la pagina principal la fecha de un evento al que este registrado.
- PARA poder ver si se a modificado la fecha de realizacion del evento.
### Tercer Caso de uso
- COMO usuario de EventSync Administrativo.
- QUIERO poder registrar nuevos eventos en una interfaz que me permita ingresar su tipo, fecha y cupo.
- PARA que estudiantes y profesores puedan ingresar a eventos especiales.
## Quinto Punto
Ir al directorio del proyecto
DOSW-ParcialT1/docs/requirements
## Sexto Punto
### Epica
Gestionar eventos academicos del campus.
### features
Usuarios de la universidad piden opciones para crear, inscribir y consultar eventos.
### Historia de usuario 
Los usuarios deben tener la capacidad de registrar un evento con una cierta cantidad de especificaciones.
Los usuarios deben terner la capacidad de Inscribirse en un evento existente.
Los usuarios deben poder consultar las fechas y horarios de los eventos.
### Tareas 
- Crear eventos.
- A estos eventos darle unas caracteristicas.
- Ver si el usuario lo puede crear.
- Al crearlo verificar si es posible.
- Crear el evento.
#### segunda tarea
- Verificar usuario
- verificar tarea existente
- Inscribir y llenar cupo
#### Tercera tarea 
- Funcion usuario ver sus inscripciones
- En funcion agregar fecha y hora del evento en tiempo real 
## Septimo punto
![alt text](image.png)