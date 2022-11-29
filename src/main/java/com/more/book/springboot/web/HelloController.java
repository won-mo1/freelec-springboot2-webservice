package com.more.book.springboot.web;

import com.more.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController : 컨트롤러를 JSON 을 반환하는 컨트롤러로 만들어줌
public class HelloController {

    @GetMapping("/hello")   //@GetMapping : HTTP Method 인 Get 의 요청을 받을 수 있는 API 를 만들어줌
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){ //(1)
        return new HelloResponseDto(name, amount);
    }
}

/**
 * (1) @RequestParam("name")
 *     외부에서 API 로 넘긴 파라미터를 가져오는 어노테이션
 */