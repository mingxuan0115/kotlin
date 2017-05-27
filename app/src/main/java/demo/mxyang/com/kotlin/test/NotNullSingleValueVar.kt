package demo.mxyang.com.kotlin.test

import android.support.v7.app.ActionBarDrawerToggle
import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Administrator on 2017/5/25.
 */
class NotNullSingleValueVar<T>() : ReadWriteProperty<Any?, T> {

    private var value: T? = null
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


    }

}