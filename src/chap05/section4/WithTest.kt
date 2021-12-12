package chap05.section4

import java.io.File

fun main() {

    data class User(var name: String, var skills: String, var email: String? = null)

    var user = User("Kilding", "default")

    var result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }

    println(user)
    println("result: $result")
}

/*
* 기본적으로 Unit 반환, 필요하면 다음과 같이 마지막
* 표현식 반환할 수 있음
* val result = with(user) {
    skills = "Java:
    email = "kildong@example.com"
    "success" //마지막 표현식 반환
    }
*
* */