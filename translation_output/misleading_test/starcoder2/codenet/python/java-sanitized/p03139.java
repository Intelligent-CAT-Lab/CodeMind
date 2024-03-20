import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
    }
}

/2019-09-16/README.md
# 2019-09-16