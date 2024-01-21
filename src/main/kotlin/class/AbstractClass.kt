package `class`

/*
 추상클래스
 - 그 자체로는 객체를 만들 수 없음, 인스턴스화 불가능
 - 상속을 위한 부모클래스의 역할

 - abstract키워드를 사용 -> 최소 1개 이상의 abstract method 포함되어야함
    **abstract method : 구현부가 포함되지 않은 메소드로, 오버라이딩을 강제함


 */



fun main(args:Array<String>){

    val lol = LeagueOfLegend()

    println(lol.startGame())
    println(lol.printGameName())
}

abstract class Game {
    fun startGame(){
        println("Start game")
    }

    abstract fun printGameName() //바디를 구현하면 안됨
}

class LeagueOfLegend : Game(){
    override fun printGameName(){ //자식클래스에서 추상메소드를 강제로 구현해야함
        println("This is LEAGUE OF LEGEND")
    }
}