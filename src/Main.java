import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("guandar datos en arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "digite un numero");
            numeros[i] = entrada.nextFloat();

        }
        System.out.println("\nImprimir los elentos del arreglo  ");
        for(float i:numeros){
            System.out.println("i");
        }
    }
}