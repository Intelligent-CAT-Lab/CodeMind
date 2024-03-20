import java.util.Scanner;

public class p03505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            int count = (int) (- (K-A) / (A-B));
            System.out.println(1 - count*2);
        }
    }
}