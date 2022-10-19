import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu peso");
        double kg = read.nextDouble();
        System.out.println("Digite sua altura");
        double width = read.nextDouble();
        double imc = kg / (width * 2);
        System.out.println(imc);


        if (imc >= 18.5) {
            System.out.println("Sua Classificação é de Magreza");
        } else if (imc <= 18.5 && imc >= 24.9) ;{
            System.out.println("Sua Classificação Está Dentro do Normal");
        } if (imc <= 25.0 && imc >= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc <= 30.0 && imc >= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else if (imc >= 40.0 ) {
            System.out.println("Sua Classificação é Obesidade Grave III");
        }
    }
}