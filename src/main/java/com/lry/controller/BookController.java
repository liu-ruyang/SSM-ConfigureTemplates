package com.lry.controller;

import java.util.List;

import com.lry.pojo.Book;
import com.lry.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allbook")
    public String list(Model model) {
        List<Book> bookList = bookService.queryAllBook();

        System.out.println(bookList);

        model.addAttribute("list", bookList);

        return "allBook";
    }

}
