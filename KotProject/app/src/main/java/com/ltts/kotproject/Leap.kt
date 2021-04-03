package com.ltts.kotproject

import java.util.*

fun main()
{
    var sc = Scanner(System.`in`)
    var n=sc.nextInt()
    if(n%4==0 && n%100!=0 || n%400==0 )
    {
        println("Leap Year")
    }
    else
        println("Not a Leap Year")
}