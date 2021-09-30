data class Student(
    val id: Int,
    override val fulname: String,
    val carrera: String,
    val semestre: String,
): Persona{
   override fun hasAccess(): Boolean {
        return false
    }
    fun fulname(): String {
        println("Nombre: "+fulname)
        return fulname
    }
    fun getID(): Int {
        return id
    }

}
