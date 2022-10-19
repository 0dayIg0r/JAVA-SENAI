import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número");

        int n1 = read.nextInt();

        int before = --n1;
        int after = before + 2 ;


        System.out.println(before +" , " +after);


        read.close();

    }
}
