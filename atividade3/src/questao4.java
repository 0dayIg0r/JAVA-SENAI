import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("DIGITE A IDADE");
        int age = read.nextInt();
      
        if(age < 18){
         System.out.println(age + "NAO PODE DIRIGIR");
        } else if (age >= 0){
         System.out.println("PODE DIRIGIR");
    
        }
    }
}