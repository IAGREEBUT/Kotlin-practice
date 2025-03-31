package variable

fun main(args: Array<String>) {

    //상수 : 재할당 불가 (constant variable / immutable) -> recommendable
    val pi : Double = 3.14
    println(pi)

    //variable (mutable)
    var age : Int = 39
    println(age) //39
    age = 45
    println(age) //45 -> 원하는 값으로 변경(재할당) 가능


    //type추론
    var myInt = 35112349 //automatically infer as Integer
    println(myInt)

    //myInt = 61651684165184656 // caution! : it infer as Integer not Long

}