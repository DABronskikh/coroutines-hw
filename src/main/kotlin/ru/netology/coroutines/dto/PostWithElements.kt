package ru.netology.coroutines.dto

data class PostWithElements(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>,
)
