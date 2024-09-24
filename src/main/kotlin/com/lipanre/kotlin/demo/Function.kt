package com.lipanre.kotlin.demo

/**
 * {@code description}
 * 函数
 *
 * <br>
 * {@code date} 2024/9/24 9:21
 */
class Function {
}

fun main() {

    // 高阶函数
    println("===================================================================================")
    foo2(1)
    println("===================================================================================")
    // 函数类型声明
    val fun1: () -> Unit;
    val fun2: (Int, String) -> String;
    val fun3: (a: Int, b: String) -> String
    // ? 表示这个参数可以为空
    val fun4: (a: Int, b: String?) -> String

    println("===================================================================================")
    class Book(val name: String)
    // 对构造方法的引用
    val getBook = ::Book
    println(getBook("Dive into Kotlin").name)
    println("===================================================================================")
    // 匿名函数
    filterNumber(listOf(1, 2, 3), { number -> number > 1 })
    println("===================================================================================")

    listOf(1, 2, 3).forEach { foo3(it).invoke() }
    listOf(1, 2, 3).forEach { foo3(it)() }
    println("===================================================================================")
}

// 高阶函数
/**
 * 函数内部定义一个函数
 */
fun foo2(x: Int) {
    fun double(y: Int): Int {
        return y * 2
    }
    println(double(x))
}

fun filterNumber(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        if (filter(number)) {
            result.add(number)
        }
    }
    return result
}

// 利用lambda表达式定义一个加法函数
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// 因为支持类型推导，所以sum2的类型可以省略
val sum2 = { x: Int, y: Int -> x + y }

// lambda表达式必须通过{}来包裹
// 如果lambda声明了参数部分的类型，且返回值类型支持类型推导，那么lambda变量就可以省略函数类型声明
// 如果lambda变量声明了函数类型，那么Lambda的参数部分的类型就可以省略
// 如果lambda表达式返回的不是Unit，那么默认最后一行表达式的值就是返回值类型
val foo: (Int) -> Int = { x ->
    val y = x + 1
    // 默认lambda表达式最后一行表达式的值类型就是返回值类型
    y
}

// 声明了参数类型，返回值类型可以推导，所以foo2的类型不用声明
val foo2 = { x: Int ->
    val y = x + 1
    y
}

// 利用lambda表达式定义函数
fun foo3(int: Int): () -> Unit = {
    println(int)
}