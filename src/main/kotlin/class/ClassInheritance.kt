package `class`

fun main(args: Array<String>) {

    //상속
    //코드의 재 사용성을 높여 유지보수를 도움

    val korea = KoreaInheritance("Republic of Korea", "Seoul", "Korean")
    korea.singNationalAnthem()

    val canada = Country("Canada", "Ottawa","English")
    canada.singNationalAnthem()

}

class Korea(val fullName: String, val capital:String, val language: String){

    fun printFullName(){
        println("full name : $fullName")
    }

    fun printCapital(){
        println("capital : $capital")
    }


    fun printLanguage(){
        println("language : $language")
    }


    fun singNationalAnthem(){
        println("start singing")
        println("Sing Korean national anthem") //다른 부분
    }

}

class Canada(val fullName: String, val capital:String, val language: String){

    fun printFullName(){
        println("full name : $fullName")
    }

    fun printCapital(){
        println("capital : $capital")
    }


    fun printLanguage(){
        println("language : $language")
    }


    fun singNationalAnthem(){
        println("start singing")
        println("Sing Canadian national anthem") //다른 부분
    }

}



//Country with Class Inheritance

//기본적으로 모든 클래스는 상속이 불가능해서 open키워드를 붙여야 부모클래스로 활용이 가능
open class Country(val fullName: String, val capital:String, val language: String){

    fun printFullName(){
        println("full name : $fullName")
    }

    fun printCapital(){
        println("capital : $capital")
    }


    fun printLanguage(){
        println("language : $language")
    }


    //해당 함수의 오버라이딩을 허용함 -> 자식클래스에서 이를 개조해서 사용할 수있도록 함 (다형성 보장)
    open fun singNationalAnthem(){
        println("start singing")
    }

}

//Country 클래스를 상속받은 자식클래스 KoreaInheritance
class KoreaInheritance(fullName: String, capital: String, language: String) : Country(fullName, capital, language) {

    //오버라이딩하여 함수를 사용함
    override fun singNationalAnthem(){ //부모클래스의 함수를 개조해서 사용하겠다
        super.singNationalAnthem()
        println("sing Korean national anthem")
    }

}

class CanadaInheritance(fullName: String, capital: String, language: String) : Country(fullName, capital, language) {

    //오버라이딩하여 함수를 사용함
    override fun singNationalAnthem(){ //부모클래스의 함수를 개조해서 사용하겠다
        super.singNationalAnthem() //부모클래스 것도 실행하고 싶을 떄
        println("sing Canadian national anthem")
    }

}