package manager;

import org.junit.jupiter.api.Test;
import repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void shouldAdd() {
        Manager alpha = new Manager(11, "alpha", 150, "Puskin");
        Manager beta = new Manager(22, "beta", 150, "Puskin");
        Manager gamma = new Manager(33, "gamma", 150, "Puskin");
        Manager first = new Manager(44, "sam", 150, "Puskin");
        Manager second = new Manager(55, "alpha", 150, "Puskin");

        Repository repo = new Repository();
        //  repo.save(alpha);
        // repo.save(beta);
        //repo.save(gamma);
        //repo.save(first);
        //repo.save(second);


        //assertArrayEquals();


    }

    @Test
    void getAll() {
    }

    @Test
    void searchBy() {
    }

    @Test
    void matches() {
    }
}