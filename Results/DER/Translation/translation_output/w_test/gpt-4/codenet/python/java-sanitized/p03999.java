import java.util.Scanner;

public class p03999 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        long ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            StringBuilder expression = new StringBuilder(s.substring(0, 1));
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i & (1 << j)) > 0) {
                    expression.append("+");
                }
                expression.append(s.charAt(j + 1));
            }
            ans += eval(expression.toString());
        }

        System.out.println(ans);
    }
    
    private static long eval(String expression) {
        String[] numbers = expression.split("\\+");
        long result = 0;
        
        for (String number : numbers) {
            result += Long.parseLong(number);
        }
        
        return result;
    }
}