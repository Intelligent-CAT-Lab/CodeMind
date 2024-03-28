import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = b < 0 ? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}