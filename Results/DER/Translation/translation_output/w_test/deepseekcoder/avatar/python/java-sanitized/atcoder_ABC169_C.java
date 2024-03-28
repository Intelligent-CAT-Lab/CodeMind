import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String b = splitInput[1].substring(0, 1) + splitInput[1].substring(2);
        long a = Long.parseLong(splitInput[0]);
        long bLong = Long.parseLong(b);
        System.out.println((a * bLong) / 100);
    }
}