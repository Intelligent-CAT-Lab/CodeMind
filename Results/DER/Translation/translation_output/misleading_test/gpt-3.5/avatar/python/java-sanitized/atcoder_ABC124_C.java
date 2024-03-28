import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2++;
                } else {
                    cnt1++;
                }
            }
        }

        System.out.println(Math.min(cnt1, cnt2));
    }
}