package demo.mxyang.com.kotlin.interfacesss

/**
 * Created by Administrator on 2017/5/25.
 */
class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}