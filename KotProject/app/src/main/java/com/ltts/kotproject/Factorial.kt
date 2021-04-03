package com.ltts.kotproject

import java.util.*

val anonymous= fun(a:Int): Int {
    var fact:Int=1;
    for(i in 1..a){
        fact *= i;

    }
    return fact;
}
fun main()
{
    var sc = Scanner(System.`in`)
    var a=sc.nextInt()
    println(anonymous(a))
}