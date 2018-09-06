package com.xpy.web;

import com.xpy.Service.BookService;
import com.xpy.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class BookController {

    @Autowired
    private BookService bookService;

    private List<Book> bookList;

    @RequestMapping(value="/books", method=RequestMethod.GET)
    public List<Book> getBooks(){

        List<Book> bookList=new ArrayList<Book>();
        bookList=bookService.getBooks();

        return bookList;
    }

    @RequestMapping(value="/books", method=RequestMethod.POST)
    public Book saveBook(@RequestParam String name,
                         @RequestParam String description,
                         @RequestParam String author,
                         @RequestParam String isbn,
                         @RequestParam int status,
                         @RequestParam Long id){

        Book newBook=new Book();
        newBook.setAuthor(author);
        newBook.setName(name);
        newBook.setDescription(description);
        newBook.setIsbn(isbn);
        newBook.setStatus(status);
        newBook.setId(id);

        newBook=bookService.save(newBook);

        return newBook;
    }



    @RequestMapping(value="/books", method=RequestMethod.DELETE)
    public Book deleteBook(@RequestParam String name,
                           @RequestParam String description,
                           @RequestParam String author,
                           @RequestParam String isbn,
                           @RequestParam int status,
                           @RequestParam Long id){

        Book newBook=new Book();
        newBook.setAuthor(author);
        newBook.setName(name);
        newBook.setDescription(description);
        newBook.setIsbn(isbn);
        newBook.setStatus(status);
        newBook.setId(id);

        newBook=bookService.save(newBook);

        return newBook;
    }
}
