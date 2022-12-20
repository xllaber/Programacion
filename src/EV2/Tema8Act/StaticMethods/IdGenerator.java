package EV2.Tema8Act.StaticMethods;

import java.util.UUID;

public class IdGenerator {
    private static IdGenerator instance;
    private UUID id;
    
    private IdGenerator(){
        //Empty
        this.id = UUID.randomUUID();
    }

    public static IdGenerator getInstance(){
        IdGenerator.instance = (instance != null) ? IdGenerator.instance : new IdGenerator();
        return IdGenerator.instance;
    }

    public UUID getId(){
        this.id = UUID.randomUUID();
        return this.id;
    }

    public static void main(String[] args) {
        IdGenerator id1 = IdGenerator.getInstance();
        IdGenerator id2 = IdGenerator.getInstance();
        IdGenerator id3 = IdGenerator.getInstance();
        System.out.println("Id 1: " + id1.getId());
        System.out.println("Id 2: " + id2.getId());
        System.out.println("Id 3: " + id3.getId());
    }
}
