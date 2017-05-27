package demo.mxyang.com.kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator on 2017/5/25.
 */
class KotlinAdapter(val lists: List<String>) : RecyclerView.Adapter<KotlinAdapter.ViewHolder>() {
    override fun getItemCount(): Int = lists.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    holder!!.textview.text=lists[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ViewHolder(TextView(parent!!.context))
    }

    class ViewHolder(val textview: TextView) : RecyclerView.ViewHolder(textview) {

    }
}