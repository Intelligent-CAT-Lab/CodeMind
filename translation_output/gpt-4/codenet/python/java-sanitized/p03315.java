import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        int e = countOccurrences(a, '+');
        int f = countOccurrences(a, '-');
        
        System.out.println(e - f);
    }
    
    private static int countOccurrences(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}