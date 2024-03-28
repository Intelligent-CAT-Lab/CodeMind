import java.util.Scanner;

public class codeforces_544_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int start = 0;
        int count = 0;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String string = "";
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        string += " L ";
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = 1 - start;
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
        if (count < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}