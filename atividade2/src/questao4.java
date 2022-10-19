import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String name = read.nextLine();

        System.out.println("Digite quantas horas trabalhadas?");

        int hour = read.nextInt();

        System.out.println("Valor da hora");
        
        int valueHour = read.nextInt();
        

        int result = hour * valueHour;

        System.out.println( name +" vai receber " + "R$:" +result);

    


        read.close();

    }
}
