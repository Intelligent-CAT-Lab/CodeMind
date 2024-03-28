import java.util.Scanner;

public class p03697 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int sum = a + b;
        if (sum >= 10) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }
    }
}