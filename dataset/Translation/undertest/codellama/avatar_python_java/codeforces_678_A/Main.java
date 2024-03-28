import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int vamshi = Integer.parseInt(numbers[0]);
        int z = Integer.parseInt(numbers[1]);
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}