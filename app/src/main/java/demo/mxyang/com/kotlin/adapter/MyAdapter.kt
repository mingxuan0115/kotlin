package demo.mxyang.com.kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import demo.mxyang.com.kotlin.R
import demo.mxyang.com.kotlin.base.BaseAdapter
import demo.mxyang.com.kotlin.data.NewsBean
import kotlinx.android.synthetic.main.item.view.*
import org.jetbrains.anko.layoutInflater

/**
 * Created by Administrator on 2017/5/22.
 */
class MyAdapter(var data: List<NewsBean>) : RecyclerView.Adapter<MyAdapter.MyAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterViewHolder {
        val view = parent.context.layoutInflater.inflate(R.layout.abc_action_bar_title_item, parent, false)
        return MyAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapterViewHolder, position: Int) {
        bindView(holder.itemView, position)
    }

    fun bindView(itemView: View, position: Int) {
        val new = data[position]
        itemView.title.text = new.title
        itemView.time.text = new.time


    }

    override fun getItemCount(): Int = data.size


    class MyAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}