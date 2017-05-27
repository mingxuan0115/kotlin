package demo.mxyang.com.kotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by Administrator on 2017/5/27.
 */
class DemoDragRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private var mData: ArrayList<Any>

    companion object {
        open val TYPE_TITLE: Int = 1
        open val TYPE_SUB_IMG: Int = 2
    }

    constructor(data: ArrayList<Any>) : super() {
        this.mData = data
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}