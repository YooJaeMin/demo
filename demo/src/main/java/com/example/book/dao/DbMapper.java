package com.example.book.dao;
 
import java.util.List;

import com.example.book.dto.Books;
  
public interface DbMapper {
 
    public List<Books> getAll() throws Exception;
    	
}