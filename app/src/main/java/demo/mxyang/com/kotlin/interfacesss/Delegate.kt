package demo.mxyang.com.kotlin.interfacesss

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Administrator on 2017/5/26.
 */
class Delegate : ReadWriteProperty<Any?, String> {

    private var message = "Default message"
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "${property.name}=$message form $thisRef"
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        message = value.toString()
    }


}