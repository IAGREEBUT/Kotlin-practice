package function

/*
함수란 ? 하나의 특별한 목적의 작업을 수행하기 위해 설계된 코드의 집합

장점)
반복적인 코드를 피할 수 있다
가독성을 높여준다


fun FUNCTION_NAME ( PARAMETER ) : RETURN TYPE {
    // CODES TO RUN
}

 */

fun main(args:Array<String>){
    printStudentInfo("IAGREEBUT", 99)
    printStudentInfo("BETTER2MR", 100)
}



//1. Return 값이 없는 함수
//Unit == Void
fun printStudentInfo(name: String, age: Int) : Unit {
    println("Stduent name : "+name)
    println("Student age : "+age)
}

//2. Return 값이 있는 함수
fun addNum(n1 : Int, n2:Int) : Int{
    return n1+n2
}