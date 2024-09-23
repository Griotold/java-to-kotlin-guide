package com.study.lec02

fun main() {

    // safe call - null 이 아닌 경우만 호출해줘
    val str: String? = "ABC"
    println(str?.length)

    // safe call - null 이면 호출하지 않고 null 반환
    val str2: String? = null
    println(str2?.length)

    // elvis 연산자 - null 이면 이걸 실행하라
    val str3: String? = null
    println(str3?.length ?: 1==1) // null 이니까 1==1 표현식의 결과가 출력된다.

    // null 아님 단언!!
    println(startsWith("ABC"))
    // 근데 만약에 null을 넣으면 NPE 발생
    //    println(startsWith(null))
}

fun startsWithA1(str : String?) : Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str : String?) : Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str : String?) : Boolean {
    return str?.startsWith("A") ?: return false
}

// null 아님 단언!!
fun startsWith(str: String?) : Boolean {
    return str!!.startsWith("A")
}