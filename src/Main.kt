fun puedePedirPrestamo(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Estudiante -> "${usuario.nombre} puede tomar prestado el libro '${libro.titulo}'."
        is Profesor -> "${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por más tiempo."
        is Visitante -> "${usuario.nombre} NO puede tomar prestado libros."
    }
}

fun main() {
    val libro = Libro("1984", "George Orwell", 1949)
    val estudiante = Estudiante("E001", "Carlos", "Ingeniería")
    val profesor = Profesor("P001", "María", "Historia")
    val visitante = Visitante("V001", "Juan")

    val usuarios = listOf(estudiante, profesor, visitante)

    usuarios.forEach { println(puedePedirPrestamo(it, libro)) }
}