package book;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {

    public List<Book> findByTitle(String title) {
        return find("title", title).list();
    }
}