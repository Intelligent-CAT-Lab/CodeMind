import java.util.Scanner;

public class p00399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int g = scanner.nextInt();
        
        int sum = r + b + w + g;
        System.out.println(sum);
    }
}