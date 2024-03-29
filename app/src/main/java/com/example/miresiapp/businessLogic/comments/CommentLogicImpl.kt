package com.example.miresiapp.businessLogic.comments

import com.example.miresiapp.businessLogic.comments.IComment.*
import com.example.miresiapp.models.CommentModel

class CommentLogicImpl(private val view: ViewPresenter, private val model: ModelPresenter): Presenter {
    private var listComment: MutableList<CommentModel>? = null

    override suspend fun requestComments(resiId: Int, limit: Int) {
        listComment = model.getComments(resiId, limit)
        listComment?.let {
            view.setComments(it)
        }
    }

    override suspend fun pushComment(commentModel: CommentModel) {
    }
}