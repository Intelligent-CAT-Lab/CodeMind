import java.util.Scanner;

public class p03986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        int ans = 0;
        int memo = 0;

        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    // pass is not needed in Java, because Java does nothing if there is an empty block of code.
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }
        
        System.out.println(memo * 2);
        scanner.close();
    }
}