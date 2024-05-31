package com.example.moptu.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.moptu.R
import com.example.moptu.adapters.CommentsGridAdapter
import com.example.moptu.model.Comment
import com.example.moptu.viewmodel.CommentViewModel

class WelcomeFragment : Fragment() {
    private val viewModel: CommentViewModel by activityViewModels()
    lateinit var gridView: GridView
    lateinit var comment_names: List<String>
    lateinit var comment_emails: List<String>
    lateinit var comment_ratings: List<String>
    lateinit var comment_contents: List<String>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_welcome,
            container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gridView = view.findViewById(R.id.gridView_comments)

        viewModel.myComments.observe(viewLifecycleOwner) { comments ->
            comment_names = comments.map { it.name }
            comment_emails = comments.map { it.email }
            comment_ratings = comments.map { it.rating }
            comment_contents = comments.map { it.contents }

            /* gridView.adapter = CommentsGridAdapter(
                requireContext(), comment_names, comment_emails, comment_ratings, comment_contents
            ) */

            val adapter = CommentsGridAdapter(
                requireContext(), comment_names, comment_emails, comment_ratings, comment_contents
            )
            gridView.adapter = adapter
            adapter.notifyDataSetChanged()
        }


    }
}