package com.ltts.kotproject

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    /* val arrayList = ArrayList<String>()
    arrayList.add("Ajay")
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print ArrayList.......")
    for (i in arrayList) {
        println(i)
    }*/

    val hashMap: HashMap<Int, String> = HashMap<Int, String>()
    hashMap.put(1, "Ajay")
    hashMap.put(3, "Vijay")
    hashMap.put(4, "Praveen")
    hashMap.put(2, "Ajay")
    println(".....traversing hashmap.......")
    hashMap.replace(3, "Ashu")
    for (i in hashMap.keys) {
        println("Element at key $i = ${hashMap[i]}")
    }
    println(hashMap.size)

}