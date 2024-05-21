import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] num = input.split("\\.");

        if (Integer.parseInt(num[0].substring(num[0].length() - 1)) == 9) {
            System.out.println("GOTO â Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}