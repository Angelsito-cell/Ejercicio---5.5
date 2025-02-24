sealed class Usuario(val id: String, val nombre: String)

class Estudiante(id: String, nombre: String, val carrera: String) : Usuario(id, nombre)
class Profesor(id: String, nombre: String, val departamento: String) : Usuario(id, nombre)
class Visitante(id: String, nombre: String) : Usuario(id, nombre)
