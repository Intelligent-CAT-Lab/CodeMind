import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03404 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        char[][] ar = new char[100][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '#';
            }
        }
        for (int i = 50; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ar[i][j] = '.';
            }
        }
        System.out.println("100 100");
        int count = 0;
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }
        count = 0;
        for (int i = 99; i > 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }
        for (char[] row : ar) {
            System.out.println(new String(row));
        }
    }
}