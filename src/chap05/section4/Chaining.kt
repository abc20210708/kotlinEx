package chap05.section4

fun main() {
    var a = 1
    val b = 2

    a = a.let { it + 2 }.let {
        println("a = $a")
        val i = it + b
        i
    }
    println(a) //5


    // 중첩 사용
    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
            //이때는 it을 사용하지 않고 명시적 이름을 사용
        }
    }

    //반환값은 바깥쪽의 람다식에만 사용
    var y = "Kotlin!"
    y.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
            "Inner String" //이것은 반환되지 않음
        }
        "Outer String"//이 문자열이 반환되 x에 할당
    }

}