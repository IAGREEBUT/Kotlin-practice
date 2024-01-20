package controlStatement

import function.printStudentInfo

fun main(args:Array<String>){

    //When (switch문과 유사)
    //값을 분기해서 확인함

    var score= getGrade(35)
    println("my score is $score")

}


fun getGrade(score: Int ):Char{
    when(score){
        in 0..40 -> return 'D'
        in 41..70 -> return 'C'
        in 71..90 -> return 'B'
        in 91 .. 100 -> return 'A'
        else -> return 'Z'
    }
}