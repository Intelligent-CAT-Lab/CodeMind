import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        b = b.substring(0, 1) + b.substring(2);
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int result = aInt * bInt / 100;
        System.out.println(result);
    }
}