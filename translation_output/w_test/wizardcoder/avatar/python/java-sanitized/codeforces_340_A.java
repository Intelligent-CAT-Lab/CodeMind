import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int gcd = 1;
        while (y!= 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;

        int lcm = (x * y) / gcd;

        int result = b / lcm - (a - 1) / lcm;

        System.out.println(result);
    }
}