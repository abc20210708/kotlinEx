package chap04.section2


fun main() {
    fun sum(x: Int, y: Int) = x + y

    funcParam(3, 2, ::sum) ///참조 방식


    //매개변수 없는 람다식 함수
    noParam({ "Hello World!" })
    noParam{ "Hello World!" } //위와 동일 결과, 소괄호 생략 가능

}

fun funcParam(a: Int, b:Int, c:(Int, Int) -> Int) : Int {
    return c(a,b)
}

//매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())