package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

/*
*헷갈릴 수 있는데 var 로 선언된 str1의 참조 주소는 가변형으로 바뀔 수 있다.(다른 것 지정가능)
* 다만 일단 선언되어 서ㅐㅇ성된 메모리 공간의 Hello는 변경되지 않습니다.(변경 불가능)
* */

    /* == =이 두 개인 경우는 값만 비교
    *  === =이 세 개인 경우는 참조까지 비교*/

    println("str1 === str2 ${str1 === str2}")
    println("str1 === str3 ${str1 === str3}") //같은 공간 주소가 같지만 변수이름만 다름


    var a = 1
    val str4 = "a = $a"
    val str5 = "a = ${a + 2}" //문자열에 표현식 사용

    println("str5: \"$str4\", str5: \"$str5\"")

}