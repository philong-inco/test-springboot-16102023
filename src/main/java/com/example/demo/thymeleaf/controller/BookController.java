package com.example.demo.thymeleaf.controller;

import com.example.demo.thymeleaf.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
@RequestMapping("/list")
public class BookController {
    @GetMapping
    public String index(Model model){
        model.addAttribute("title", "Danh sách đang bán");
        model.addAttribute("maintitle", "Sách đang Hót hòn họt...:))");
        model.addAttribute("list", Arrays.asList(
                new Book(1L, "Sách thiếu nhi", "Đây là sách thiếu nhi", 233, 435.5f),
                new Book(2L, "Sách người lớn", "Đây là sách 18+ đó nha", 69, 6969.69f),
                new Book(3L, "Sách chuyên ngành", "Đây là sách Java EE", 45, 33.56f),
                new Book(4L, "Sách thiếu nhi", "Đây là sách thiếu nhi", 233, 435.5f),
                new Book(5L, "Sách người lớn", "Đây là sách 18+ đó nha", 69, 6969.69f),
                new Book(6L, "Sách chuyên ngành", "Đây là sách Java EE", 45, 33.56f)
        ));
        return "listbook";
    }
}
