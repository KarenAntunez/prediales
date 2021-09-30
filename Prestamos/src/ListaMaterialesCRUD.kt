class ListaMaterialesCRUD : AbstractRepositoryCRUD<ListaMaterialesDeudores>() {
    override fun filter(param: String): ArrayList<ListaMaterialesDeudores> {
        dataList.filter { listamateriales -> listamateriales.idPrestamo.idPrestamo.toString().contains(param) or listamateriales.idStudent.id.toString().contains(param) }
        return dataList
    }
}