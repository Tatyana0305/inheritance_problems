package domain;

public class Smartphone extends Product {

    private String creator;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String creator) {
        super(id, name, price);
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
