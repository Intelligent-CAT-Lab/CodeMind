import java.util.Scanner;

public class p03289 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (input.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }

        int count = 0;
        for (int i = 2; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            System.out.println("WA");
            return;
        }

        int count2 = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count2++;
            }
        }
        if (count2 != 2) {
            System.out.println("WA");
            return;
        }

        System.out.println("AC");
    }
}