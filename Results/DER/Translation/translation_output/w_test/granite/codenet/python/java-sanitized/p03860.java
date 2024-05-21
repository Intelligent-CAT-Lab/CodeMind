import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String firstLetter = parts[0].substring(0, 1);
        String lastLetter = parts[2].substring(parts[2].length() - 1);
        String result = firstLetter + parts[1].substring(0, 1) + lastLetter;
        System.out.println(result);
    }
}