import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        long a = Long.parseLong(parts[0]);
        double b = Double.parseDouble(parts[1]);
        b = b * 100;
        long result = (long) (a * b);
        System.out.println(result);
    }
}