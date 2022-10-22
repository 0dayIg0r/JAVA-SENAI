import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("DIGITE N1 ");
        int n1 = read.nextInt();

        System.out.println("DIGITE O N2 ");
        int n2 = read.nextInt();

        if (n1 < n2) {
            for (int i = (n1 + 1); i < n2; i++) {
                System.out.println("OS NÚMEROS ENTRE ELES SÃO " + i);
            }
        } else {
            for (int i = (n2 + 1); i <= (n1 + 1); i++) {
                System.out.println("OS NÚMEROS ENTRE ELES SÃO " + i);
            }
        }
    }

}
