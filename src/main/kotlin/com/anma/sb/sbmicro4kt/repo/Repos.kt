package com.anma.sb.sbmicro4kt.repo

import com.anma.sb.sbmicro4kt.models.Cat
import com.anma.sb.sbmicro4kt.models.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CatRepo : JpaRepository<Cat, Long> {

}

interface CommentRepo : JpaRepository<Comment, Long> {

}