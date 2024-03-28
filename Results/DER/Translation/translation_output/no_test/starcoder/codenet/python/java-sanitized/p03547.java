import java.util.*;
public class p03547 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        String[] NM = sc.nextLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        if (N > M) {
            System.out.println(">");
        } else if (N == M) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}