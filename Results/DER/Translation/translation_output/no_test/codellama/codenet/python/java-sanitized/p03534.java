import java.util.Scanner;

public class p03534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts[c - 'a']++;
        }
        int a = counts[0];
        int b = counts[1];
        int c = counts[2];
        if (Math.abs(a - b) <= 1 && Math.abs(b - c) <= 1 && Math.abs(c - a) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}