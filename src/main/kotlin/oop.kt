class Example{

    //data member

     private var number:Int=8

    //member function
    fun calculatesquare():Int{

        return number*number

    }

}

fun main(args: Array<String>) {
    //create an object of Example Class

    val myobj=Example()

    println("The square is ${myobj.calculatesquare()} ")


}