package com.lipanre.kotlin.demo

/**
 * {@code description}
 * 表达式
 *
 * <br>
 * {@code date} 2024/9/24 13:01
 */

/**
 * kotlin定义枚举
 */
enum class Day {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN

    ;


}


fun schedule(sunny: Boolean, day: Day) = when (day) {
    Day.SAT -> println("SAT")
    else -> when {
        sunny -> println("sunny")
        else -> println("else")
    }
}

fun schedule2(sunny: Boolean, day: Day) {
    when (day) {
        Day.SAT -> println("SAT")
        else -> when {
            sunny -> println("sunny")
            else -> println("else")
        }
    }
}

// 通过val定义一个lambda表达式
val schedule3: (Boolean, Day) -> Unit = { sunny: Boolean, day: Day ->
    when (day) {
        Day.SAT -> println("SAT")
        else -> when {
            sunny -> println("sunny")
            else -> println("else")
        }
    }
}

fun main() {
    println("===================================================================================")
    val maybeInt: Int? = null
    println(maybeInt ?: 1)
    println("===================================================================================")

    // when表达式
    schedule(true, Day.SAT)

    println("===================================================================================")
}