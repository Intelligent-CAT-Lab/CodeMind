import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int plusCount = 0;
        int minusCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+') {
                plusCount++;
            } else if (input.charAt(i) == '-') {
                minusCount++;
            }
        }
        System.out.println(plusCount - minusCount);
    }
}