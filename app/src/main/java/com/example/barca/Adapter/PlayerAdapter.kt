package com.example.barca.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.barca.databinding.BarcaitemBinding
import com.example.barca.model.Information

class PlayerAdapter(private  val playerlist: ArrayList<Information>): RecyclerView.Adapter<PlayerAdapter.MyViewHolder>() {
    var onClick:((Information)-> Unit)? = null

    class MyViewHolder( val binding: BarcaitemBinding):RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = BarcaitemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return playerlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply{
            playername.text = playerlist[position].playername
            playerpostion.text = playerlist[position].playername
            playerprice.text = "price: $" + playerlist[position].playerprice.toString()
            playerImg.setImageResource(playerlist[position].playerImg)
        }
        holder.itemView.setOnLongClickListener{
            AlertDialog.Builder(holder.itemView.context)
                .setTitle("Delete player Item")
                .setTitle("Are you sure you want to delete this item?")
                .setPositiveButton("Yes") { _, _ ->
                    playerlist.removeAt(position)
                    notifyItemRemoved(position)
                }
                .setNegativeButton("no", null)
                .show()
            true

        }
    }
}