package ua.com.dynamicrecyclerview.drawingreadingswelder.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.dynamicrecyclerview.drawingreadingswelder.databinding.NewsBinding
import ua.com.dynamicrecyclerview.drawingreadingswelder.viewmodel.NavagationsSceneMVVM
import android.widget.Toast
import android.R.attr.onClick
import android.view.View
import androidx.annotation.NonNull



class NavagationsSceneCustomAdapter(private val arrays : List<NavagationsSceneMVVM>) :
        RecyclerView.Adapter<NavagationsSceneCustomAdapter.NavagationsSceneView>() {

    private var layoutInflater : LayoutInflater? = null;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavagationsSceneView {

        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.context)
        }

        val newsBinding = NewsBinding.inflate(layoutInflater!!, parent, false)

        return NavagationsSceneView(newsBinding)
    }

    override fun onBindViewHolder(holder: NavagationsSceneView, position: Int) {
        Log.d("TAG", arrays.size.toString() + " adapter")
        holder.bind(arrays[position])
    }

    override fun getItemCount(): Int = arrays.size



    class NavagationsSceneView(val newsBinding: NewsBinding) :
            RecyclerView.ViewHolder(newsBinding.root), View.OnClickListener {

//        val title : TextView
//
//        init {
//            title = item.findViewById(R.id.title)
//        }

        fun bind(navigationsSceneMVVM: NavagationsSceneMVVM){
            newsBinding.newsView = navigationsSceneMVVM
        }

        override fun onClick(view: View) {
            Toast.makeText(view.getContext(), "Clicked" + view.toString(), Toast.LENGTH_SHORT).show()
        }



        fun getNewsBindings() : NewsBinding = newsBinding

    }
}