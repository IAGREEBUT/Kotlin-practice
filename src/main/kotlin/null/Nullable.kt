package `null`

/*
null
값이 할당되지 않은, 없는 상태


Nullable : 널이 될 수있음
Non-Nullable(Default) : 널이 될 수 없음


 */

fun main(args:Array<String>){

    //Nullable vs Non - Nullable
    var myName : String = "YJ"; //myName을 nullable로 만드는 방법은?
    println(myName.reversed())


    //Nullable ?
    var nullableMyName : String? = null //null을 가질수있는 변수


   // println(nullableMyName.reversed()) -> 에러 null일 가능성이 있는 변수는 함수를 사용할 수 없게 막혀있음 (런타임 오류 방지)


    // safecall 연산자(?) : null임에도 불구하고 함수를 실행하고 싶은 경우 ? 사용

    println(nullableMyName?.reversed())

    //?:  엘비스 연산자 -> null인경우는 후자/ 아닌경우에는 전자를 반환

    val yj = nullableMyName?.reversed() ?: "Anonymous"


    // 확정 연산자 : !!
    // 절대 null이 아님을 확신할 수 있을 때  -> null인 경우에는 에러가 나므로 남발하면 안됨
    println(nullableMyName!!.reversed())

}