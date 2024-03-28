import java.util.Scanner;

public class p00401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(count / 2); // Division of two integers automatically round towards zero
        scanner.close();
    }
}