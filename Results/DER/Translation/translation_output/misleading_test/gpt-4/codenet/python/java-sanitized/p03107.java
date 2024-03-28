import java.util.Scanner;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        int N = input.length();
        
        int C0 = countOccurrences(input, '0');
        int C1 = countOccurrences(input, '1');
        
        System.out.println(2 * Math.min(C0, C1));
        
        scanner.close();
    }
    
    private static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}