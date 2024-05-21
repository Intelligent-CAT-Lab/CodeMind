import java.util.*;

public class p02475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        sc.close();

        int result = round(a, b);
        System.out.println(result);
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}