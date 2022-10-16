import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite a primeira nota");

        float note1 = read.nextFloat();

        System.out.println("Digite a segunda nota");

        float note2 = read.nextFloat();

        float result = (note1 + note2) / 2;

      
        if (result / 2 >= 7) {
            System.out.printf("Reprovado");
        } else{
            System.out.printf("Aprovado");
        }

        read.close();

    }
}
