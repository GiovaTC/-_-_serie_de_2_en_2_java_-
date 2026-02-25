import java.util.Scanner;

public class SerieDeDosEnDos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el numero limite: ");
        int limite = scanner.nextInt();

        System.out.println("serie de numeros de 2 en 2: ");

        for (int i = 0; i <= limite; i+= 2) {
            System.out.println(i + " ");
        }

        scanner.close();
    }
}