package book;

public record BookDTO(
        Long id,
        String title,
        String publicationYear,
        String author,
        String summary
) {
}

