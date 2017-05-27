package demo.mxyang.com.kotlin.util

import android.app.Activity
import android.widget.Toast

/**
 * Created by Administrator on 2017/5/24.
 */
/**
 * 自定义toast的扩展函数
 */
fun Activity.myToast(message: String, time: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, time).show()
}