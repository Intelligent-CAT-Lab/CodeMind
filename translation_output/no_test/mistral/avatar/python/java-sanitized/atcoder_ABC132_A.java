import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[4];
        for (int i = 0; i < 4; i++) {
            s[i] = scanner.nextInt();
        }
        Arrays.sort(s);
        if (s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}