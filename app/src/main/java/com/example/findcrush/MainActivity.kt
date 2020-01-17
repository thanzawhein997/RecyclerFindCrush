package com.example.findcrush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findcrush.adapter.FindcrushAdapter
import com.example.findcrush.model.Findcrushdataclass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val recyclerView:RecyclerView=findViewById(R.id.findcrush_recycler)

        recyclerView.layoutManager =LinearLayoutManager(this)

        val findcrusharray=ArrayList<Findcrushdataclass>()
        findcrusharray.add(Findcrushdataclass(R.drawable.single1,"John Smit",R.drawable.couple1))
        findcrusharray.add(Findcrushdataclass(R.drawable.single2,"Camila Tin",R.drawable.couple2))

        val findcrushAdapter= FindcrushAdapter(findcrusharray)

        recyclerView.adapter=findcrushAdapter



    }

}
