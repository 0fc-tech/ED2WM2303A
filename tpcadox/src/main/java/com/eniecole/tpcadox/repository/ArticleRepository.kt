package com.eniecole.tpcadox.repository

import com.eniecole.tpcadox.bo.Article
import com.eniecole.tpcadox.dao.DaoFactory
import com.eniecole.tpcadox.dao.DaoType
import com.eniecole.tpcadox.dao.IArticleDao
import com.eniecole.tpcadox.dao.memory.ArticleDaoMemoryImpl

object ArticleRepository {
    private val daoArticleMemory : IArticleDao = DaoFactory.getArticleDao(DaoType.MEMORY)
    private val daoArticleInternet : IArticleDao = DaoFactory.getArticleDao(DaoType.INTERNET)
    private val daoArticleDb : IArticleDao = DaoFactory.getArticleDao(DaoType.DB)

    fun getArticleById(id: Long): Article {
        return daoArticleMemory.getById(id)
    }
    fun getAll() : List<Article> {
        return daoArticleMemory.getAll()
    }
}