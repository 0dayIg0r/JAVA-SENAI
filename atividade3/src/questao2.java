import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("DIGITE O N1");
        int n1 = read.nextInt();
        System.out.println(" DIGITE O N2");
        int n2 = read.nextInt();
        System.out.println(" DIGITE O N3");
        int n3 = read.nextInt();

     if(n1 > n2 && n1 > n3){
        System.out.println( n1 +" É O MAIOR");

     } else if ( n2 > n1 && n2 > n3){
        System.out.println( n2 +" É O MAIOR");

       
     } else {
        System.out.println( n3 +" É O MAIOR");
     }

     if(n2 > n3){
        System.out.println( n3 +" É O MENOR");
    }

    if(n1 < n2){
        System.out.println( n1 +" É O MENOR");
    }
        

    }
}