package `class`

/*
access Modifier (접근 제한자)

캡슐화와 연관
누구에게 클래스의 메소드와 프로퍼티들을 공개할 것인가?


public > internal > protected > private

public : 어디서나 접근 가능(기본접근제한자)
internal:같은 모듈내에서 접근 가능 -> 프로젝트 내 모듈
protected :자식 클래스에서는 접근 가능
private : 해당 클래스 내에서만 접근 가능

 */

fun main(args:Array<String>){
    val a = A()
    println("a.a : ${a.a}") //1
    println("a.b : ${a.b}") //2


    val b = B()
    //println("b.c : ${b.c}") // x 접근 불가 (b의 private)
    println("b.d : ${b.d}") // 4

    val c = C()
    //println("c.e : ${c.e}") // x 접근 불가 (c의 자식클래스 에서만 접근 가능)
    //println("c.f : ${c.f}") // x 접근 불가
    println("c.g : ${c.g}") // 7

}

public class A {
    public val a = 1;
    val b = 2; //default is public /has same access level as "val a"
}

class B {
    private val c = 3
    public val d = 4
}

open class C {
    protected val e = 5
    private val f = 6
    public val g = 7
}


class D : C(){ //c를 상속받음
    fun printCProperties(){
        println("e : $e") // 자식 에서 접근 가능 protected
        //println("f : $f") // c본인 내부에서만 출력 가능 private
        println("g : $g") // 어디서나 접근 가능
    }

    private fun printCPropertiesPrivate(){ //private함수이므로 D내부에서만 호출 가능
        println("e : $e") // 자식 에서 접근 가능 protected
        //println("f : $f") // c본인 내부에서만 출력 가능 private
        println("g : $g") // 어디서나 접근 가능
    }

    fun callFun(){ //이 함수를 호출하면 결론적으로 private이었던 printCPropertiesPrivate()을 호출할 수 있음 (근데 당연하게 이렇게하면안됨..)
        printCPropertiesPrivate()
    }

}