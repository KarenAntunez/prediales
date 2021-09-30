data class ListaDeudores(
    val prestamos: Prestamos,
    val idStudent: Student,
  
)
{
    fun getDeudores(){}
    fun ListaDeudores(): String{
        var deudores: String
        deudores = " "

        if(prestamos.fechaDevolucion.month<=prestamos.fechaPrestamos.month){

            deudores=prestamos.idStudent.fulname
            println("No hay deudores")

        }
        if(prestamos.fechaDevolucion.monthValue>prestamos.fechaPrestamos.monthValue ){
            deudores=prestamos.idStudent.fulname
            println("Lista de deudores:")
            println(deudores)
            
        }
        return deudores
    }

    fun getPrestamo(): Prestamos{
        return prestamos
    }
    fun getEstudiante(): Student{
        return idStudent
    }
}
