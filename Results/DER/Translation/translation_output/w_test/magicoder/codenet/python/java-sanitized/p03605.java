import java.util.Scanner;

public class p03605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);

        if (numberString.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}