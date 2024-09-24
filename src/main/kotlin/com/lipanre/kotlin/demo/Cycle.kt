package com.lipanre.kotlin.demo

/**
 * {@code description}
 *
 *
 * <br>
 * {@code date} 2024/9/24 13:18
 */
fun main() {
    println("===================================================================================")
    for (i in 1..10) println(i)
    println("===================================================================================")
    for (i in 1..10 step 2) println(i)
    println("===================================================================================")
    for (i in 10 downTo 1 step 2) println(i)
    for (i in 1..<10) println(i)
    for (i in 1 until 10) println(i)
    println("===================================================================================")
    // 用in来判断元素是否属于区间或集合
    println("a" in listOf("a", "b", "c"))
    // 判断不存在集合
    println("a" !in listOf("a", "b", "c"))
    println("d" in listOf("a", "b", "c"))
    println("kot" in "abc".."xyz")
}