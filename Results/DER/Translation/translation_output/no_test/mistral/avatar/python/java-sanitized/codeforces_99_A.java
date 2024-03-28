import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] num = input.split(" . ");
        if (Integer.parseInt(num[0][num[0].length() - 1]) == 9) {
            System.out.println("GOTO ~\u203c Vasilisa . ");
        } else {
            if (Integer.parseInt(num[1][0]) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}