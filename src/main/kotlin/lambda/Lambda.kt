package lambda

/*
람다식
"값"(value)처럼 다룰 수 있는 "익명함수"
코드를 가독성 좋게 만듬
 */


fun main(args:Array<String>){

    //익명함수란?
    // 상수에 함수를 할당할 수 있음
    val sayHello = fun() {println("Hello!")} // 이름이 존재하지 않는 함수를 이름이 있는 상수에 담음


    //"값"처럼 다룬다?
    // == 값이 들어가는 곳 모든곳에 람다로 대체할 수 있다
    //ex)
    // fun multiply(num: Int, num : Int): Int -> 매개변수 num2개 및 return값에 람다를 대신 사용가능


    //화살표 양옆의 자료형이 같아야함
    /*
    (Int) -> (Int) //파라미터 -> 반환값
    num   -> num * num
     */
    val squareNum: (Int) -> (Int) = {num -> num * num}
    println(squareNum(10))//100

    //매개변수가 1개인 경우에는 it으로 대체 가능

    val squareNum3 : (Int) -> (Int) = {it*it}


    //인수로 lambda를 가짐
    // 해당 람다는 인수로 int값을 리턴으로 boolean값을 가짐
    fun invokeLambda(lambda : (Int) -> Boolean) : Boolean {
        return lambda(5)
    }

    //인수로 어떤 람다를 가지느냐에 따라 결과가 달라짐
    val trueValue = invokeLambda({num -> num < 10}) //true
    val falseValue = invokeLambda ({num -> num == 10}) //false


    //lambda식의 4가지 형태
    val lambda1 = invokeLambda ({num -> num == 10}) //기본 형태
    invokeLambda ({it<10}) // 인자가 1개인 경우 it으로 대체가능 
    invokeLambda (){ it<10 } //람다식은 (매개변수)밖으로 빼줄 수 있음
    invokeLambda { it < 10 } //위 버전에서 ()가 없으므로 생략한 모습
}