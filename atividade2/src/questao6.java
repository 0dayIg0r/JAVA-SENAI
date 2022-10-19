import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor da conta");

        float value = read.nextFloat();

        System.out.println("Quantas pessoas tem?");

        int howManyPersons = read.nextInt();

        float toPay = value / howManyPersons ;
      

        System.out.println("Para cada pessoa terá que pagar R$:"+ toPay);

        read.close();

    }
}
