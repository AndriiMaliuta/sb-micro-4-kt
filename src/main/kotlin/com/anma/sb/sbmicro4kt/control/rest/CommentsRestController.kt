package com.anma.sb.sbmicro4kt.control.rest

import com.anma.sb.sbmicro4kt.models.Comment
import com.anma.sb.sbmicro4kt.repo.CommentRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentsRestController(val commentRepo: CommentRepo) {

    @GetMapping("/rest/comments")
    fun getComments(): List<Comment> {

        return commentRepo.findAll()
    }
}