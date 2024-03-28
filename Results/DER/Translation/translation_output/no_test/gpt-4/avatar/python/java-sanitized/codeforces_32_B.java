import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
            } else {
                i += 1;
                if (i < s.length() && s.charAt(i) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
            }
            i += 1;
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}