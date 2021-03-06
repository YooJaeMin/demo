package com.example.book.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.dto.Books;
import com.example.book.service.BookService;
 
@RestController
@RequestMapping("/book")
public class BookController implements ErrorController{
 
    @Autowired
    BookService bookService;
    @RequestMapping("/getall")	
    public List<Books> query() throws Exception{
        return bookService.getAll();
    }
    
    @Override
    public @ResponseBody String getErrorPath(){
        return "/error";
    }
    
    @RequestMapping("/tosha")	
    public void toSha() throws Exception{
    	List<Books> bookList = bookService.getAll();
    	for (int i = 0; i < bookList.size(); i++) {
			
		}
//        return bookService.getAll();
    }
 
}
