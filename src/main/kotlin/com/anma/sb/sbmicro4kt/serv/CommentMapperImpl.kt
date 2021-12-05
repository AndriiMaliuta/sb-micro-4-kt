//package com.anma.sb.sbmicro4kt.serv
//
//import com.anma.sb.sbmicro4kt.models.Comment
//import com.anma.sb.sbmicro4kt.models.web.CommentWeb
//import org.mapstruct.factory.Mappers
//import org.springframework.stereotype.Service
//
//@Service
//class CommentMapperImpl : CommentMapper {
//
////    val INSTANCE: CommentMapper
////        get() = Mappers.getMapper(CommentMapper::class.java)
//
//    var INSTANCE: CommentMapper = Mappers.getMapper(CommentMapper::class.java)
//
//    override fun convertToWeb(comment: Comment): CommentWeb {
//
//        return INSTANCE.convertToWeb(comment)
//    }
//
//    override fun convertToModel(comment: CommentWeb): Comment {
//        TODO("Not yet implemented")
//    }
//}