package com.xpy.web;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
=======
import com.xpy.Service.BookService;
import com.xpy.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
>>>>>>> e32554508dd31d60c68467ed16108b6c6bba789f

@Controller
public class BookController2 {

<<<<<<< HEAD
    @GetMapping("/books")
    public String list(){
        return "books";
    }
=======
    @Autowired
    BookService bookService;

    @GetMapping("/book/{id}")
    public String getBook(@PathVariable long id, Model model){

        //Model model arg just like HttpRequest/HttpResponse in MAV in regular Spring, it has to be used this way
        //in the function as parameter. if you remove it from function parameter and create it inside the function
        //then it won't works
        // Model's functionality is just like model in regular Spring
        Book book=bookService.getOne(id);
        model.addAttribute("book", book);

        return "book";
    }

    @GetMapping("/books")
    public String getBooks(Model model){

        //Model model arg just like HttpRequest/HttpResponse in MAV in regular Spring, it has to be used this way
        //in the function as parameter. if you remove it from function parameter and create it inside the function
        //then it won't works
        // Model's functionality is just like model in regular Spring
        List<Book> books=bookService.getBooks();
        model.addAttribute("books", books);

        return "books";
    }

>>>>>>> e32554508dd31d60c68467ed16108b6c6bba789f
}
