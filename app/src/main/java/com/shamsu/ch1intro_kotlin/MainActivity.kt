package com.shamsu.ch1intro_kotlin
import java.util.*

// Todo
// Advantage Of Kotlin
//1)  Syntax is one of Kotlin's strongest advantages.
// 2)As described earlier, Kotlin requires significantly fewer lines of code compared to what would be required in Java
// 3)his makes the code more readable and simpler, which generally also leads to the code being of better quality because bugs and errors are easier to find

//4) Similar to python or dart ;
// 5) More feature ;
//6) Can not decoding koltin app;

// Tech (coding)

//Primitive types are objects.
// It is a product of JetBrains.
//It is used to develop server-side applications and android application development.
//Its compilation time is slow in comparison to Java.
//Kotlin uses the extensions: .kt (for Kotlin source file), .kts (for Kotlin script file), .ktm (for Kotlin module)
//There is no need to catch or declare any exception.
//We cannot assign null values to any variable and objects.

//	It does not support ternary operator.

// Jdk
// Jvm  = For Run Bytecode of java
// Sdk


// * entry point  of Kotlin
// fun main()
//{
//
//}


fun main() {
    val dd2: Double = 45.5
    dd2.compareTo(45.5);
    val gg: Boolean
    gg = true;

    val mm: String = "ksajasfh"
// Static array
    val arr: IntArray = intArrayOf(1, 2, 99, 5)
    println(Arrays.toString(arr))
    // dynamic array
    val arrdaynamic = arrayOf("mayur", true, 12.2)

    println(arrdaynamic[0])
// While Loop
    var i = 0
    while (i < 3) {
        println(arrdaynamic[i])
        i++
    }

    // For Loop
    println("===${dd2.compareTo(4.5)}")

    var dd = true
    println("H.p Shiyani")
    println(dd)
    Myfunction("Haresh", 123, dd);
    print(Myfunction("Haresh", 123, dd));
}

fun Myfunction(s: String, i: Int, dd: Boolean): Int {
    return 7777
}











