package com.anma.sb.sbmicro4kt.config

import com.anma.sb.sbmicro4kt.repo.CommentRepo
import com.anma.sb.sbmicro4kt.serv.CommentMapper
import org.mapstruct.factory.Mappers
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class Bootstrap(
    val commentRepo: CommentRepo,
//    val commentMapper: CommentMapper
) : CommandLineRunner{

    //    @Bean
//    fun mapper(): CommentMapper {
//        return Mappers.getMapper(CommentMapper::class.java)
//    }
//    @Autowired
//    private val commentMapper: CommentMapper = Mappers.getMapper()
    private val logger: Logger = LoggerFactory.getLogger(Bootstrap::class.java)

    override fun run(vararg args: String?) {
        loadData()
    }

    private fun loadData() {
//        val mapper: CommentMapper = Mappers.getMapper(CommentMapper::class.java)
        logger.info(" == Loading data")
        val comment = commentRepo.findById(19993)
//        val commentWeb = commentMapper.convertToWeb(comment.get())
//        logger.info(commentWeb.toString())
    }
}