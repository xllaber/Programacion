package EV2.Tema8Act.StaticMethods;

public class Calculator {

    private static int result;

    //Singleton object creation check
    //private Singleton instance = Singleton.getInstance();

    public static int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    public static int substract(int num1, int num2){
        result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2){
        result = num1 * num2;
        return result;
    }

    public static int divide(int num1, int num2){
        result = num1 / num2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(substract(5, 3));
        System.out.println(multiply(5, 5));
        System.out.println(divide(6, 3));
    }
}
