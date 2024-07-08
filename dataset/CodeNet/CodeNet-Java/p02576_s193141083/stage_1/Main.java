import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int X = scan.nextInt();
                int T = scan.nextInt();

                if (N%X == 0) {
                	System.out.println(N/X * T);
                } else {
                	System.out.println(N/X * T + T);
                }

                scan.close();

        }
}