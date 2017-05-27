package demo.mxyang.com.kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import demo.mxyang.com.kotlin.base.BaseAdapter
import demo.mxyang.com.kotlin.data.NewsBean
import kotlinx.android.synthetic.main.item.view.*
import kotlinx.android.synthetic.main.recycle_view_layout.*
import org.jetbrains.anko.onClick
import org.jetbrains.anko.onLongClick
import org.jetbrains.anko.toast

/**
 * Created by Administrator on 2017/5/22.
 */
class RecycleViewActivity : AppCompatActivity() {
    val bookA = NewsBean("A", "Jone")
    val bookB = NewsBean("A", "Green")
    val bookC = NewsBean("C", "Mark")
    val news = listOf<NewsBean>(bookA, bookB, bookC)
    var adapter: BaseAdapter<NewsBean>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_view_layout)
        toast("size-> ${news.size}")
        val layoutManager: LinearLayoutManager = LinearLayoutManager(this@RecycleViewActivity)
        recycle_view.layoutManager = layoutManager
        adapter = BaseAdapter(R.layout.item, news) { view: View, item: NewsBean ->
            view.title.text = item.title
            view.time.text = item.time
            view.onClick { toast(item.title) }
            view.onLongClick { itemLongClick(item) }
        }
        adapter = BaseAdapter(R.layout.item, news, { view: View, item: NewsBean ->

            view.title.text = item.title
            view.time.text = item.time
            view.onClick { toast(item.title) }
            view.onLongClick { itemLongClick(item) }
        })

        recycle_view.adapter = adapter
        adapter!!.notifyDataSetChanged()
    }

    fun itemLongClick(item: NewsBean): Boolean {
        toast(item.time)
        return true
    }
}