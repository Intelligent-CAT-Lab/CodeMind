import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String b = input[0].substring(0, 1) + input[0].substring(2);
        long a = Long.parseLong(input[0]);
        double c = Double.parseDouble(b);
        long result = (long) (a * c / 100);
        System.out.println(result);
    }
}