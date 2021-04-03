package com.ltts.kotproject

class MyClass {
    var name="Mohnish"
    fun myFun()
    {
        println("My name is $name")
    }
    constructor(name: String, id: Int):this(name,"mohnishkhera", "mypassword"){
        println("Name = $name")
        println("Id = $id")
    }

    constructor(name: String, email:String, phn: String)
    {
        println("Name = $name")
        println("Email = $email")
        println("Phone = $phn")
    }
}

fun main()
{
    val MyClass = MyClass("mohnish",10)
}