package com.example.barca

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.barca.Adapter.PlayerAdapter
import com.example.barca.databinding.ActivityMainBinding
import com.example.barca.databinding.BarcaitemBinding
import com.example.barca.model.Activity_details
import com.example.barca.model.Information

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var PlayerAdapter: PlayerAdapter
    val information = ArrayList<Information>()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)


        binding.BarcaDetails.layoutManager = LinearLayoutManager(this)

        information.add(Information("Lionel Messi", "RWF", 1000.0, R.drawable.messi, "GOAT"))
        information.add(Information("Luis Suarez", "CF", 1000.0, R.drawable.suarez, "Undarated"))
        information.add(Information("Neymar Jr", "LWF", 1000.0, R.drawable.neymar, "Magic"))
        information.add(Information("Andress Iniesta", "CMF", 1000.0, R.drawable.iniesta, "Assister"))
        information.add(Information("Xavi", "CMF", 1000.0, R.drawable.xavi, "Technic"))
        information.add(Information("Busquest", "DMF", 1000.0, R.drawable.busi, "passing"))
        information.add(Information("Jordi Alba", "LB", 1000.0, R.drawable.alaba, "Talent"))
        information.add(Information("Carlos Puqol", "CMF", 1000.0, R.drawable.puyol, "wall"))
        information.add(Information("Gerrad Pique", "CMF", 1000.0, R.drawable.pique, "deffence"))
        information.add(Information("Dani Alves", "CMF", 1000.0, R.drawable.dani, "Strenght"))
        information.add(Information("Victor Valbes", "CMF", 1000.0, R.drawable.victor, "great"))

        PlayerAdapter = PlayerAdapter(information)
        binding.BarcaDetails.adapter = PlayerAdapter

        PlayerAdapter.onClick = {
            information
            val intent = Intent(this, Activity_details::class.java)
            intent.putExtra("player", information)
            intent.putExtra("postion", information)
            intent.putExtra("price", information)
            intent.putExtra("Img", information)
            intent.putExtra("Desc", information)
            startActivity(intent)
        }

        binding.addBtn.setOnClickListener {


        }
    }
}
