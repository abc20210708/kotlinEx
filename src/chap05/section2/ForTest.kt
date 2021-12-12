package chap05.section2

fun main() {

    var total = 0

    ///짝수 합 0..99 step 2
    for (num in 1..100 step 2) { //홀수 합
        total += num
    }
    println("total: $total")



}//end main