import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h1, m1, h2, m2, k;
        
        h1 = scanner.nextInt();
        m1 = scanner.nextInt();
        h2 = scanner.nextInt();
        m2 = scanner.nextInt();
        k = scanner.nextInt();
        
        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;
        
        System.out.println(t2-t1-k);
        
        scanner.close();
    }
}