import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class Test {
    private val repositoryCRUD: AbstractRepositoryCRUD<Persona> by lazy { RepositoryCRUD() }
    private val repoStudentCrud: AbstractRepositoryCRUD<Student> by lazy { StudentCrud() }
    private val repoPersonalCrud: AbstractRepositoryCRUD<Personal> by lazy { PersonalCRUD() }
    private val repoPrestamosCRUD: AbstractRepositoryCRUD<Prestamos> by lazy { PrestamosCRUD() }
    private val repoMaterialesCRUD: AbstractRepositoryCRUD<Materiales> by lazy { MaterialesCRUD() }
    private val repoAreasCRUD: AbstractRepositoryCRUD<Areas> by lazy { AreasCRUD() }
    private val repoDetPrestamosCrud: AbstractRepositoryCRUD<DetallesPrestamo> by lazy { DetallesCRUD() }
    private val repoListaDeudores: AbstractRepositoryCRUD<ListaDeudores> by lazy { ListaDeudoresCRUD() }
    private val repoListaMateriales: AbstractRepositoryCRUD<ListaMaterialesDeudores> by lazy { ListaMaterialesCRUD() }

    @Test
    fun inicialize() {
        repositoryCRUD.cleanAll()
        repoAreasCRUD.cleanAll()
        repoMaterialesCRUD.cleanAll()
        repoPrestamosCRUD.cleanAll()


        val estudiantes = Student(1,"Kevin Uziel Hernandez Morales","Informatica","9")
        val areas = Areas(1,"Biblioteca")
        val personal = Personal(2,"Omar Lopez","Encargado",'M')
        val material = Materiales(1,"USB")
        val prestamos = Prestamos(1,estudiantes,personal, LocalDate.parse("2021-05-05"),LocalDate.MAX,areas,material)
        val detalles = DetallesPrestamo(prestamos,material,2)


        //val deudores = ListaDeudores(prestamos,"","",)

        //repositoryCRUD.insert(Student(1,"Kevin","Informatica","9"))
        repositoryCRUD.insert(Student(1,"Kevin Kevin Uziel Hernandez Morales","Informatica","9"))
        repositoryCRUD.insert(Student(2,"Yobany Chavez","Informatica","9"))
        repositoryCRUD.insert(Student(3,"Zuriel Hernandez","Informatica","9"))
        repositoryCRUD.insert(Student(4,"Gabriel Omar Sanchez","Informatica","9"))




        repoAreasCRUD.insert(Areas(1,"Almacen"))
        repoAreasCRUD.insert(Areas(2,"Biblioteca"))
        repoAreasCRUD.insert(Areas(3,"Centro de computo"))



        repositoryCRUD.insert(Personal(5,"Omar Lopez","Encargado",'M'))
        repositoryCRUD.insert(Personal(6,"Felipe Jimenez","Encargado",'M'))


        repoMaterialesCRUD.insert(Materiales(1,"USB"))
        repoMaterialesCRUD.insert(Materiales(2,"Libro de Programacion Orientada a Objetos"))

        //repoPrestamosCRUD.insert(Prestamos(1,idStudent = Student(1,"Kevin","Informatica","9"),idPersonal = Personal(1,"Omar","Encargado",'M'), LocalDate.parse("2020-05-05"), LocalDate.parse("2020-05-10"),area = Areas(1,"Almacen"),material = Materiales(1,"USB")))

        repoPrestamosCRUD.insert(Prestamos(1,estudiantes,personal, LocalDate.parse("2021-05-05"),LocalDate.MAX,areas,material))



        repoDetPrestamosCrud.insert(DetallesPrestamo(prestamos,material,2))

        repoListaDeudores.insert(ListaDeudores(prestamos,estudiantes))

        repoListaMateriales.insert(ListaMaterialesDeudores(prestamos,detalles,estudiantes,areas))

        //println("pruebando"+repositoryCRUD.getAll())

        assertEquals(6, repositoryCRUD.dataList.size)
        assertEquals(3, repoAreasCRUD.dataList.size)
        assertEquals(2,repoMaterialesCRUD.dataList.size)
        //ssertEquals(2,repoPrestamosCRUD.dataList.size)
        assertEquals(1,repoPrestamosCRUD.dataList.size)
        assertEquals(1, repoListaDeudores.dataList.size)
        assertEquals(1,repoListaMateriales.dataList.size)
        assertEquals(1, repoDetPrestamosCrud.dataList.size)

    }

    @Test
    fun getAll_is_Correct(){
        inicialize()
        val detallees = repoDetPrestamosCrud.getAll()
        val prestamos = repoPrestamosCRUD.getAll()
        val listaD = repoListaDeudores.getAll()
        val estudiantes = repositoryCRUD.getAll()
        val listaMateriales = repoListaMateriales.getAll()

        val estudiante = estudiantes.first { estudiante -> estudiante.fulname.contains("Kevin") }
        val prestamo = prestamos.first { prestamo -> prestamo.idPrestamo.toString().contains("1") }
        val idSprestamo = prestamos.first { idSprestamo -> idSprestamo.idStudent.id.toString().contains("1") }
        val det = detallees.first { det -> det.idPrestamos.idPrestamo.toString().contains("1") }
//        val deudores = listaD.first { listaDeudores -> listaDeudores.prestamos.fechaDevolucion.toString().contains("2021-06-20") }

        val listDeudas = listaD.first { listDeudas -> listDeudas.idStudent.id.toString().contains("1") }
        //val listDeudas = listaD.first { listDeudas -> listDeudas.prestamos.fechaPrestamos.toString().contains("2021-05-05") }
        listDeudas.ListaDeudores()

        val listaMaterial = listaMateriales.first { listaMaterial -> listaMaterial.idStudent.id.toString().contains("1") }
//        deudores.ListaDeudores()
        //val deudores = listaD.first { deudores -> deudores.idStudent.id.toString().contains("2") }

        listaMaterial.listarMateriales()

        assertNotNull(estudiante)
        assertTrue { estudiante is Student }
    }

}