import java.util.Scanner;

public class p04030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder a = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'B') {
                if (a.length() != 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(currentChar);
            }
        }
        
        System.out.println(a.toString());
        scanner.close();
    }
}