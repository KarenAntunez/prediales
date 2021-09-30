class RepositoryCRUD : AbstractRepositoryCRUD<Persona>() {
    override fun filter(param: String): ArrayList<Persona> {
        dataList.filter { persona -> persona.fulname.toString().contains(param)}
        return dataList
    }
}