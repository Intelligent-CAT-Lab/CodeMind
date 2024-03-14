import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String b = splitInput[0].charAt(0) + splitInput[1];
        int a = Integer.parseInt(splitInput[0]);
        int c = Integer.parseInt(b);
        System.out.println(a * c / 100);
    }
}