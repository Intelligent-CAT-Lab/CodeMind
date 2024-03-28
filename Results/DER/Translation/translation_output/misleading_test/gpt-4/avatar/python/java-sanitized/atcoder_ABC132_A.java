import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        Arrays.sort(s);
        
        if(s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}

// Test input: STOP
// Expected output: No