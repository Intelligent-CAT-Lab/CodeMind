import java.util.Scanner;

public class p03698 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == c) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}