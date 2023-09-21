fun main(args: Array<String>) {
    var chr='C'
     when(chr){

         'A','E','I','O','U' -> println("$chr is vowel")
          else -> println("$chr is a Consonant")

     }
    var mynum=78
    when(mynum){
        in 1..9 -> println("$mynum is a single digit num")
        in 10..99 -> println("$mynum is a double digit nmber")
        in 100..999 -> println("$mynum is a three digit digit nmber")


        else -> println("$mynum has more than three digit")

    }

}