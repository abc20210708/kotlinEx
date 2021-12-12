package chap05.section4

import java.io.File

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("Kilding", "Kotlin")


    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success"//사용되지 않음
    }

    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("returnObj2 : $returnObj2")
}


