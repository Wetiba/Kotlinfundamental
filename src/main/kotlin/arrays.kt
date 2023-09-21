fun main(args: Array<String>) {

    val majina= arrayOf("Erick","joan",78.56,87,'g',true)



    val myarr= arrayOf<Int>(4,10,77,2,45,0,7)

    myarr[1]=5


    println("My name is ${majina[1]}")
    println(myarr[1])
    val myarr2=myarr.sorted()
    println(myarr2)
    println("The Size of myarr is ${myarr.size}")
    println("The last item  of myarr is ${myarr.last()}")


}