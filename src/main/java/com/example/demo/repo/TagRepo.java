package com.example.demo.repo;

import com.example.demo.entities.Article;
import com.example.demo.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepo extends JpaRepository<Tag, String> {

}
