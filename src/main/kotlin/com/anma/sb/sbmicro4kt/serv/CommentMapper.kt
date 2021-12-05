package com.anma.sb.sbmicro4kt.serv

import com.anma.sb.sbmicro4kt.models.Comment
import com.anma.sb.sbmicro4kt.models.web.CommentWeb
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Component

@Mapper(componentModel = "cdi")
interface CommentMapper {

    @Mapping(source = "comment_id", target = "comment_id")
    fun convertToWeb(comment: Comment): CommentWeb

    @InheritInverseConfiguration
    fun convertToModel(comment: CommentWeb): Comment
}