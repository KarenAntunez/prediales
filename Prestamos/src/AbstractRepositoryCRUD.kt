abstract class AbstractRepositoryCRUD<T> {

    var dataList : ArrayList<T> = arrayListOf()

    fun insert(element: T){
        dataList.add(element)
    }

    fun getByIndex(index: Int) : T {
        return dataList[index]
    }

    fun getAll() : ArrayList<T> {
        return dataList
    }
    fun cleanAll() {
        dataList = arrayListOf()
    }

    abstract fun filter(param: String): ArrayList<T>

}