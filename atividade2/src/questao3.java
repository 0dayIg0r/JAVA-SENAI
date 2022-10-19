import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String name = read.nextLine();

        System.out.print("Olá " + name );


        read.close();

    }
}
