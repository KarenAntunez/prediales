data class Areas(
    val idArea: Int,
    val nombreArea: String
)
{
    fun getArea(): String{
        return nombreArea
    }
    fun getIDArea(): Int{
        return idArea
    }
}