import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
var newVariable_0 = scanner.nextLong();        Long N = newVariable_0 + 1;
        scanner.close();

        // 桁数
        String s = String.valueOf(N);
        int length = s.length();
var newVariable_1 = s.substring(0, 1);        int c = Integer.parseInt(newVariable_1);
        int max = (c - 1) + 9 * (length - 1);

        System.out.println(max);
    }
}