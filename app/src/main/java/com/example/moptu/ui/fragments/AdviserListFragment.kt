package com.example.moptu.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.moptu.R
import com.example.moptu.adapters.ImagesGridAdapter
import com.example.moptu.model.Places

class AdviserListFragment : Fragment() {
    lateinit var gridView: GridView
    lateinit var listOfPlaces: List<Places.Place>
    lateinit var listOfTitles: List<String>
    lateinit var listOfImages: List<Int>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_adviser_list,
            container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listOfPlaces = Places.getPlaces()
        listOfTitles = listOfPlaces.map { it.title }
        listOfImages = listOfPlaces.map { it.imageResId }
        gridView = view.findViewById(R.id.gridView_places)
        gridView.adapter = ImagesGridAdapter(requireContext(), listOfTitles, listOfImages)
    }
}