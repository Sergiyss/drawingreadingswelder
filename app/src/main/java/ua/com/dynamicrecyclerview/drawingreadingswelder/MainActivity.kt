package ua.com.dynamicrecyclerview.drawingreadingswelder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ua.com.dynamicrecyclerview.drawingreadingswelder.adapter.NavagationsSceneCustomAdapter
import ua.com.dynamicrecyclerview.drawingreadingswelder.viewmodel.NavagationsSceneMVVM

class MainActivity : AppCompatActivity() {

    private var array : ArrayList<NavagationsSceneMVVM> = ArrayList()

    private lateinit var recycler : RecyclerView
    private lateinit var adapter : NavagationsSceneCustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.rv)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = NavagationsSceneCustomAdapter(array)

        addDummyData()

    }

    private fun addDummyData() {

        val user0 = NavagationsSceneMVVM("Igor Vad", "null")
        array.add(user0)
        val user1 = NavagationsSceneMVVM("Koss Log Dog",
                "null")
        array.add(user1)
        val user2 = NavagationsSceneMVVM("Iorn Man", "null")
        array.add(user2)
        val user3 = NavagationsSceneMVVM("Thor", "null")
        array.add(user3)
        val user4 = NavagationsSceneMVVM("Loki", "null")
        array.add(user4)
        val user5 = NavagationsSceneMVVM("Booger", "null")
        array.add(user5)

        recycler.adapter?.notifyDataSetChanged()
        Log.d("TAG", array.size.toString())
    }
}
