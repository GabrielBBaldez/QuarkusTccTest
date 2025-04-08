package book;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "publicationYear")
    private String publicationYear;

    @Column(name = "author", length = 255)
    private String author;


    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    public Book() {
    }

    public Book(BookDTO bookDTO) {
        this.title = bookDTO.title();
        this.publicationYear = bookDTO.publicationYear();
        this.author = bookDTO.author();
        this.summary = bookDTO.summary();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
