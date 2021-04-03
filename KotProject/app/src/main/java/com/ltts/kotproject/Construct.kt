package com.ltts.kotproject

open class Construct {
    constructor(name:String,id:Int)
    {
        println("Name = $name")
        println("Id = $id")
    }
    constructor(name:String,id:Int,pass:String)
    {
        println("Name = $name")
        println("Id = $id")
        println("Password = $pass")
    }
}
class Child: Construct
{
    constructor(name: String, id: Int): super(name,id){
        println("Name = $name")
        println("Id = $id")
    }
    constructor(name: String,id: Int,pass: String):super(name,id, pass)
    {
        println("Name = $name")
        println("Id = $id")
        println("Password = $pass");
    }
}
fun main()
{
    val obj1=Child("Mohnish",1)
    val obj2=Child("Khera",2,"hello")

}