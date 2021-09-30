import java.awt.geom.Area

data class ListaMaterialesDeudores (
    val idPrestamo: Prestamos,
    val detalle: DetallesPrestamo,
    val idStudent: Student,
    val idArea: Areas
){
    fun listarMateriales(): String{
        var lista: String
        lista= ""
        if(idStudent.id==detalle.idPrestamos.idStudent.id) {
            lista = detalle.idMaterial.nombreMaterial
            println("Nombre: "+idStudent.fulname+" Numero de control: "+idStudent.id)
            println("Lista de adeudos: "+lista)
            println("Cantidad: "+detalle.cantidad)
            println("Area: "+idArea.nombreArea+" Encargado: "+idPrestamo.idPersonal.fulname)
        }
        return lista
    }


}