package com.example.sweater.repos;

import com.example.sweater.domain.Post;
import com.example.sweater.domain.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
