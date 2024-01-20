package controlStatement

import function.printStudentInfo


fun main(args:Array<String>){
    val examResult : Boolean = isPass(50)
    println("ExamResult : $examResult")
}


fun isPass(examScore : Int) : Boolean {
    if(examScore >= 60) {
        return true
    }else{
        return false
    }
}