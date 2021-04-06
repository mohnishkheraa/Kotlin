package com.ltts.kotproject

import java.util.*
import kotlin.collections.ArrayList

fun Palin(n: Long): Boolean {
    var num = false
    var sum : Long= 0
    var temp = n

    while (temp > 0) {
        val r = temp % 10
        sum = sum * 10 + r
        temp /= 10
    }
    if (sum == n) {
        num = true
    }
    return num
}


fun main(arg: Array<String>) {

    val sc = Scanner(System.`in`)
    println("Enter the number")
    val number: Long = sc.nextLong()

    val list: MutableList<Long> = ArrayList()

    for (i in 0..number) {
        if (Palin(i)) {
            list.add(i)
        }
    }

    println("Palindrome Numbers from 0 to $number  are : $list")
}