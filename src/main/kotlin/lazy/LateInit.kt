package lazy
/*

프로그래밍시 클래스 안에서
상수,변수의 값을 나중에 할당하고 싶을 떄 사용
**객체가 생성될 때 초기화를 하지 않고, 호출되는 시점에서 초기화를 한다

상수 - lazy
변수 - lateinit (안드로이드 프로그래밍에서 매우 많이 사용됨)

 */
fun main(args:Array<String>){

    val name = "yj"

    //lateintit -> var
    // 1.변수 앞에서만 사용 가능
    // 2. nullable타입과 함께 사용 불가능
    // 3. 초기화 전에 사용 불가능
    // 4. 원시 자료형이 아닌 것만 사용 가능(int, double, float ..등 사용 불가)
    lateinit var lunch:String
    lunch = "waffle"

    println(lunch)


    //lazy -> val
    val lazyBear : String by lazy {
        println("Bear is coming!")  // 1회 최초 호출시에만 실행됨
        "bear" //lazyBear에 할당하려는 값
    }

    println("First call : ")
    println(lazyBear) // Bear is coming! \n bear
    println("Second call : ")
    println(lazyBear)// bear

}