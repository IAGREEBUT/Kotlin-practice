package datatype


//why 자료형? (data type)
/*
메모리를 효율적으로 사용하기 위해서 사용함
변수에 알맞은 크기의 메모리를 할당하기 위해서
 */


/*

Data Type
-
기본적으로 코틀린에서 모든 것은 Object이다
Primitive Data type in kotlin
Numbers(Unsinged integer types - UByte/UShort/... ) / Booleans / Characters / Strings / Arrays

**
//자료형 추론
: 자료형 을 써주지 않아도 자동으로 코틀린이 추론함

1. Numbers
    아래 타입들은 차지하는 storage의 크기가 다르다. 요즘은 RAM의 성능이 좋아 크게 고려하지 않아도 괜찮지만 (주로 int사용)
    최적화된 앱(super performant)을 만들기 위해서는 최소한의 storage를 사용하는 것이 좋다

    1) Byte //자료형 생략 불가
    var mByte : Byte = 1

    2) Short
    var mShort : Short = 1000  //자료형을 생략하면 자료형 추론이 Int로 추론됨

    3) Int
    var mInt : Int = 1000

    4) Long
    var mLong : Long = 10000000000L //L을 붙이지 않아도 사실 Int의 범위를 넘어가면 자동으로 Long으로 지정됨

    <Floating-point type / 실수표현>
    5) Float : 소수점 6-7째 자리까지 표현 가능 ( 32bit - single precision ) -> 낮은 정밀도, 메모리 절약(게임,그래픽 적합)
    var mFloat : Float = 1.123f

    6) Double : 소수점 16째 자리까지 표현 가능 ( 64bit - double precision ) -> 높은 정밀도, 높은 메모리 -> 금융,과학 연산 적합
    var mDouble : Double = 1.234567
    **
    val one: Double = 1    // Int is inferred
    // Initializer type mismatch
    val oneDouble = 1.0    // Double



2. Characters

var mChar : Char = 'a'


3. Strings
var mString : String = "Hello kotlin"


4. Booleans
var mFalse: Boolean = false
var mTrue : Boolean = true


4. Arrays

var mArray : Array<String> = arrayOf("Kotlin","is","fun)
mArray[0] or mArray.get(0) // Kotlin
mArray[1] // is
mArray[2] // fun


 */