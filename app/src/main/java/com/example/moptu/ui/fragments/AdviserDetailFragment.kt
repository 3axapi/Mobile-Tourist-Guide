package com.example.moptu.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.moptu.R

class AdviserDetailFragment : Fragment() {
    companion object {
        fun newInstance(placeTitle: String, imageId: Int, placeDescription: String) =
            AdviserDetailFragment().apply {
                arguments = Bundle().apply {
                    putString("placeTitle", placeTitle)
                    putInt("imageId", imageId)
                    putString("placeDescription", placeDescription)
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(
            R.layout.fragment_adviser_detail,
            container, false
        )

        val titleView: TextView = view.findViewById(R.id.details_title)
        val imageView: ImageView = view.findViewById(R.id.details_image)
        val descriptionView: TextView = view.findViewById(R.id.details_description)
        val title = arguments?.getString("placeTitle")
        val imageId = arguments?.getInt("imageId") ?: R.drawable.ic_launcher_foreground
        val description = arguments?.getString("placeDescription")

        titleView.text = title
        imageView.setImageResource(imageId)
        descriptionView.text = description

        return view
    }

}