import java.util.Scanner;

public class Ishu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, x = 0, y = 0, k = 0, dx, dy;
        boolean flag = true;
        String s;
        char[] ch = new char[100];
        int[][] co = new int[2][101];

        s = scan.next();
        ch = s.toCharArray();
        co[0][k] = x;
        co[1][k] = y;
        ++k;

        for (i = 0; i < s.length(); ++i) {
            switch (ch[i]) {
                case 'L':
                    --x;
                    break;
                case 'R':
                    ++x;
                    break;
                case 'U':
                    ++y;
                    break;
                case 'D':
                    --y;
                    break;
            }
            co[0][k] = x;
            co[1][k] = y;
            ++k;
        }

        for (i = 0; i < k - 3; ++i) {
            for (j = i + 3; j < k; ++j) {
                dx = co[0][i] - co[0][j];
                dy = co[1][i] - co[1][j];
                if (dx < 0)
                    dx *= (-1);
                if (dy < 0)
                    dy *= (-1);
                if ((dx <= 1 && dy == 0) || (dy <= 1 && dx == 0)) {
                    flag = false;
                    break;
                }
            }
            if (!flag)
                break;
        }

        if (flag)
            System.out.println("OK");
        else
            System.out.println("BUG");
    }
}