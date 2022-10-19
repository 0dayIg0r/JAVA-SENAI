import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("DIGITE A IDADE");
        int age = read.nextInt();
      
        if(age < 18 && age < 16){
         System.out.println(age + "NAO PODE DIRIGIR E NEM VOTAR");
        } else if (age >= 18 && age >=16){
         System.out.println("PODE DIRIGIR E VOTAR");
    
        } 
    }
}