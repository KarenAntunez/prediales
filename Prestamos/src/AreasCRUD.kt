class AreasCRUD : AbstractRepositoryCRUD<Areas>() {
    override fun filter(param: String): ArrayList<Areas> {
        dataList.filter { areas -> areas.idArea.toString().contains(param) or areas.nombreArea.contains(param) }
        return dataList
    }
}