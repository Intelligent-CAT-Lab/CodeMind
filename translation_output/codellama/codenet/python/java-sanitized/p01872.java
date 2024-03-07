import java.util.Scanner;

public class p01872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("");
        int[] scores = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            scores[i] = Integer.parseInt(numbers[i]) * (i + 1);
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int last = 11 - sum % 11;
        if (last == Integer.parseInt(numbers[0])) {
            System.out.println("MULTIPLE");
        } else {
            System.out.println(last);
        }
    }
}