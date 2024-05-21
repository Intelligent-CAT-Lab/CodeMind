import java.util.*;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int T = Integer.parseInt(input[2]);
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}