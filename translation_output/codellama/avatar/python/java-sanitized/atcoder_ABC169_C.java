import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        b = b / 100;
        System.out.println(a * b);
    }
}