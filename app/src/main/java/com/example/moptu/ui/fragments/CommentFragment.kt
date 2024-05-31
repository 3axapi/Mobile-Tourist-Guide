package com.example.moptu.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.moptu.R
import com.example.moptu.model.Comment
import com.example.moptu.viewmodel.CommentViewModel

class CommentFragment : Fragment() {
    private val viewModel: CommentViewModel by activityViewModels()

    lateinit var nameEdit: EditText
    lateinit var emailEdit: EditText
    lateinit var contentsEdit: EditText
    lateinit var starRating: RatingBar
    lateinit var sendButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_comment,
            container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEdit = view.findViewById(R.id.comment_name)
        emailEdit = view.findViewById(R.id.comment_email)
        contentsEdit = view.findViewById(R.id.comment_contents)
        starRating = view.findViewById(R.id.ratingBar)
        sendButton = view.findViewById(R.id.send_button)

        /* comment = Comment(
            nameEdit.text.toString(),
            emailEdit.text.toString(),
            contentsEdit.text.toString(),
            starRating.rating.toString()
        ) */

        sendButton.setOnClickListener {
            val comment = Comment(
                nameEdit.text.toString(),
                emailEdit.text.toString(),
                contentsEdit.text.toString(),
                starRating.rating.toString()
            )
            viewModel.addComment(comment)
        }
    }
}