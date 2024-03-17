import java.util.Scanner;

public class codeforces_242_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int[][] c = new int[x - a + 1][y - b + 1];
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c[i - a][j - b] = 1;
                }
            }
        }

        System.out.println(c.length);
        for (int[] row : c) {
            for (int element : row) {
                if (element == 1) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        }
    }
}