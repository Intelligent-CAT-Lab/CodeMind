import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String firstNumber = input[0];
        String secondNumber = input[1];
        secondNumber = secondNumber.substring(0, 1) + secondNumber.substring(2);
        int firstInt = Integer.parseInt(firstNumber);
        int secondInt = Integer.parseInt(secondNumber);
        int result = (firstInt * secondInt) / 100;
        System.out.println(result);
    }
}