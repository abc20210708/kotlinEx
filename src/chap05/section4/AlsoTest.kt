package chap05.section4

import java.io.File

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "success" //마지막 문장을 결과로 반환
    }

    println(person)
    println("a: $a") //String

    val b = person.also {
        it.skills = "Java"
        "success" //마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b" ) //Person의 객체 b
}

//디렉터리 생성 활용
fun makeKir(path: String): File {
    val result = File(path)
    result.mkdirs()
    return result
}

//let과 also를 통해 개선된 함수
//fun makeDir(path: String) = path.let{ File(it) }.also{ it.mkdirs() }