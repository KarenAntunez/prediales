class DetallesCRUD : AbstractRepositoryCRUD<DetallesPrestamo>() {
    override fun filter(param: String): ArrayList<DetallesPrestamo> {
        dataList.filter { detalles -> detalles.idPrestamos.toString().contains(param) or detalles.idMaterial.toString().contains(param) }
        return dataList
    }
}