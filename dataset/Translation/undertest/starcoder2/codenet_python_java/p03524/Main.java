import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] frq = new int[3];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'a') {
                frq[0]++;
            } else if (c == 'b') {
                frq[1]++;
            } else if (c == 'c') {
                frq[2]++;
            }
        }
        int max = frq[0];
        int min = frq[0];
        for (int i = 1; i < 3; i++) {
            if (frq[i] > max) {
                max = frq[i];
            }
            if (frq[i] < min) {
                min = frq[i];
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}