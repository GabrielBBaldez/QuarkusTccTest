package Controller;

import book.Book;
import book.BookDTO;
import book.BookService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class BookController {

    @Inject
    BookService bookService;

    @POST
    public Response saveBook(BookDTO bookDTO) {
        Book book = new Book(bookDTO);
        bookService.save(book);
        return Response.ok(book).build();
    }

    @GET
    public Response getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return Response.ok(books).build();
    }

    @GET
    @Path("/{id}")
    public Response getBookById(@PathParam("id") Long id) {
        Book book = bookService.findById(id);
        return Response.ok(book).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateBook(@PathParam("id") Long id, BookDTO bookDTO) {
        Book book = new Book(bookDTO);
        book.setId(id);
        bookService.update(book);
        return Response.ok(book).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteBook(@PathParam("id") Long id) {
        bookService.deleteById(id);
        return Response.noContent().build();
    }
}