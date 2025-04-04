package `class`

/*

객체 지향 프로그래밍

"객체"를 사용하고, 객체를 "지향"하는 프로그래밍 방식

얼굴 "객체" = 눈 객체 + 코 객체 + 입 객체 + 귀 객체

객체 = 서로 연관된 것을 묶어서 만든 "속성(field)"과 "동작(method)"이 있는 집합체

자동차 객체

속성(property/field)
- 색상
- 엔진
- 베기량
- 모델명

동작 (method) ** 함수가 메서드보다 큰 개념임
- 전진한다
- 멈춘다
- 창문을 연다


자동차 객체 -> 인스턴스 (실체가 있는 객체) 로 만들어냄
ex)
실버
XX
XX
BMW 어쩌구




객체지향 프로그래밍의 4가지 특징

1. 추상화
- 공통성과 본질을 모아 추출

ex)
자동차 / 오토바이 에서 공통성을 모음
-> (공통성) 움직이고/멈추고/연료를 채운다

이를 하나로 모아 추출한 후 => 교통수단(본질)으로 추출한다

자동차 <- 교통수단 -> 오토바이
교통수단 -> 이 부분을 추상클래스/인터페이스 로 구현한다



2. 상속
"기존의 클래스를 재활용"

부모클래스 / 자식클래스
추상화 하여 뽑아낸 클래스를 부모클래스로 하여 자식클래스가 상속하도록 한다
공통적인 것들을 굳이 각자 가지고 있지 않게 하고 상속하여 갖게한다



3. 다형성
- 어떤 객체의 속성이나 기능이 상황에 따라 여러가지 형태를 가질 수 있는 성질 (유연성)
ex) 오버라이딩
같은 함수를 상속 받았음에도 불구하고, 같은 함수를 실행하더라도 서로다른 자식클래스에서는 다르게 동작할 수 있음


4. 캡슐화
- 서로 연관있는 것들을 묶어서 외부로부터 보호

정보 은닉! 외부에서 내부 정보로 접근 불가
원하는 필드나 메소드만 취사선택해서 외부에 공개가능

-> 유지보수, 확장시 오류 범위 최소화
-> 객체 내 데이터가 변경되어도 다른 객체에게 영향을 주지않아 독립성이 보장

접근제어자(public/private)을 이용해서 설정

 */



fun main(args:Array<String>){

    //클래스 : 객체를 정의하는 설계도

    val car = Car("red", "BMW", 10) //객체 생성

    println(" Color of the car : ${car.color}")

    val car2 = Car("blue", "KIA", 2) // 클래스의 생성자

    println(" Color of the car2 : ${car2.color}")

    var car3 = Car("Black", "Tesla")


}

//매개변수도 var/val로 세팅이 가능하다..
// val 인 경우 setter로 변경 불가능하다!
class Car(var color:String = "red", val name:String, val age :Int){ //주 생성자(Primary Constructor)
    //class Car private constructor(color: String .. )
    // -> private class가 아니라 primary constructor가 private 인것임 이 경우 constructor 를 생략불가

    //맨 처음 객체가 실행될 때 실행될 내용
    init {
        println("Color : $color Name : $name Age : $age")
    }


    //보조 생성자(여러개 만들 수 있음) -> age가 들어오지 않은 경우에의 생성자
    constructor(color: String, name: String) : this(color,name,12)



}