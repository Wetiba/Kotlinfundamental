fun main(args: Array<String>) {

    print("Enter marks :")
    val input= readLine()
     if (input != null){
         val score=input.toIntOrNull()
         if (score != null){
             val grade= if (score in 90..100){
                 "A"
             }else if (score in 80 until 90){
                 "B"
             }else if (score in 70 until 80){
                 "C"
             }else if (score in 60 until 70){
                 "D"
             }else{
                 "F"
             }
             println("Score: $score")
             println("Grade: $grade")
         }else{
             println("invalid input")
         }
     }else{
         println("input not provided")
     }

}