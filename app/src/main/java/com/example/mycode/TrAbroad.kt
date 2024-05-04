package com.example.mycode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.ads.mediationtestsuite.dataobjects.Country

class TrAbroadActivity : AppCompatActivity() {
    data class Country(val flagResId: Int, val name: String)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_abroad)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val countries = listOf(
            Country(R.drawable.rus, "Россия"),
            Country(R.drawable.tj, "Таджикистан"),
            Country(R.drawable.uz, "Узбекистан"),
            Country(R.drawable.pel, "ОАЭ"),
            Country(R.drawable.kzk, "Казахстан"),
        )
        val adapter = CountryAdapter(countries)
        recyclerView.adapter = adapter


    }


    class CountryAdapter(private val countries: List<Country>) :
        RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

        class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val flagImageView: ImageView = itemView.findViewById(R.id.flag)
            val countryTextView: TextView = itemView.findViewById(R.id.country)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_one, parent, false)
            return CountryViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
            val country = countries[position]
            holder.flagImageView.setImageResource(country.flagResId)
            holder.countryTextView.text = country.name
        }

        override fun getItemCount(): Int = countries.size
    }
}
