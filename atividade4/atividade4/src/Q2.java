import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
 

        System.out.println("Digite a palavra? ");
        String s = read.nextLine();
        System.out.println("Repetir quantas vezes? ");
        int n = read.nextInt();

        
 
 
        for(var i = 0; i < n; i ++){
         System.out.println(s);
        }
     }
}
