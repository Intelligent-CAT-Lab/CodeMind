import java.util.Scanner;

public class p02825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 2) {
            System.out.println(-1);
            System.exit(0);
        }

        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            System.exit(0);
        }

        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            System.exit(0);
        }

        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.exit(0);
        }

        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = '.';
            }
        }

        if (n % 2 != 0) {
            char[] row1 = {'a', 'a', 'b', 'b', 'c'};
            char[] row2 = {'h', 'i', '.', '.', 'c'};
            char[] row3 = {'h', 'i', '.', '.', 'd'};
            char[] row4 = {'g', '.', 'j', 'j', 'd'};
            char[] row5 = {'g', 'f', 'f', 'e', 'e'};

            int index = 0;
            for (int j = n - 5; j < n; j++) {
                a[n - 5][j] = row1[index];
                a[n - 4][j] = row2[index];
                a[n - 3][j] = row3[index];
                a[n - 2][j] = row4[index];
                a[n - 1][j] = row5[index];
                index++;
            }

            n -= 5;
        }

        for (int i = 0; i < n; i += 2) {
            a[i][i] = 'a';
            a[i][i + 1] = 'a';
            a[i + 1][i] = 'b';
            a[i + 1][i + 1] = 'b';
        }

        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2][i] = 'c';
                a[n - i - 2][i + 1] = 'd';
                a[n - i - 1][i] = 'c';
                a[n - i - 1][i + 1] = 'd';
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i][i + 2] = 'c';
                a[i][i + 3] = 'd';
                a[i + 1][i + 2] = 'c';
                a[i + 1][i + 3] = 'd';
            }
            a[n - 2][0] = 'c';
            a[n - 2][1] = 'd';
            a[n - 1][0] = 'c';
            a[n - 1][1] = 'd';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}