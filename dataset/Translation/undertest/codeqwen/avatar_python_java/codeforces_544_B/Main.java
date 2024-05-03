import java.util.Arrays;
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);
        String[] arr = new String[n];
        int count = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < m) {
                    if (j == next) {
                        string.append(" L ");
                        count++;
                        next += 2;
                        if (next >= n) {
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
        if (count < m) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}