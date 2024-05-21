import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int result = (h - 2) / (t - 1) + 1;
        System.out.println(result);
    }
}