import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] s_frq_dict = new int[3];
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == 'a') {
                s_frq_dict[0]++;
            } else if (s == 'b') {
                s_frq_dict[1]++;
            } else if (s == 'c') {
                s_frq_dict[2]++;
            }
        }
        int max = 0;
        int min = 1000000000;
        for (int i = 0; i < 3; i++) {
            if (s_frq_dict[i] > max) {
                max = s_frq_dict[i];
            }
            if (s_frq_dict[i] < min) {
                min = s_frq_dict[i];
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}