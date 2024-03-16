import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        int K = countOccurrences(a, 'K');
        int U = countOccurrences(a, 'U');
        int P = countOccurrences(a, 'P');
        int C = countOccurrences(a, 'C');
        
        System.out.println(Math.min(Math.min(K, U), Math.min(P, C)));
        
        scanner.close();
    }
    
    private static int countOccurrences(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}