class PrestamosCRUD : AbstractRepositoryCRUD<Prestamos>() {
    override fun filter(param: String): ArrayList<Prestamos> {
        dataList.filter { prestamos -> prestamos.idPrestamo.toString().contains(param) or prestamos.fechaPrestamos.toString().contains(param) }
        return dataList
    }
}