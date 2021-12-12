package chap04.section2

fun main() {

    twoLambda({a, b -> "First $a $b"}, {"Second $it"})
    twoLambda({a, b -> "First $a $b"}) {"Second $it"} //위와 동일

} //end main

fun twoLambda(first: (String,String) -> String, second: (String)-> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

