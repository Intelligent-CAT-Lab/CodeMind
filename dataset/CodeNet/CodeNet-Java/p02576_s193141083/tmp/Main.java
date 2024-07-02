import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
System.out.println("[INST]6;N;scan.nextInt();"+N);
                int X = scan.nextInt();
System.out.println("[INST]7;X;scan.nextInt();"+X);
                int T = scan.nextInt();
System.out.println("[INST]8;T;scan.nextInt();"+T);

                if (N%X == 0) {
                	System.out.println(N/X * T);
                } else {
                	System.out.println(N/X * T + T);
                }

                scan.close();

        }
}