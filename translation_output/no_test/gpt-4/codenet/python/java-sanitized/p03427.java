import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();
        
        System.out.println(Math.max((Character.getNumericValue(n.charAt(0)) - 1) + 9 * (n.length() - 1), sumOfDigits(n)));
    }
    
    private static int sumOfDigits(String str) {
        int sum = 0;
        for(char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}