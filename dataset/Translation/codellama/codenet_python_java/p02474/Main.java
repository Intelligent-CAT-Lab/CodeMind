import java.util.Scanner;

public class p02474 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        System.out.println(result);
    }
}