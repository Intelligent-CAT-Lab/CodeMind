import java.util.Scanner;

public class p02473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] numbers = s.split(" ");
        int result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        System.out.println(result);
    }
}