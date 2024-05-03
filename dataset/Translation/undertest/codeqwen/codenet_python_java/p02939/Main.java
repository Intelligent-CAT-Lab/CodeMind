import java.util.Scanner;

public class p02939 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int[] l = new int[S.length() + 1];
        l[1] = 1;
        if (S.charAt(0) == S.charAt(1)) {
            l[2] = 1;
        } else {
            l[2] = 2;
        }

        for (int i = 3; i < S.length() + 1; i++) {
            if (S.charAt(i - 1) != S.charAt(i - 2)) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = l[i - 3] + 2;
            }
        }

        System.out.println(l[S.length()]);
    }
}