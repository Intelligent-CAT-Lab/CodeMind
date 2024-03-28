import java.util.Scanner;

public class p03029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        
        int result = (3*a + p) / 2;
        System.out.println(result);
        
        scanner.close();
    }
}