import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        int result = (int) Math.ceil((double) h / a);
        System.out.println(result);
    }
}