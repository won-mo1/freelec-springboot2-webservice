package com.more.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor  //롬복라이브러리의 어노테이션. 기본생성자 자동추가
@Entity // 테이블과 링크될 클래스임을 나타냄, 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍으로 테이블 이름매칭
public class Posts {

    @Id //해달 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙
    private Long id;

    @Column(length = 500, nullable = false) //테이블컬럼을 나타내며 굳이 선언하지 않아도 클래스 필드는 모두 컬럼이됨. 사용이유는 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용함
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    //해당 클래스의 빌더 패턴 클래스생성
    public Posts(String title, String content, String author){
        this.title  = title;
        this.content = content;
        this.author  = author;

    }
}
