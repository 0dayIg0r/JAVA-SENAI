import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("DIGITE O N1");
        int n1 = read.nextInt();
      
        if(n1 < 0){
         System.out.println(n1 + "É MENOR QUE 0");
        } else if (n1 == 0){
         System.out.println("DIGITOU O N 0");
        } else{
         System.out.println( n1 +"É MAIOR QUE 0");
        }
   
        

    }
}