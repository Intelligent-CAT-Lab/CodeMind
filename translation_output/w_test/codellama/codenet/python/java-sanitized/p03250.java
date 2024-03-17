import java.util.Scanner;

public class p03250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] abc = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            abc[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(abc);
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        System.out.println(result);
    }
}