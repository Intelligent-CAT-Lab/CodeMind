
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);
        a.print();
        koch(N, a, b);
        b.print();
    }

    public static void koch(int d, Vector a, Vector b) {
        if (d == 0) {
            return;
        }
        Vector s = a.add(b.sub(a).div(3));
        Vector u = s.add((s.sub(a)).rot(60));
        Vector t = a.add(b.sub(a).mul(2).div(3));
        koch(d - 1, a, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, b);
    }
}

class Vector {
    double x;
    double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(x + " " + y);
    }

    public Vector add(Vector o) {
        return new Vector(this.x + o.x, this.y + o.y);
    }

    public Vector sub(Vector o) {
        return new Vector(this.x - o.x, this.y - o.y);
    }

    public Vector mul(double o) {
        return new Vector(this.x * o, this.y * o);
    }

    public Vector div(double o) {
        return new Vector(this.x / o, this.y / o);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}
```

## 10. 8 Queens Problem

Write a program to solve the 8 queens problem.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] dpos = new int[2 * N - 1];
        int[] dneg = new int[2 * N - 1];
        int[] ans = new int[N];
        int[] ans_x = new int[N];
        int[] ans_y = new int[N];
        int[] ans_dpos = new int[2 * N - 1];
        int[] ans_dneg = new int[2 * N - 1];
        int ans_count = 0;
        int count = 0;
        int i, j;
        for (i = 0; i < N; i++) {
            x[i] = i;
            y[i] = i;
            dpos[i] = i;
            dneg[i] = i;
        }
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (dpos[i + j] == 0 && dneg[i - j + N - 1] == 0) {
                    ans[count] = i;
                    ans_x[count] = x[i];
                    ans_y[count] = y[j];
                    ans_dpos[count] = dpos[i + j];
                    ans_dneg[count] = dneg[i - j + N - 1];
                    count++;
                }
            }
        }
        for (i = 0; i < count; i++) {
            for (j = 0; j < count; j++) {
                if (ans[i] == ans[j] || ans_x[i] == ans_x[j] || ans_y[i] == ans_y[j] || ans_dpos[i] == ans_dpos[j] || ans_dneg[i] == ans_dneg[j]) {
                    continue;
                }
                ans_count++;
            }
        }
        System.out.println(ans_count);
    }
}
```

## 11. Maze

Write a program to solve the maze problem.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int[][] maze = new int[H][W];
        int[][] ans = new int[H][W];
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int gx = sc.nextInt();
        int gy = sc.nextInt();
        int i, j;
        for (i = 0; i < H; i++) {
            for (j = 0; j < W; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < H; i++) {
            for (j = 0; j < W; j++) {
                ans[i][j] = -1;
            }
        }
        ans[sy][sx] = 0;
        dfs(maze, ans, sx, sy, gx, gy);
        System.out.println(ans[gy][gx]);
    }

    public static void dfs(int[][] maze, int[][] ans, int x, int y, int gx, int gy) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int i;
        for (i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= maze[0].length || ny < 0 || ny >= maze.length) {
                continue;
            }
            if (maze[ny][nx] == 1 || ans[ny][nx] != -1) {
                continue;
            }
            ans[ny][nx] = ans[y][x] + 1;
            dfs(maze, ans, nx, ny, gx, gy);
        }
    }
}
```

## 12. 8 Puzzle

Write a program to solve the 8 puzzle problem.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board
