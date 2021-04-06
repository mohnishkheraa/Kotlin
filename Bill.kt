package com.ltts.kotproject

fun main(args : Array<String>) {
    println("Enter the qnt")
    val num1 = readLine()!!.toInt()
    println("Enter the price of the sold item")
    val num2 = readLine()!!.toInt()
    val bill =  num1 * num2
    println("bill amount is $bill ")
    val disctbill = (bill * 15)/100
    val last = bill-disctbill

    val text ="""
        1. quantity= $num1
        2. unit price of the sold item is = $num2
        3. calculated bill without discount = $bill
        4. calculated bill with 15% discount = $disctbill
         
         total money you have to pay $last
    """
    println(text)
}