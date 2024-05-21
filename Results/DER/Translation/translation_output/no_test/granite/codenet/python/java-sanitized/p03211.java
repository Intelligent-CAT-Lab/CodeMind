import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            String substring = S.substring(i, i + 3);
            int num = Integer.parseInt(substring);
            int diff = Math.abs(753 - num);
            a = Math.min(a, diff);
        }
        System.out.println(a);
    }
}