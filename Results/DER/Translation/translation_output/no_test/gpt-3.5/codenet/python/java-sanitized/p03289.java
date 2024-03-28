import java.util.Scanner;

public class p03289 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int flag = 0;

        if (S.charAt(0) != 'A') {
            flag = 1;
        }

        int count = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            flag = 1;
        }

        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                count2++;
            }
        }
        if (count2 != 2) {
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}