import java.util.Scanner;

public class p01722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        if (n == 0) {
            result = 73;
        } else {
            result = 2 / n;
        }
        System.out.println(result);
    }
}