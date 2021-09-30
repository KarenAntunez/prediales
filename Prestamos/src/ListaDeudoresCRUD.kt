class ListaDeudoresCRUD : AbstractRepositoryCRUD<ListaDeudores>() {
    override fun filter(param: String): ArrayList<ListaDeudores> {
        dataList.filter { deudores -> deudores.idStudent.id.toString().contains(param) or deudores.prestamos.idPrestamo.toString().contains(param) }
        return dataList
    }
}