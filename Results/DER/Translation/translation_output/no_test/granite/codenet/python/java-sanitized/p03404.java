import java.util.*;

public class p03404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[][] ar = new String[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = "#";
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i < 50) {
                    ar[i][j] = ".";
                }
            }
        }
        int count = 0;
        for (int i = 49; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            for (int j = 0; j < 100; j += 2) {
                ar[i][j] = ".";
                count++;
                if (count == a - 1) {
                    break;
                }
            }
        }
        count = 0;
        for (int i = 98; i >= 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            for (int j = 1; j < 100; j += 2) {
                ar[i][j] = "#";
                count++;
                if (count == b - 1) {
                    break;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}