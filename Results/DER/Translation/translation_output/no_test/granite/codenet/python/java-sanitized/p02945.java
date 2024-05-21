import java.util.Scanner;

public class p02945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int max = Math.max(Math.max(a - b, a + b), a * b);
        System.out.println(max);
    }
}