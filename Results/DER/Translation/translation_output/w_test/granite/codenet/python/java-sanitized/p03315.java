import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countPlus = 0;
        int countMinus = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+') {
                countPlus++;
            } else if (input.charAt(i) == '-') {
                countMinus++;
            }
        }

        System.out.println(countPlus - countMinus);
    }
}