import java.util.Scanner;

public class p03551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        int time = 1900*M + (N-M)*100;
        System.out.println(time * Math.pow(2, M));
    }
}