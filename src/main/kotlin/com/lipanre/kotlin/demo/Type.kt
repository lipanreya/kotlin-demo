package com.lipanre.kotlin.demo

/**
 * 类型相关
 *
 *
 * <br>
 * {@code date} 2024/9/24 8:54
 */

class Book(var name: String) {
    fun printName() {
        println(this.name)
    }
}

fun main() {
    println("===================================================================================")
    // 自动类型推导
    // kotlin中一切都是对象，没有基本类型，所以这些变量名是合法的
    val string = "I am kotlin"
    val int = 1314
    val long = 1314L
    val float = 13.14f
    val double = 13.34
    val double2 = 10.1e6

    // 打印变量类名
    println(string.javaClass.name)
    println(int.javaClass.name)
    println(long.javaClass.name)
    println(float.javaClass.name)
    println(double.javaClass.name)
    println(double2.javaClass.name)
    println("===================================================================================")

    println(foo(2))

    println("===================================================================================")

    // val不可变变量
    val a = 1
    // 下面这句会报错，因为val定义的变量不允许重复赋值
    // a = 2
    // var可变变量
    var b = 1
    // var定义的变量允许重复赋值，下面这句不会异常
    b = 2


    println("===================================================================================")
    val book = Book("Thinking in Java")
    book.name = "Diving into kotlin"
    book.printName()
    println("===================================================================================")

    var c = 1
    fun count(x: Int) {
        c = c + 1
        println(x + c)
    }
    count(1)
    count(1)

    println("===================================================================================")

    // val声明的变量不用一开始就赋值，可以后面赋值，但是后面赋值只能赋值一次
    val a3: Int
    a3 = 1
    println(a3)
    // 再次赋值，就会编译异常
    // a3 = 4

    println("===================================================================================")
}

/**
 * 这种情况，必须要声明函数返回类型
 * 如果不声明，代表返回的是Unit， 目前可以把Unit当作java中的void
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * 表达式函数
 */
fun sum2(x: Int, y: Int) = x + y

/**
 * if表达式没有return，那么它的返回值类型是各个逻辑分支的相同类型的公共父类型
 * 在递归的时候，利用表达式定义函数，必须要显式声明返回值类型
 */
fun foo(n: Int): Int = if(n == 0) 1 else n * foo(n - 1)