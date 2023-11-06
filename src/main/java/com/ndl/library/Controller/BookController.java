package com.ndl.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("/book-search")
    public String bookSearch(){
        return "books-lookup";
    }
}
