package chap04.section2

fun main() {
    ///5 반환된 true의 값 할당     ///1
    val result = callByValue(lambda()) //람다식 함수를 호출
    println(result)

}

    ///3 b에 true 값이 복사
fun callByValue(b: Boolean) : Boolean {//일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b //b에 true의 값 반환
}

//익명의 함수가 할당되어 있는 변수
val lambda: () -> Boolean = { //람다 표현식이 두 줄이다
    println("lambda function")
    true ///2   //마지막 표현식 문장의 결과가 반환
}