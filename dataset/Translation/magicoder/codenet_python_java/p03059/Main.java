import java.util.Scanner;

public class p03059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int t = Integer.parseInt(input[2]);
        System.out.println((t / a) * b);
    }
}