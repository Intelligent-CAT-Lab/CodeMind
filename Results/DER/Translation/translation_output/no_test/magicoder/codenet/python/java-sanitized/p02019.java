import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);
        System.out.println(n - (c + a - c + b - c));
    }
}