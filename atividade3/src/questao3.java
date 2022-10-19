import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("DIGITE A IDADE");
        int age = read.nextInt();
      
        if(age >= 16){
         System.out.println(age + "PODE VOTAR");
        } else if (age < 16){
         System.out.println("NÃO PODE VOTAR");
    
        }
    }
}