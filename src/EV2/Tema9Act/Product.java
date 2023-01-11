package EV2.Tema9Act;

public class Product {
    private int id;
    private float price;
    
    public Product(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "{\nID: " + this.id +
                "\nPrice: " + this.price + 
                "\n}"; 
    }
}
