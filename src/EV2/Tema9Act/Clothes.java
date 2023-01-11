package EV2.Tema9Act;

public class Clothes extends Product {
    private String type;
    private String size;
    private String color;

    public Clothes(int id, float price, String type, String size, String color) {
        super(id, price);
        this.type = type;
        this.size = size.toUpperCase();
        this.color = color;
    }

    @Override
    public String toString(){
        return "{\nType: " + this.type + 
                "\nSize: " + this.size + 
                "\nColor: " + this.color +
                "\nPrice: " + this.getPrice() + 
                "\nID: " + this.getId() + 
                "\n}";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
