package EV2.Tema9Act;

public class Books extends Product {
    private String autor;
    private String title;
    private float DISCOUNT = 0.8f;

    public Books(int id, float price, String autor, String title) {
        super(id, price);
        this.autor = autor;
        this.title = title;
    }

    @Override
    public String toString(){
        return "{\nTitle: " + this.title + 
                "\nAutor: " + this.autor +
                "\nPrice: " + this.getPrice() + 
                "\nID: " + this.getId() + 
                "\n}";
    }

    @Override
    public float getPrice(){
        return super.getPrice() * DISCOUNT;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
