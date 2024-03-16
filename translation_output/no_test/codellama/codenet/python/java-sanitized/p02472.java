import java.util.Scanner;

public class p02472 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        System.out.println(A + B);
    }
}