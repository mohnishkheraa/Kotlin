package com.ltts.kotproject

import java.util.*

fun sum(a:Int,b:Int)
{
    println(a+b)
}
fun subtract(a:Int,b:Int)
{
    println(a-b)
}
fun division(a:Int,b:Int)
{
    println(a/b)
}
fun multiplication(a:Int,b:Int)
{
    println(a*b)
}

fun main()
{
    var sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    println("1. Sum")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    var n=sc.nextInt()
    if(n==1)
    {
        var result= sum(a,b)
    }
    else if (n==2)
    {
        var result= subtract(a,b)
    }
    else if (n==3)
    {
        var result= multiplication(a,b)
    }
    else if (n==4)
    {
        var result= division(a,b)
    }
}