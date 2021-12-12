package chap04.section2

fun main() {
                            ////1람다식 자체가 매개변수에 보갓됨
    val result = callByName(otherLambda) //람다식 이름으로 호출
    println(result)
}
                ///여기로 복사됨
fun callByName(b: () -> Boolean) : Boolean { //람다식 함수 자료형으로 선언된 매개 변수
    println("callByName function")
    return b() ///4 b() 결과인 true 반환환}       ///2 람다식 함수가 호출되 실행
        ///|
        ///v
    }

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
} ///3 true의 반환