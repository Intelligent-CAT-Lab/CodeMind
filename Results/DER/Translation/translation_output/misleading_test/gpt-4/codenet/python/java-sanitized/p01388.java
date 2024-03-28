import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        int K = 0, U = 0, P = 0, C = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            switch (ch) {
                case 'K':
                    K++;
                    break;
                case 'U':
                    U++;
                    break;
                case 'P':
                    P++;
                    break;
                case 'C':
                    C++;
                    break;
            }
        }
        
        int minCount = Math.min(Math.min(Math.min(K, U), P), C);
        System.out.println(minCount);
        
        sc.close();
    }
}