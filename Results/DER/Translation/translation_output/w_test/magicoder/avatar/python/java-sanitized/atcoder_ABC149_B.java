import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        long a = Long.parseLong(numbers[0]);
        long b = Long.parseLong(numbers[1]);
        long k = Long.parseLong(numbers[2]);
        long res = a - k;
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