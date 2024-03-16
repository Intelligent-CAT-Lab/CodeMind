import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();
        int K = 0, U = 0, P = 0, C = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'K') {
                K++;
            } else if (ch == 'U') {
                U++;
            } else if (ch == 'P') {
                P++;
            } else if (ch == 'C') {
                C++;
            }
        }
        
        int minOccurrences = Math.min(Math.min(K, U), Math.min(P, C));
        System.out.println(minOccurrences);
    }
}