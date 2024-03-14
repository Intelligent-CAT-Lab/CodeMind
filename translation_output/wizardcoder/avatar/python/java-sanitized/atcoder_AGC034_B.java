import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        S = S.replaceAll(" BC ", " D ");
        int A_count = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                A_count++;
            } else if (S.charAt(i) == 'D') {
                ans += A_count;
                A_count = 0;
            } else {
                A_count = 0;
            }
        }
        System.out.println(ans);
    }
}