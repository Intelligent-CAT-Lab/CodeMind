import java.util.Scanner;

public class p02903 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println("0".repeat(a) + "1".repeat(w - a));
            } else {
                System.out.println("1".repeat(a) + "0".repeat(w - a));
            }
        }
        
        sc.close();
    }
    
}