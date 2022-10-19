import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor do jantar");

        float value = read.nextFloat();

        float percent = (value * 10) / 100 ;
        
        float total = value + percent;

        System.out.println(value + " + 10% = R$:" + total);

        read.close();

    }
}
