import java.util.Scanner;

public class p01852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.println((int)(Math.log(n) / Math.log(2)) + 1);
    }
}