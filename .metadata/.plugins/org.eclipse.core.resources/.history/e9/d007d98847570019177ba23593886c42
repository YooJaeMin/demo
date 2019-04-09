package com.example.book.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.dao.DbMapper;
import com.example.book.dto.Books;

@Service
public class BookService {
 
    @Autowired
    DbMapper dbMapper;
    
    public List<Books> getAll() throws Exception{
        return dbMapper.getAll();
    }
}