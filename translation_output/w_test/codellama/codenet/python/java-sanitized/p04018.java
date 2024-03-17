import java.util.Scanner;

public class p04018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length();
        int t = -1;
        int[] zl = new int[n];
        int[] zr = new int[n];
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (i + zl[i - 1] < zl[i - 1] + zr[i - 1]) {
                zl[i] = zl[i - 1];
            } else {
                int j = Math.max(0, zl[i - 1] + zr[i - 1] - i);
                while (i + j < n && input.charAt(j) == input.charAt(i + j)) {
                    j++;
                }
                zl[i] = j;
            }
        }

        for (int i = 1; i < n; i++) {
            if (zl[i] && zr[n - 2 - i]) {
                cnt++;
            }
        }

        if (t == -1) {
            System.out.println("1");
            System.out.println("1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            System.out.println(2);
            System.out.println(cnt);
        }
    }
}