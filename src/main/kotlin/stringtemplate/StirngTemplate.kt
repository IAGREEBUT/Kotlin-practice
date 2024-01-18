package stringtemplate

fun main(args:Array<String>){

    val price = 1000;
    val tax = 100;


    val originalPrice = "The original price is $price"
    val taxPrice = "The tax price is ${price + tax}"

    println(originalPrice) // println("The original price is " + price) 대신 사용
    println(taxPrice)



}