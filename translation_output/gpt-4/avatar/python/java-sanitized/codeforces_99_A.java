import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\. ");
        int lastDigitBeforePoint = Character.getNumericValue(num[0].charAt(num[0].length() - 1));

        if (lastDigitBeforePoint == 9) {
            System.out.println("GOTO ▁ Vasilisa.");
        } else {
            if (Character.getNumericValue(num[1].charAt(0)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
        
        scanner.close();
    }
}