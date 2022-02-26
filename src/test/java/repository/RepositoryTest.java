package repository;

import domain.Book;
import domain.NotFoundEx;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    private Repository repository = new Repository();
    private Book alpha = new Book(11, "Queen of Spades", 150, "Pushkin");
    private Book beta = new Book(22, "Shot", 250, "Pushkin");
    private Book gamma = new Book(33, "Dubrovsky", 350, "Pushkin");
    private Smartphone first = new Smartphone(44, "nok1", 10000, "nokia");
    private Smartphone second = new Smartphone(55, "sam1", 15000, "samsung");

    @Test
    public void shouldSaveAllItem() {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);


        Product[] expected = new Product[]{alpha, beta, gamma, first, second};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSaveOneItem() {
        repository.save(alpha);

        Product[] expected = new Product[]{alpha};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAll() {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);


        Product[] expected = new Product[]{alpha, beta, gamma, first, second};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findById() {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);

        repository.findById(22);


        Product expected = beta;
        Product actual = repository.findById(22);

        assertEquals(expected, actual);
    }

    @Test
    public void findByIdIfNotFind() {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);

        repository.findById(77);


        Product expected = null;
        Product actual = repository.findById(77);

        assertEquals(expected, actual);
    }

    @Test
    public void removeById() throws NotFoundEx {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);

        repository.removeById(11);


        Product[] expected = {beta, gamma, first, second};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void removeByIdIfNotFound() {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);

        Assertions.assertThrows(NotFoundEx.class, () -> repository.removeById(66));

    }


}