open class Ourparent{
val dad="Like watching Hiking"
val mum="Like cooking"

}
class Boychild:Ourparent(){
    fun mvulana(){
        println(dad)
    }


}
class Girlchild:Ourparent(){

    fun msichna(){
        println(mum)
    }

}

fun main(args: Array<String>) {
    val myobj=Boychild()
    myobj.mvulana()
    val myob2=Girlchild()
    myob2.msichna()
}