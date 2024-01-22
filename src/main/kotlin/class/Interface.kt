package `class`

/*
인터페이스
이 인터페이스를 구현하는 클래스들이 똑같은 기능을 수해하게끔 강제한다

-> 같은 기능에 대해 같은 함수명을 사용해서 = 같은 규격을 사용하게 할 수 있음 (규격화/통제가능/ 설계표준화)


클래스 상속 vs 인터페이스 구현

인터페이스 : 여러개 구현가능
클래스 : 1개만 상속 가능


 */

fun main (args:Array<String>)
{
    val car1 = Cars()
    car1.drive()
    car1.stop()
    car1.destroy()
}
interface Vehicle {
    //해당 인터페이스를 구현하는 클래스들은 아래 함수를 필수로 구현해야한다
    fun drive()
    fun stop()

    //default함수 : 이미 구현된 함수로, 인터페이스를 구현하더라도 강제로 해당 함수를 구현할 필요가 없다 (오버라이딩 해도 상관은 없음)
    fun destroy() { println("Vehicle is destroyed")} //
}

class Cars : Vehicle {
    override fun drive(){ //구현이 강제됨
        println("Car is moving")
    }

    override fun stop() { //구현이 강제됨
        println("Car is stopping")
    }


}