package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    public int id;
    public String name;
    public int price;

    @Test
    public void getId() {
        Product product = new Product(55, "sam", 15000);
        product.getId();

        assertEquals(55, product.getId());
    }

    @Test
    public void setId() {
        Product product = new Product(22, "beta", 250);
        product.setId(88);

        assertEquals(88, product.getId());
    }

    @Test
    public void getName() {
        Product product = new Product(55, "sam", 15000);
        product.getName();

        assertEquals("sam", product.getName());
    }

    @Test
    public void setName() {
        Product product = new Product(22, "beta", 250);
        product.setName("delta");

        assertEquals("delta", product.getName());
    }

    @Test
    public void getPrice() {
        Product product = new Product(55, "sam", 15000);
        product.getPrice();

        assertEquals(15000, product.getPrice());
    }

    @Test
    public void setPrice() {
        Product product = new Product(22, "beta", 250);
        product.setPrice(880);

        assertEquals(880, product.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}