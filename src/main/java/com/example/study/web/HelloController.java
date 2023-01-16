package com.example.study.web;

import com.example.study.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 컨트롤러를 JSON를 반환하는 컨트롤러로 만들어 줌
public class HelloController {

    @GetMapping("/hello")  // HTTP Method인 Get의 요청을 받을 수 있는 API 만들어 줌

    public String Hello(){
        return "hello";
    }
    @GetMapping("/hello/dto")

    public HelloResponseDto helloDto(
            @RequestParam("name") String name,  // @RequestParam -  외부에서 API로 넘긴 파라미터를 가져옴
            @RequestParam("amount") int amount
    ){
        return new HelloResponseDto(name,amount);
    }
}
