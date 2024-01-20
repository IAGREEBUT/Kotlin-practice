package controlStatement

import function.printStudentInfo

fun main(args:Array<String>){

    val numRange : IntRange = 1..5

    println(numRange.contains(3)) // true
    println(numRange.contains(10))//false


    val charRange : CharRange = 'a'..'e'

    println(charRange.contains('z'))//false
    println(charRange.contains('a'))//true


    //1. For문
    //주어진 조건에 의해 실행이됨

    for (i in 1..5){
        println(i) // 1 2 3 4 5
    }

    for (i in 1 until 10){
        println(i) // 1 2 3 ... 10
    }

    for (i in 10 downTo  1){
        println(i) // 10 9 8 7 ..
    }

    for (i in 1 until 10 step 2){
        println(i) // 1 3 5 ..10
    }




    //2.While
    //주어진 조건이 true인 동안 실행됨

    var num = 1
    while(num < 5){
        println("current number $num")
        num++
    }


    //조건식이 참이 아니더라도 무조건 1회는 수행되는 while문
    do{
        println("current number $num")
        num++
    }while(num < 5)

}