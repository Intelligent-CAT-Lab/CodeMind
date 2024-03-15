import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        String[] split = number.split("  ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = 0 if (b < 0) else b;
        } else {
            a = res;
        }
        System.out.println(a, b);
    }
}