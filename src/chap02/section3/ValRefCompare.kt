package chap02.section3

fun main() {

    val a: Int = 128
    val b = a

   // println(a == b)
  //  println(a === b)

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d)
    println(c === d)
    println(c === e)

    /*코틀린에서는 참조형으로 선언한 변수의 깂이
    *  (-128 ~ 127)범위에 있으면 캐시에 그 값을 저장함*/
}