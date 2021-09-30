class StudentCrud : AbstractRepositoryCRUD<Student>() {
    override fun filter(param: String): ArrayList<Student> {
        dataList.filter { estudiante -> estudiante.fulname.contains(param) or estudiante.id.toString().contains(param) or estudiante.carrera.contains(param) or estudiante.semestre.contains(param)}
        return dataList
    }
}