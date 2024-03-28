import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        int result = (s.length() / 2) - countOccurrences(s, 'p');
        System.out.println(result);
        
        scanner.close();
    }
    
    private static int countOccurrences(String str, char toCount) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toCount) {
                count++;
            }
        }
        return count;
    }
}