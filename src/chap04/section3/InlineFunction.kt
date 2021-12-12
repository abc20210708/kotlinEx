package chap04.section3

inline fun shortFunc(a:Int, crossinline out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("Goodbye")
}

fun main() {

    //shortFunc(3,{a -> println("a: $a")})
    shortFunc(3) {
        println("a: $it")
        //return
    }
}//end main