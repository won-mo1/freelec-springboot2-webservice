package com.more.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    /*
     *  ibatis, Mybatis 등에서 Dao 라고불리는 DB Layer 접근자
     *  JPA 에선 Repository 라고 불림. 인터페스 생성후 JpaRepository<엔티티클래스, PK 타입>을 상속하면 기본적인 CRUD 메소드자동 생성
     *  주의점. 엔티티클래스와 엔티티Repository 는 함께 위치해야함
     */

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List <Posts> findAllDesc();
}
