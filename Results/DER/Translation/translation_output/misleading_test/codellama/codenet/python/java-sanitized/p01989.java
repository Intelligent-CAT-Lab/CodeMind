import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p01989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 1; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                for (int k = j + 1; k < input.length(); k++) {
                    String A = input.substring(0, i);
                    String B = input.substring(i, j);
                    String C = input.substring(j, k);
                    String D = input.substring(k);

                    if (isValid(A) && isValid(B) && isValid(C) && isValid(D)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    private static boolean isValid(String s) {
        int value = Integer.parseInt(s);
        if (value > 255) {
            return false;
        }
        if (value == 0 && s.length() != 1) {
            return false;
        }
        if (value != 0 && s.charAt(0) == '0') {
            return false;
        }
        return true;
    }
}