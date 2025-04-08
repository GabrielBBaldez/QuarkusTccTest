package book;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BookService {

    @Inject
    BookRepository bookRepository;

    @Transactional
    public Book save(Book book) {
        bookRepository.persist(book);
        return book;
    }

    public Book findById(Long id) {
        return bookRepository.findByIdOptional(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @Transactional
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Transactional
    public Book update(Book book) {
        return bookRepository.getEntityManager().merge(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.listAll();
    }
}
