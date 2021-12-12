package chap03.section1


/*
* 최상위 함수 특징 : sum 이라는 이름은 main 위 혹은 아래에
* 두더라도 해당 이름은 main 안에서 사용할 수 있어요.
* */

fun outfunc(name: String) {
    println("Name: $name")
    //: Unit도 생략 가능
    //return Unit이 생략되어 있음
}

//fun outfunc(name:String) = println("Name: $name")

fun main() { //최상위 (Top- level) 함수

    //기본 값을 넣을 수 있다. Default
    fun sum(a: Int, b: Int = 5): Int {
        return a + b
    } //지역 함수

    //fun sum( a: Int, b:Int) :Int = a + b 로 생략가능능

   fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    //fun max(a:Int, b:Int) = if (a > b) a else b


    val result1 = sum(2,3)
    val result3 = sum(2)

    val a = 3
    val b = 5

    val result2 = max(a,b)
    outfunc("Kildong")
    println(result1)
    println(result2)
    println(result3)

}