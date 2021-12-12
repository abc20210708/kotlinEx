package chap05.section1

fun main() {

    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    /*코틀린 io의 표준 함수인 readline()은 콘솔로부터
    * 한 줄 입력을 받아들입니다!*/
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) { //Alt + Enter 범위 검사
        grade = 'B'
    } else if (score >=70 && score <=79.9) {
        grade = 'C'
    }
    println("score: $score , grade: $grade")

}