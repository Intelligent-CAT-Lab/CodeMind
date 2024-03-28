import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] s_frq_dict = new int[26];
        for (char s : S.toCharArray()) {
            s_frq_dict[s - 'a']++;
        }
        int max = 0, min = 0;
        for (int i : s_frq_dict) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}