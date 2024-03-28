import java.util.Scanner;

public class p03272 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int i = Integer.parseInt(input[1]);
        System.out.println(n + 1 - i);
    }
}