package Tema4Act;

public class FormatoString4 
{
    public static void main(String[] args) {
        final String frase = "    Hola Mundo    ";
        String resultado;

        resultado = frase.strip().toUpperCase();
        System.out.println(frase + " se convierte en: " + resultado);

    }
}
