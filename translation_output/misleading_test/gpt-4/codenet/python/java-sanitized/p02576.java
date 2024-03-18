import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        
        int output;
        if (N % X != 0) {
            output = (N / X) * T + T;
        } else {
            output = (N / X) * T;
        }
        
        System.out.println(output);
    }
}