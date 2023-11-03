// package com.ndl.library.Controller;

// import org.springframework.data.repository.query.Param;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// public class BookController {
//     @RequestMapping("/search_book")
//     public String searchBook(@Param("keyword") String keyword, Model model)
//     {
//         final List<Book> books = bookService.searchBooks(keyword);

//         model.addAttribute("books", books);
//         model.addAttribute("keyword", keyword);
//         return "list-books";
//     }
// }
