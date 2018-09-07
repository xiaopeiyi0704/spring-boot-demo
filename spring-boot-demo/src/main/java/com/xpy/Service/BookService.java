package com.xpy.Service;

import com.xpy.model.Book;
import com.xpy.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> getBooks(){

        List<Book> bookList=new ArrayList<Book>();
        bookList=bookRepository.findAll();

        return bookList;
    }

    public Book save(Book book){

       Book newBook=bookRepository.save(book);

        return newBook;
    }

    public Book getOne(long id){

        return bookRepository.findById(id).get();

    }


    public void delete (long id){

        bookRepository.deleteById(id);
    }


}
