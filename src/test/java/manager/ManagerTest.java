package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.Test;
import repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Repository repository = new Repository();
    Manager manager = new Manager(repository);
    Book alpha = new Book(11, "alpha", 150, "Puskin");
    Book beta = new Book(22, "beta", 250, "Turgenev");
    Book gamma = new Book(33, "gamma", 350, "Puskin");
    Smartphone first = new Smartphone(44, "sam", 10000, "Samsung");
    Smartphone second = new Smartphone(55, "nok", 15000, "Nokia");


    @Test
    public void shouldAdd() {

        manager.add(alpha);
        manager.add(beta);
        manager.add(first);


        Product[] expected = {alpha, beta, first};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void getAll() {
        manager.getAll();
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);

        Product[]expected = {alpha, beta, gamma, first, second};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByName() {
        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);


        Product[] expected = {beta};
        Product[] actual = manager.searchBy("beta");

        assertArrayEquals(expected, actual);

    }



}