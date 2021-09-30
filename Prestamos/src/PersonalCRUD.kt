class PersonalCRUD : AbstractRepositoryCRUD<Personal>() {
    override fun filter(param: String): ArrayList<Personal> {
        dataList.filter { personal -> personal.idPersonal.toString().contains(param) or personal.fulname.contains(param) }
        return dataList
    }
}