package collection

import function.printStudentInfo

fun main(args:Array<String>){

    /*
    Set : 순서가 없고, 중복이 없다
     */

    val immuatbleSet = setOf(1,1,2,3,3,3,4,4,4)

    println(immuatbleSet)// [1,2,3,4]


    val mutableNumSet = mutableSetOf(1,1,2,3,3,4,5,6)

    println(mutableNumSet)//[1,2,3,4,5,6]


    mutableNumSet.add(100)
    mutableNumSet.remove(2)

    println(mutableNumSet)//1,3,4,5,6,100

    println(mutableNumSet.contains(2))//false


}