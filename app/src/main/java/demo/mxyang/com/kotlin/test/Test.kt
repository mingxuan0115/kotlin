package demo.mxyang.com.kotlin.test

import demo.mxyang.com.kotlin.data.Person
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue

/**
 * Created by Administrator on 2017/5/23.
 */


fun main(args: Array<String>) {
//        testWhen(99)
//        testWhen("99")
//    testFor1()
    testLet()
//    testFor2()
//    testBreak()
//    testBean()
//    testUtil()
//    testAny()
}

fun testWhen(obj: Any) {
    when (obj) {
        is Int -> println("is int$obj")
        is String -> println("is String,and length is ->${obj.length}")
        else -> println(" is others")
    }

}

fun testFor() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    for (ss in list) {
        println(ss)
    }
}

fun testFor1() {
    var list = listOf<Int>(1, 2, 3, 4, 5)

    for (i in 0..4) {
        println(list.get(i))
    }
}


fun testFor2() {
    for (i in 1..4 step 2) {
        println(i)
    }
}

fun testDownTo() {
    for (i in 4 downTo 1) {
        println(i)
    }
}

fun testMap() {
    var ints = listOf(1, 2, 3, 4)
    val doubledList = ints.map({ qq -> qq * 2 })
    val doubledList1 = ints.map { it * 2 }
}

fun testBreak() {
    aa@ for (i in 1..2) {
        println("aa->$i")
        bb@ for (b in 1..2) {
            println("bb->$b")
            if (b == 2) {
                continue@bb
            }
        }
    }
}

fun testMethod() {
    val list = listOf<Int>(1, 2, 4, 5)
}

fun testBean() {
    val persons = listOf(Person("Alice"), Person("kotlin", age = 11))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("oldest is : $oldest")
}

fun testUtil() {
    for (i in 1 until 4) {
        println(i)
    }
}

fun testAny() {
    val list = listOf(1, 2, 3, 4, 5)
//    assertTrue(list.any{it%2==0})
//    assertFalse(list.any { it > 10 })

    list.forEachIndexed { index, i -> println("position- $index contains a $i") }
}

fun testLet() {
    var data: String? = "a"
    data?.let { println("tss") }
}


