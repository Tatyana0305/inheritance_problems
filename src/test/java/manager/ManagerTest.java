package manager;

import domain.Book;
import domain.NotFoundEx;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Repository repository = new Repository();
    Manager manager = new Manager(repository);
    Book alpha = new Book(11, "alpha", 150, "Puskin");
    Book alpha2 = new Book(66, "alpha2", 150, "Puskin");
    Book alpha3 = new Book(77, "alpha3", 150, "Puskin");
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
    public void shouldRemoveById() throws NotFoundEx {

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
    public void shouldRemoveByIdNotFound() {

        repository.save(alpha);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);

        Assertions.assertThrows(NotFoundEx.class, () -> repository.removeById(66));

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

    @Test
    public void searchByNameIfMultipleValues() {
        repository.save(alpha);
        repository.save(alpha2);
        repository.save(alpha3);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);


        Product[] expected = {alpha, alpha2, alpha3};
        Product[] actual = manager.searchBy("alp");

        assertArrayEquals(expected, actual);

    }

    @Test
    public void searchByNameIfNotFindValues() {
        repository.save(alpha);
        repository.save(alpha2);
        repository.save(alpha3);
        repository.save(beta);
        repository.save(gamma);
        repository.save(first);
        repository.save(second);


        Product[] expected = {};
        Product[] actual = manager.searchBy("delta");

        assertArrayEquals(expected, actual);

    }


}