import java.util.Arrays;
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int start = 0;
        String[] arr = new String[numbers.length];
        int count = 0;
        for (int i = 0; i < Integer.parseInt(numbers[0]); i++) {
            String string = " ";
            int next = start;
            for (int j = 0; j < Integer.parseInt(numbers[0]); j++) {
                if (count < Integer.parseInt(numbers[1])) {
                    if (j == next) {
                        string += " L ";
                        count++;
                        next++;
                        if (next >= Integer.parseInt(numbers[0])) {
                            start = 1 == start ? 0 : 1;
                        }
                    } else {
                        string += " S ";
                    }
                } else {
                    string += " S ";
                }
            }
            arr[i] = string;
        }
        if (count < Integer.parseInt(numbers[1])) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}