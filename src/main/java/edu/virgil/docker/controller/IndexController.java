package edu.virgil.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author virgil.Wang
 * @date 2019/7/25 16:54
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String defaultIndex() {
        return "hello docker, I am virgil!";
    }

    @GetMapping("/index")
    public String index() {
        return "hello docker, I am virgil!";
    }

}
