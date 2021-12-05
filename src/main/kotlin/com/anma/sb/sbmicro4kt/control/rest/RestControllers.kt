package com.anma.sb.sbmicro4kt.control.rest

import com.anma.sb.sbmicro4kt.models.Comment
import com.anma.sb.sbmicro4kt.models.Person
import com.anma.sb.sbmicro4kt.repo.CatRepo
import com.anma.sb.sbmicro4kt.repo.CommentRepo
import com.anma.sb.sbmicro4kt.repo.PersonRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/rest/")
class RestControllers(val commentRepo: CommentRepo,
                      val catRepo: CatRepo,
                      val personRepo: PersonRepo
) {

    @GetMapping("comments")
    fun getComments(): List<Comment> {

        return commentRepo.findAll()
    }

    @GetMapping("persons")
    fun persons(): List<Person> {

        return personRepo.findAll()
    }

    @GetMapping("persons/{personId}")
    fun personById(@PathVariable(name = "personId") personId: Long): Person {

        return personRepo.findById(personId).get()
    }
}