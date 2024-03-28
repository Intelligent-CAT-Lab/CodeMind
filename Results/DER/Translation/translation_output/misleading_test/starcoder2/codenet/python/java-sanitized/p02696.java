import java.util.Scanner;

public class p02696 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println((int)Math.floor(A*Math.min(B-1, N)/B));
    }
}




/README.md
# 100-days-of-code