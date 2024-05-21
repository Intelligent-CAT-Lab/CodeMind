import java.util.Scanner;

public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int result = (a + b) % 24;
        System.out.println(result);
    }
}