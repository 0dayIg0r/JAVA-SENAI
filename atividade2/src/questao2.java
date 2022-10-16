import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número");

        int n1 = read.nextInt();

        if(n1 > 0){
            System.out.print(++n1 + ++n1);
            System.out.print(--n1);
        } else if(n1 <= 0){
            System.out.print(--n1 - ++n1);
            System.out.print(++n1);
        }

        read.close();

    }
}
