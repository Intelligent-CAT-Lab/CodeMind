import java.util.Scanner;

public class p03192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '2') {
                count++;
            }
        }
        System.out.println(count);
    }
}