package chap02.section3

fun main() {

    val num = 256

    if (num is Int) { //num이 Int형일 때
        print(num)
    } else if (num !is Int) { //num이 Int형이 아닐 때
        //  !(num is Int)와 동일
        print("Not a Int")
    }

    //Any형 변수의 변환
    var a: Any = 1 //Any형 a는 1로 초기화될 때 Int형이 됨
    a = 20L //Int형이였던 a는 변경된 값 20L에 의해 Long이됨
    //a = "Hello"를 하면 String이 나옴
    println("a: $a type: ${a.javaClass}") //a의 자바 기본형을
    //출력하면  long이 나옴

    checkArg("Hello") //문자열을 인자로 넣음
    checkArg(5) //문자열을 인자로 넣음


}//end main

fun checkArg(x: Any) {

    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}//enc checkArg


