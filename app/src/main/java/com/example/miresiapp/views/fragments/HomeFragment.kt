package com.example.miresiapp.views.fragments

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.example.miresiapp.R

class HomeFragment : Fragment() {
    private lateinit var searcher: SearchView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searcher = view.findViewById(R.id.searcher)

        searcher.setOnSearchClickListener {
            val ac: Activity = requireActivity()
            Intent(ac, SearcherActivity::class.java).apply {
                startActivity(this)
            }
        }
        /*searcher.setOnClickListener {
            val ac: Activity = requireActivity()
            Intent(ac, SearcherActivity::class.java).apply {
                startActivity(this)
            }
        }*/
    }



}