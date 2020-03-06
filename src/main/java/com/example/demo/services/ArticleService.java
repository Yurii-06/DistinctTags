package com.example.demo.services;

import com.example.demo.entities.Article;
import com.example.demo.entities.Tag;
import com.example.demo.repo.ArticleRepo;
import com.example.demo.repo.TagRepo;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ArticleService {
    ArticleRepo articleRepo;

    @Transactional
    public void saveArticleWithTags() {

        HashSet<Tag> tags = new HashSet<>();
        Tag music = new Tag("music");
        Tag poem = new Tag("poem");
        Tag nature = new Tag("nature");
        tags.add(music);
        tags.add(poem);
        tags.add(nature);

        Article article = new Article("some content");
        article.setTagSet(tags);

        articleRepo.save(article);
    }
}
