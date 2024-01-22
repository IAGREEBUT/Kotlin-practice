package `class`

/*


*패턴 : 효율적인 프로그래밍을 위해서 프레임워크처럼 굳어진 것

싱글턴 패턴
클래스의 인스턴스가 오직 하나만 생성됨. (프로그램이 시작될 때 생성)

여러곳에서 사용하는 경우에서는 같은 것을 사용하게됨

싱글톤패턴을 코틀린은 object키워드로 구현함

 */

fun main(args:Array<String>){

    //장점
    //class와 다르게 인스턴스 생성없이도 호출 가능
    //메모리가 절약됨


    //단점
    //동시에 값변경이 일어나는 경우 문제가 생길 수 있음
    println(MyFirstObject.number)
    MyFirstObject.sayHello()



    println(Dinner.Companion.MENU) //Companion 생략 가능
    Dinner.eatDinner()

    //Dinner.lunch  : dinner가 가진 맴버가 아니기 떄문에 접근 불가


}

//Object
object MyFirstObject {
    val number = 1
    fun sayHello(){
        println("Hellow!")
    }
}

//Companion object : 클래스 내에 들어있는 obejct (클래스 하나당 1개만 가능)
class Dinner {
    val lunch = "steak"
    companion object Companion{ // companion object NAME(name은 기본으로 Companion이며 생략 가능하고, 다른 이름을 부여할 수도 있음)
        val MENU = "pasta"
        fun eatDinner(){
            println("Today's menu is $MENU")
        }
    }
}