package EV2.Tema8Act.StaticMethods;

public class Singleton {
    private static Singleton instance;
    private int count = 0;

    private Singleton(){
        //Empty
        this.count++;
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    public String checkInstance(){
        return String.format("Instancia creada. Contador: %d", this.count);
    }

    

    public static void main(String[] args) {
        Singleton check = new Singleton();
        Singleton.getInstance();
        System.out.println(check.checkInstance());
    }
}
