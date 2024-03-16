📝 Solution


import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numArr = num.split("\\.");
        if (Integer.parseInt(numArr[0].substring(numArr[0].length() - 1)) == 9) {
            System.out.println("GOTO ▷ Vasilisa");
        } else {
            if (Integer.parseInt(numArr[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(numArr[0]) + 1);
            } else {
                System.out.println(numArr[0]);
            }
        }
    }
}