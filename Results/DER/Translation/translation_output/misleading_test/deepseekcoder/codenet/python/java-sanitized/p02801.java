import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char[] al = new char[26];
        for (int i = 0; i < 26; i++) {
            al[i] = (char) ('a' + i);
        }
        int idx = c - 'a';
        System.out.println((char) (al[idx + 1]));
    }
}