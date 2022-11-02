import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);;

        String word = "Java-2022";
        int chances = 5;
        int error = chances - 1;

      do {
        
        System.out.println("Adivinhe a palavra");
        String s = read.nextLine();

        if(s.equals(word)){
            System.out.println("Acertou");
        } else{
            System.out.println("Errou, chances " + error--);
        
        }

      } while(error > 0);
    }

}
