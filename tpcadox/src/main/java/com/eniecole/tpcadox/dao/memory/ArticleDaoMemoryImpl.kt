package com.eniecole.tpcadox.dao.memory

import android.os.Build
import androidx.annotation.RequiresApi
import com.eniecole.tpcadox.bo.Article
import com.eniecole.tpcadox.dao.IArticleDao
import java.time.LocalDate

class ArticleDaoMemoryImpl : IArticleDao {
    override fun getById(id: Long): Article {
        TODO("Not yet implemented")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getAll(): List<Article> {
        return listOf(
            Article(1, "Article 1", "Description de l'article 1", 29.99, "url1.com", true,3, LocalDate.now()),
            Article(2, "Article 2", "Description de l'article 2", 49.99, "url2.com", false,3, LocalDate.now()),
            Article(3, "Article 3", "Description de l'article 3", 9.99, "url3.com", true,3, LocalDate.now()),
            Article(4, "Article 4", "Description de l'article 4", 79.99, "url4.com", false,3, LocalDate.now()),
            Article(5, "Article 5", "Description de l'article 5", 99.99, "url5.com", true,3, LocalDate.now()),
            Article(6, "Article 6", "Description de l'article 6", 19.99, "url6.com", false,3, LocalDate.now()),
            Article(7, "Article 7", "Description de l'article 7", 39.99, "url7.com", true, 3,LocalDate.now()),
            Article(8, "Article 8", "Description de l'article 8", 59.99, "url8.com", false,3, LocalDate.now()),
            Article(9, "Article 9", "Description de l'article 9", 69.99, "url9.com", true, 3,LocalDate.now()),
            Article(10, "Article 10", "Description de l'article 10", 89.99, "url10.com", true,3, LocalDate.now()),
            Article(11, "Article 11", "Description de l'article 11", 9.99, "url11.com", false,3, LocalDate.now()),
            Article(12, "Article 12", "Description de l'article 12", 29.99, "url12.com", true,3, LocalDate.now()),
            Article(13, "Article 13", "Description de l'article 13", 39.99, "url13.com", false,3, LocalDate.now()),
            Article(14, "Article 14", "Description de l'article 14", 49.99, "url14.com", true,3, LocalDate.now()),
            Article(15, "Article 15", "Description de l'article 15", 59.99, "url15.com", true,3, LocalDate.now())
        )
    }

}
