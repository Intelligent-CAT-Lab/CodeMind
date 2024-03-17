import java.util.*;
public class atcoder_ABC125_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}