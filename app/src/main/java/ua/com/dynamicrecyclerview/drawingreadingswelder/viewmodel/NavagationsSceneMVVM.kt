package ua.com.dynamicrecyclerview.drawingreadingswelder.viewmodel

import android.view.View
import android.widget.Toast

data class NavagationsSceneMVVM(var titleNavigation : String, var url : String) : View.OnClickListener{
    override fun onClick(p0: View?) {
        Toast.makeText(p0?.getContext(), titleNavigation, Toast.LENGTH_SHORT).show()
    }

}