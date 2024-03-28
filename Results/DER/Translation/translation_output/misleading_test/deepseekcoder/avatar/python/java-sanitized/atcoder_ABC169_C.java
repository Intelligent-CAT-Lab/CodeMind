import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String b = splitInput[1].charAt(0) + splitInput[1].substring(2);
        int a = Integer.parseInt(splitInput[0]);
        int result = (a * Integer.parseInt(b)) / 100;
        System.out.println(result);
    }
}