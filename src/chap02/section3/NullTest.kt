package chap02.section3

fun main() {
    var str1: String? //?가 있으면 null 가능한 String
    str1 = "Hello" //null

    //기존 코드 //null이 아닐 경우에만 str1.length 받아들이는
    //val len = if (str1 != null) str1.length else -1

    //elvis 식
    val len = str1?.length ?: -1 //
    //null이 아니면 length에 있는 내용물이 실행


    //세이프 콜 Safe-call
    println("str1: $str1, length: ${str1?.length}")
    //?. 널이면 뒷부분을 실행하지 않음

    //non-null 단정 기호 !!
   // println("str1: $str1, length: ${str1!!.length}")
    println("str1: $str1, length: $len")
    // !!. 널이  아닐꺼라고 단정해서 컴파일러가 오류를 무시하게 한다.
    // !! 널이 들어가도 체크하지 않는다. 널 일리가 없다.
}