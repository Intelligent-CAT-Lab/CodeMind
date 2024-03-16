import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int K = 0, U = 0, P = 0, C = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'K') {
                K++;
            } else if (ch == 'U') {
                U++;
            } else if (ch == 'P') {
                P++;
            } else if (ch == 'C') {
                C++;
            }
        }
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
    }
}