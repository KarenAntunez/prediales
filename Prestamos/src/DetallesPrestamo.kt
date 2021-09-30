data class DetallesPrestamo(
    val idPrestamos: Prestamos,
    val idMaterial: Materiales,
    val cantidad: Int
) {
    fun getMateriales(): Materiales{
        return idMaterial
    }
    fun getIDPrestamo(): Prestamos{
        return idPrestamos
    }
    fun getCantidades(): Int{
        return cantidad
    }
}