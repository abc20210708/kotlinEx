package chap05.section4

import java.io.File

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("Kilding", "Kotlin")

    //여기서 this는 person 객체를 가리킴
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Sean" //1. this는 생략할 수 있음
        skills = "Java" //this 없이 객체의 멤버에 여러 번 접근
    }
    println(person)
    println(returnObj)
}

//person.also { it.skills = "Java" } //it으로 받고 생략할 수 없음
//person.apply { skills = "Swift" } //this로 받고 생략

//기존코드
fun makeDir(path: String) : File {
    val result = File(path)
    result.mkdirs()
    return result
}

//File(path).apply { mkdirs() }