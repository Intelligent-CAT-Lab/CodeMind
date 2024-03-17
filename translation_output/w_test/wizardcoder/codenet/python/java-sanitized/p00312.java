import java.util.Scanner;

public class p00312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int ans = (int) Math.ceil((double) D / L);
        System.out.println(ans);
    }
}