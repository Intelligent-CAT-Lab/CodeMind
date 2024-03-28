import java.util.Scanner;

public class p03814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        
        int aIndex = 0;
        int zIndex = 0;
        
        // Find the index of first occurrence of 'A'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aIndex = i;
                break;
            }
        }
        
        // Find the index of last occurrence of 'Z'
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                zIndex = i;
                break;
            }
        }
        
        System.out.println(zIndex - aIndex);
        
        scanner.close();
    }
}