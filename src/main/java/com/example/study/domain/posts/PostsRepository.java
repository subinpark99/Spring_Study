package com.example.study.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    // Posts 클래스로 Database에 접근하게 해 줌
}