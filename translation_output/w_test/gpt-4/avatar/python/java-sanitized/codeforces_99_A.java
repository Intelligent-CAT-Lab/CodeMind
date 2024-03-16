import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\.");
        int integerPart = Integer.parseInt(num[0]);
        if (num[0].charAt(num[0].length() - 1) == '9') {
            System.out.println("GOTO ▮ Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(integerPart + 1);
            } else {
                System.out.println(integerPart);
            }
        }
        scanner.close();
    }
}