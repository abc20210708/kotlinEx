package chap05.section3

fun labelBreak() {
    println("labelBreak")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak2() {
    println("labelBreak")
    for (i in 1..5) {
        first@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j: $j")
        }
        println("after for j")
    }
    println("after for i")
}