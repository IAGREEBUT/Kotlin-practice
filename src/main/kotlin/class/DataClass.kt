package `class`

//코틀린에만 존재하는 클래스 (java에는 없음)
/*
데이터 전달 보관에 목적이 있음
(var/val을 이용한) 프로퍼티가 최소 하나 이상 필요함
 */


fun main(args: Array<String>){
    val memo = Memo("Go to grocery","Eggs, Milk, Pork", false)
    println(memo.toString())
    println(memo.title)

    //copy: 객체의 속성들을 복사해서 반환하고, 매개변수로 입력한 파라미터는 대체해준다
    val memo2 = memo.copy("Go to home")
    println(memo2.toString())
}

data class Memo(val title: String, val content: String, var isDone : Boolean){

}