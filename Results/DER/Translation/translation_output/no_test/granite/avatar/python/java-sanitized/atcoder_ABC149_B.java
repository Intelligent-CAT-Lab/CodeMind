import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] elements = number.split(" â ");
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[1]);
        int k = Integer.parseInt(elements[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = b < 0? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}