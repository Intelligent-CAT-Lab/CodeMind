import java.util.Scanner;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        char[] s2 = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            s2[i] = s[i];
        }
        char[] s3 = new char[s2.length];
        for (int i = 0; i < s2.length; i++) {
            s3[i] = s2[i];
        }
        char[] s4 = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (s3.length == s4.length) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.length; i++) {
                if (s3[i] != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3.length - 1) {
                    System.out.println(s4[i + 1]);
                }
            }
        }
    }
}