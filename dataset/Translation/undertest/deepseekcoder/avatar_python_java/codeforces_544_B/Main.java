import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = 0;
        String[] arr = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < m) {
                    if (j == next) {
                        string.append(" L");
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        string.append(" S");
                    }
                } else {
                    string.append(" S");
                }
            }
            arr[i] = string.toString();
        }
        if (count < m) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String i : arr) {
                System.out.println(i);
            }
        }
    }
}