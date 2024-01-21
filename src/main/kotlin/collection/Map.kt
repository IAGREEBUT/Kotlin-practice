package collection

import function.printStudentInfo

fun main(args:Array<String>) {


    //Map : 키-값 쌍으로 이루어짐
    //키는 중복이 불가능함


    val immutableMap = mapOf("name" to "YJ", "age" to 100, "height" to 160)

    println(immutableMap["name"])//YJ
    println(immutableMap["sex"])//null (없는 키를 부르면null)



    val mutableMap = mutableMapOf("name" to "YJ", "age" to 100, "height" to 160)
    mutableMap["age"] = 10 // or mutableMap.replace("age", 10)

    println(mutableMap) // {name=YJ, age=10, height=160}

    mutableMap.put("hobby","coding")
    mutableMap.remove("name")

    println(mutableMap) // {age=10, height=160, hobby=coding}


}