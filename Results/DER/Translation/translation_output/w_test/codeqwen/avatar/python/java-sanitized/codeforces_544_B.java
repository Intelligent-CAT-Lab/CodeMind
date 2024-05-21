import java.util.Arrays;
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = 0;
        String[] arr = new String[numbers[0]];
        int count = 0;
        for (int i = 0; i < numbers[0]; i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string.append(" L ");
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = 1 - start;
                        }
                    } else {
                        string.append(" S ");
                    }
                } else {
                    string.append(" S ");
                }
            }
            arr[i] = string.toString();
        }
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}