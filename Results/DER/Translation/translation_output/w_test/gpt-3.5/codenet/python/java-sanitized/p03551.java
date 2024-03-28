import java.util.Scanner;

public class p03551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int time = 1900*M + (N-M)*100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}