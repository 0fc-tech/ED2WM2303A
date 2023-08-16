package com.eniecole.tpcadox.dao

import com.eniecole.tpcadox.bo.Article

interface IArticleDao {
    fun getById(id: Long): Article
    fun getAll(): List<Article>
}