package com.example.moptu.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moptu.model.Comment

class CommentViewModel : ViewModel() {
    private val _comments = MutableLiveData<MutableList<Comment>>().apply {
        value = mutableListOf()
    }
    val myComments: LiveData<MutableList<Comment>> = _comments

    fun addComment(comment: Comment) {
        val currentList = _comments.value ?: mutableListOf()
        currentList.add(comment)
        _comments.value = currentList
    }
}