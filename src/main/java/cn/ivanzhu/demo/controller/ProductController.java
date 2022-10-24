package cn.ivanzhu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo/product")
public class ProductController {

    @GetMapping("/detail")
    public Object detail() {
        return "这是一个商品";
    }
}
