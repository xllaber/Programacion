package EV1.Tema6Act;

import java.util.Scanner;


public class Operaciones1b {

    static int num1, num2;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame otro numero: ");
        num2 = sc.nextInt();
        System.out.println("La suma es: " + Suma());
        System.out.println("La resta es: " + Resta());
        System.out.println("La multiplicacion es: " + Mult());
        if(Div() == -0f){
            System.out.println("Error. No se puede dividir entre 0.");
        }else{
            System.out.println("La division es: " + Div());
        }
        sc.close();
    }
    static int Suma(){
        int suma = num1 + num2;
        return suma;
    }
    static int Resta(){
        int resta = num1 - num2;
        return resta;
    }
    static int Mult(){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
    static float Div(){
        float division = 0;
        if(num2 == 0){
            return -0f;  
        } else{
            division = num1 / num2;
        }
        return division;
    }
}
