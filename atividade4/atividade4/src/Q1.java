import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) throws Exception {
       Scanner read = new Scanner(System.in);

       System.out.println("Digite o número para * até 10 ");
       int n = read.nextInt();

       for(var i = 0; i <=10; i ++){
        System.out.println(n * i);
       }
    }
}
