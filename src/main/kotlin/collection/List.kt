package collection

import function.printStudentInfo

/*
    Data Structure(자료구조)
     - 컴퓨터가 데이터를 저장하고 또 효율적으로 다룰 수 있게 해줌
        ex) Primitive Data Structure ( Int, Double, Float....)
            Not Primitive Data Structure ( List, Stack, Set, Queue, Map)

     Collection
     - 자료구조를 쉽게 사용할 수 있도록 코틀린에서 제공하는 클래스
        Mutable / Immutable 두가지 버전으로 존재
     - Iterable 인터페이스를 구현하여, 모든 요소들에 순차적으로 접근 가능하다

 */


fun main(args:Array<String>){

    /*
    List : 순서가 있는 자료구조
     */

    //immutable list : 수정 불가 리스트 -> add등과 같은 함수를 제공하지 않음 
    var fruitList = listOf("Banana","Apple", "Melon")

    println("First fruit ${fruitList[0]}")

    //collection이 iterable을 구현하여 순회하는 forEach를 사용할 수 있다
    fruitList.forEach{ fruit ->
        println(fruit)
    }

    // Mutable List : 변경 가능 리스트
    var mutableFruitList = mutableListOf("Banana","Apple", "Melon")
    println("First fruit ${fruitList[0]}")

    mutableFruitList[0] = "Strawberry" //변경 가능

    println("First fruit is changed into ${mutableFruitList[0]}")

}