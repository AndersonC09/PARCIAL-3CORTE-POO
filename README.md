GestionAeropuertos tiene como objetivo gestionar datos relacionados con aeropuertos, vuelos y compañías aéreas. La clase carga datos de ejemplo y proporciona métodos para mostrar los vuelos de salida y llegada de cada aeropuerto.
Atributos
•	aeropuertos: Lista estática que almacena objetos de tipo Aeropuerto.
•	vuelos: Lista estática que almacena objetos de tipo Vuelo.
•	companias: Lista estática que almacena objetos de tipo Compania.
Métodos Principales
1.	Método main
o	Este es el punto de entrada del programa. Llama a otros métodos para cargar datos y mostrar información sobre vuelos.
o	Llama a cargarDatos(), mostrarVuelosSalida() y mostrarVuelosLlegada().
2.	Método cargarDatos
o	Carga datos de ejemplo en las listas aeropuertos, vuelos y companias.
o	Añade aeropuertos a la lista aeropuertos.
o	Crea objetos Vuelo y los añade a la lista vuelos, asociándolos con aeropuertos y compañías existentes o nuevos.
3.	Método buscarAeropuerto
o	Busca un aeropuerto por su código en la lista aeropuertos.
o	Devuelve el aeropuerto si lo encuentra, de lo contrario, devuelve null.
4.	Método buscarOcrearCompania
o	Busca una compañía por su nombre en la lista companias.
o	Si la compañía existe, la devuelve. Si no, crea una nueva compañía, la añade a la lista y luego la devuelve.
5.	Método mostrarVuelosSalida
o	Muestra todos los vuelos de salida desde cada aeropuerto.
o	Recorre la lista aeropuertos y para cada aeropuerto, imprime los vuelos cuya origen coincide con ese aeropuerto.
6.	Método mostrarVuelosLlegada
o	Muestra todos los vuelos de llegada a cada aeropuerto.
o	Recorre la lista aeropuertos y para cada aeropuerto, imprime los vuelos cuya destino coincide con ese aeropuerto.


Compania :representa una compañía aérea con un solo atributo: su nombre.
Atributos
•	nombre: Un atributo de tipo String que almacena el nombre de la compañía.
Constructores
•	Constructor Compania(String nombre)
o	Este constructor recibe un parámetro nombre y lo asigna al atributo nombre de la instancia de Compania.
o	Permite crear un objeto Compania con un nombre específico.
Métodos
1.	Getter getNombre
o	Devuelve el valor del atributo nombre.
o	Permite acceder al nombre de la compañía desde fuera de la clase.
2.	Setter setNombre
o	Establece el valor del atributo nombre.
o	Permite cambiar el nombre de la compañía desde fuera de la clase.




3.	Método toString
o	Sobrescribe el método toString de la clase Object.
o	Devuelve una representación en forma de cadena del objeto Compania, incluyendo el nombre.
o	Este método es útil para imprimir el objeto Compania de una manera legible.
Vuelo: representa un vuelo aéreo con varios atributos, incluyendo el tipo de vuelo, origen, destino, duración, compañía, tipo de avión, capacidad y horario.
Atributos
•	tipo: Un atributo de tipo String que almacena el tipo de vuelo (por ejemplo, "R" para regular o "C" para chárter).
•	origen: Un objeto de tipo Aeropuerto que representa el aeropuerto de origen del vuelo.
•	destino: Un objeto de tipo Aeropuerto que representa el aeropuerto de destino del vuelo.
•	duracion: Un atributo de tipo String que almacena la duración del vuelo.
•	compania: Un objeto de tipo Compania que representa la compañía aérea que opera el vuelo.
•	tipoAvion: Un atributo de tipo String que almacena el tipo de avión utilizado en el vuelo.
•	capacidad: Un atributo de tipo int que representa la capacidad del avión en términos de número de pasajeros.
•	horario: Un atributo de tipo String que almacena el horario del vuelo.
Constructores
•	Constructor Vuelo
o	Este constructor recibe parámetros para inicializar todos los atributos de la clase.
o	Permite crear un objeto Vuelo con todos los detalles especificados.
Métodos
1.	Getters
o	getTipo: Devuelve el tipo de vuelo.
o	getOrigen: Devuelve el aeropuerto de origen.
o	getDestino: Devuelve el aeropuerto de destino.
o	getDuracion: Devuelve la duración del vuelo.
o	getCompania: Devuelve la compañía aérea del vuelo.
o	getTipoAvion: Devuelve el tipo de avión del vuelo.
o	getCapacidad: Devuelve la capacidad del avión.
o	getHorario: Devuelve el horario del vuelo.
2.	Setters
o	setTipo: Establece el tipo de vuelo.
o	setOrigen: Establece el aeropuerto de origen.
o	setDestino: Establece el aeropuerto de destino.
o	setDuracion: Establece la duración del vuelo.
o	setCompania: Establece la compañía aérea del vuelo.
o	setTipoAvion: Establece el tipo de avión del vuelo.
o	setCapacidad: Establece la capacidad del avión.
o	setHorario: Establece el horario del vuelo.
3.	Método toString
o	Sobrescribe el método toString de la clase Object.
o	Devuelve una representación en forma de cadena del objeto Vuelo, incluyendo todos sus atributos.
o	Este método es útil para imprimir el objeto Vuelo de una manera legible.



Aeropuerto: representa un aeropuerto con varios atributos, incluyendo un código, nombre, población, país y GMT (Greenwich Mean Time, el desfase horario respecto al meridiano de Greenwich).
Atributos
•	codigo: Un atributo de tipo String que almacena el código del aeropuerto.
•	nombre: Un atributo de tipo String que almacena el nombre del aeropuerto.
•	poblacion: Un atributo de tipo String que almacena la población donde se encuentra el aeropuerto.
•	pais: Un atributo de tipo String que almacena el país donde se encuentra el aeropuerto.
•	gmt: Un atributo de tipo int que almacena el desfase horario del aeropuerto respecto al GMT.
Constructores
•	Constructor Aeropuerto
o	Este constructor recibe parámetros para inicializar todos los atributos de la clase.
o	Permite crear un objeto Aeropuerto con todos los detalles especificados.
Métodos
1.	Getters
o	getCodigo: Devuelve el código del aeropuerto.
o	getNombre: Devuelve el nombre del aeropuerto.
o	getPoblacion: Devuelve la población donde se encuentra el aeropuerto.
o	getPais: Devuelve el país donde se encuentra el aeropuerto.
o	getGmt: Devuelve el desfase horario del aeropuerto respecto al GMT.
2.	Setters
o	setCodigo: Establece el código del aeropuerto.
o	setNombre: Establece el nombre del aeropuerto.
o	setPoblacion: Establece la población donde se encuentra el aeropuerto.
o	setPais: Establece el país donde se encuentra el aeropuerto.
o	setGmt: Establece el desfase horario del aeropuerto respecto al GMT.
3.	Método toString
o	Sobrescribe el método toString de la clase Object.
o	Devuelve una representación en forma de cadena del objeto Aeropuerto, incluyendo todos sus atributos.
o	Este método es útil para imprimir el objeto Aeropuerto de una manera legible.



