package com.example.moptu.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.moptu.R
import com.example.moptu.adapters.ImagesGridAdapter
import com.example.moptu.adapters.OnImageClickListener
import com.example.moptu.model.Places

class AdviserListFragment : Fragment(), OnImageClickListener {
    lateinit var gridView: GridView
    lateinit var listOfPlaces: List<Places.Place>
    lateinit var listOfTitles: List<String>
    lateinit var listOfImages: List<Int>
    lateinit var listOfDescriptions: List<String>

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
        listOfDescriptions = listOfPlaces.map { it.description }
        gridView = view.findViewById(R.id.gridView_places)
        gridView.adapter = ImagesGridAdapter(
            requireContext(), listOfTitles, listOfImages, listOfDescriptions, this
        )
    }

    override fun onImageClick(placeTitle: String, imageId: Int, placeDescription: String) {
        val detailsFragment: AdviserDetailFragment = AdviserDetailFragment.newInstance(placeTitle, imageId, placeDescription)
        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.welcome_fragment, detailsFragment)
            ?.addToBackStack(null)
            ?.commit()
    }
}