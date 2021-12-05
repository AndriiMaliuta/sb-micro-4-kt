package com.anma.sb.sbmicro4kt.control

import com.anma.sb.sbmicro4kt.models.Comment
import com.anma.sb.sbmicro4kt.repo.CommentRepo
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController() {

    @GetMapping("/")
    fun home(model: Model): String {
        return "home"
    }

}

@Controller
class CommentsPageController(val commentRepo: CommentRepo) {

    @GetMapping("/comments")
    fun comments(model: Model): String {

        val comments: List<Comment> = commentRepo.findAll()

        model.addAttribute("comments", comments)

        return "comments"
    }

}