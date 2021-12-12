package chap05.section4

fun main() {

    val score: Int? = 32
    //var score = null

    //일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    //let을 사용해 null 검사를 제거
    fun checkScoreLet() {       //복사
        score?.let { println("Score: $it")} ///1
        val str = score.let {it.toString()} ///2
        println(str)
    }

    checkScore()
    checkScoreLet()


}

