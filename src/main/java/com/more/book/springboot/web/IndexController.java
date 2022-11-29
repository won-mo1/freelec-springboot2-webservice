package com.more.book.springboot.web;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
        //mustache 스타터 덕분에 컨트롤러에서 문자열을 반화할 때 앞의경로와 뒤의 파일확장자는 자동으로 지정된다.
        //앞의 경로는 src/main/resources/templates/index.mustache 로 전환되어 View Resolver 가 처리하게 됨
    }
}
