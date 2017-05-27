package demo.mxyang.com.kotlin.interfacesss

import demo.mxyang.com.kotlin.test.testUtil

/**
 * Created by Administrator on 2017/5/25.
 */

fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    Derived(b).print()

    val e=Example()
    println(e.msg)
    e.msg="new message"
    println(e.msg)
}