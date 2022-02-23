package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    public void shouldHaveMethodsFromSuper() {
        Book book = new Book(11, "alpha", 150, "Puskin");
        book.setName("delta");

        assertEquals("delta", book.getName());

    }

}