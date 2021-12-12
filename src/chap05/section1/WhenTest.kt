package chap05.section1

fun main() {

    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    /*코틀린 io의 표준 함수인 readline()은 콘솔로부터
    * 한 줄 입력을 받아들입니다!*/
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        else -> grade = 'F'
    }

    //인수가 없는 when 의 사용
 /*   when () {
       score >= 90.0-> grade = 'A'
       score in 80.0..89.9 -> grade = 'B'
       score in 70.0..79.9 -> grade = 'C'
       score < 70.0 -> grade = 'F'
    }*/


    println("score: $score , grade: $grade")

}