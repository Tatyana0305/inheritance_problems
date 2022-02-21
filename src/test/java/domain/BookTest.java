package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void shouldHaveMethodsFromSuper() {
        Book book = new Book();

    }

    @Test
    void getAuthor() {
        Book book = new Book(11, "alpha", 150, "Puskin");
        book.getAuthor();

        assertEquals("Puskin", book.getAuthor());

    }

    @Test
    void setAuthor() {
        Book book = new Book(11, "alpha", 150, "Puskin");
        book.setAuthor("Lermontov");

        assertEquals("Lermontov", book.getAuthor());
    }
}