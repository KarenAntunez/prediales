data class Materiales(
    val idMaterial: Int,
    val nombreMaterial: String,//considerar array
    //val cantidad: Int,
    //val clasificacion: String
){
    fun getIDMaterial(): Int{
        return idMaterial
    }
    fun getnombreMaterial(): String{
        return nombreMaterial
    }
}
