import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] parts = num.split("\\.");
        if (Integer.parseInt(parts[0].substring(parts[0].length() - 1)) == 9) {
            System.out.println("GOTO â Vasilisa");
        } else {
            if (Integer.parseInt(parts[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(parts[0]) + 1);
            } else {
                System.out.println(parts[0]);
            }
        }
    }
}