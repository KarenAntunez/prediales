import java.time.LocalDate

data class Prestamos(
    val idPrestamo: Int,
    val idStudent: Student,
    val idPersonal : Personal,
    val fechaPrestamos: LocalDate,
    val fechaDevolucion: LocalDate,
    val area: Areas,
    val material: Materiales
){
    fun prestamo(): Int {
        println("ID prestamo: "+idStudent.id)
        return idPrestamo
    }
    fun getFechaPrestamo(): LocalDate{
        return fechaPrestamos
    }

    fun getFDevolucion(): LocalDate{
        return  fechaDevolucion
    }
}
