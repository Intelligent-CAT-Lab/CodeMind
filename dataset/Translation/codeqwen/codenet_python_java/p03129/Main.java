import java.util.Scanner;

public class p03129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // å¥å
        //int A, B, C, D;
        //A = scanner.nextInt();
        //B = scanner.nextInt();
        //C = scanner.nextInt();
        //D = scanner.nextInt();
        //int[] L = new int[scanner.nextInt()];
        //for (int i = 0; i < L.length; i++) {
        //    L[i] = scanner.nextInt();
        //}
        //String S = scanner.next();
        //int N = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N % 2 == 0) {
            if (N / 2 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if ((N / 2) + 1 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}