import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int[] s_frq_array = new int[3];
        s_frq_array[0] = 0;
        s_frq_array[1] = 0;
        s_frq_array[2] = 0;

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == 'a') {
                s_frq_array[0]++;
            } else if (s == 'b') {
                s_frq_array[1]++;
            } else if (s == 'c') {
                s_frq_array[2]++;
            }
        }

        int maxFrq = Math.max(Math.max(s_frq_array[0], s_frq_array[1]), s_frq_array[2]);
        int minFrq = Math.min(Math.min(s_frq_array[0], s_frq_array[1]), s_frq_array[2]);

        if (maxFrq - minFrq <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}