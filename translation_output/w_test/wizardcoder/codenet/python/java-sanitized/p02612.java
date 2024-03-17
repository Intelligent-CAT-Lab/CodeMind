import java.util.Scanner;

public class p02612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1000 - n % 1000;
        if (result == 0) {
            result = 0;
        }
        System.out.println(result);
    }
}