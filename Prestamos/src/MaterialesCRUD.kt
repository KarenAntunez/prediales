class MaterialesCRUD : AbstractRepositoryCRUD<Materiales>() {
    override fun filter(param: String): ArrayList<Materiales> {
        dataList.filter { materiales -> materiales.idMaterial.toString().contains(param) or materiales.nombreMaterial.contains(param) }
        return dataList
    }
}