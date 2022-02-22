package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {


    @Test
    public void shouldHaveMethodsFromSuper() {
        Smartphone smartphone = new Smartphone(44, "sm1", 10000, "nokia");
        smartphone.setPrice(20000);

        assertEquals(20000, smartphone.getPrice());

    }

    @Test
    public void getCreator() {

        Smartphone smartphone = new Smartphone(44, "sm1", 10000, "nokia");
        smartphone.getCreator();

        assertEquals("nokia", smartphone.getCreator());

    }

    @Test
    public void setCreator() {
        Smartphone smartphone = new Smartphone(44, "sm1", 10000, "nokia");
        smartphone.setCreator("nokia");

        assertEquals("nokia", smartphone.getCreator());
    }
}