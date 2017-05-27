package demo.mxyang.com.kotlin.Oper

import android.util.Log

/**
 * Created by Administrator on 2017/5/22.
 */
class ListOper {

    fun listOperetion(){
        val list1= listOf(1,2,3,4,5)
        val list2= listOf(6,7,8,9)
        val list3= listOf<String>("One","Two","Three","Four","Five")

        println(list1.zip(list3))
        println(list1.zip(list2){itm1,it2->itm1+it2})
        println(list1.partition { it>3 })
        println(list1.plus(list2))
//        I/System.out: [(1, One), (2, Two), (3, Three), (4, Four), (5, Five)]
//        05-22 18:29:45.422 25698-25698/demo.mxyang.com.kotlin I/System.out: [7, 9, 11, 13]
//        05-22 18:29:45.422 25698-25698/demo.mxyang.com.kotlin I/System.out: ([4, 5], [1, 2, 3])
//        05-22 18:29:45.422 25698-25698/demo.mxyang.com.kotlin I/System.out: [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        println(listOf())
    }
}