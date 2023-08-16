package com.eniecole.tpcadox.dao

import com.eniecole.tpcadox.dao.memory.ArticleDaoMemoryImpl

object DaoFactory {
    fun getArticleDao(type: DaoType): IArticleDao{
        return when(type){
            //DaoType.DB -> ArticleDaoDbImpl()
            DaoType.MEMORY -> ArticleDaoMemoryImpl()
            //DaoType.INTERNET -> ArticleDaoInternetImpl()
            else -> ArticleDaoMemoryImpl()
        }
    }
}