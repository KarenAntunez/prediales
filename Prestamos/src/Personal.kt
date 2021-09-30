data class Personal(
    val idPersonal: Int,
    override val fulname: String,
    val puesto: String,
    val genero: Char,
    //val areas: Areas
): Persona{
    override fun hasAccess(): Boolean {
        return true
    }
    fun getIDPersonal(): Int{
        return idPersonal
    }
    fun getNombrePersonal(): String{
        return  fulname
    }

}
