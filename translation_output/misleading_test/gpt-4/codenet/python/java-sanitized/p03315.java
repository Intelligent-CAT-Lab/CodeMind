import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int plusCount = 0;
        int minusCount = 0;

        for (char c : input.toCharArray()) {
            if (c == '+') {
                plusCount++;
            } else if (c == '-') {
                minusCount++;
            }
        }

        int result = plusCount - minusCount;
        System.out.println(result);
        
        scanner.close();
    }
}