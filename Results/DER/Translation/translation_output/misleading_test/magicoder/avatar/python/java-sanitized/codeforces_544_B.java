import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int start = 0;
        String[] arr = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = "";
            int next = start;
            for (int j = 0; j < n; j++) {
                if (count < m) {
                    if (j == next) {
                        str += " L ";
                        count++;
                        next += 2;
                        if (next >= n) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        str += " S ";
                    }
                } else {
                    str += " S ";
                }
            }
            arr[i] = str;
        }
        if (count < m) {
            System.out.println(" NO ");
        } else {
            System.out.println(" YES ");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}