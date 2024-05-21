import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Block {
    boolean[][] c;
    int w;
    int h;
    int dx;
    int dy;
    int offx;
    int offy;

    Block(int d) {
        if (d % 2 == 0) {
            w = d;
            h = d - 1;
            c = new boolean[h][w];
            int cy = d / 2 - 1;
            int cx1 = d / 2 - 1;
            int cx2 = d / 2;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (Math.abs(cx1 - j) + Math.abs(cy - i) < d / 2)
                        c[i][j] = true;
                    if (Math.abs(cx2 - j) + Math.abs(cy - i) < d / 2)
                        c[i][j] = true;
                }
            }

            dx = w;
            dy = 0;

            offx = d / 2;
            offy = d / 2;
        } else {
            w = d;
            h = d;
            c = new boolean[h][w];
            int c = d - 1 >> 1;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (Math.abs(c - j) + Math.abs(c - i) < (d + 1) / 2)
                        c[i][j] = true;
                }
            }

            dx = d + 1 >> 1;
            dy = d - 1 >> 1;

            offx = dy;
            offy = dx;
        }
    }

    void dump() {
        for (int i = 0; i < h; i++) {
            String s = "";
            for (int j = 0; j < w; j++) {
                s += "RGBY".charAt(c[i][j] - 1);
            }
            System.out.println(s);
        }
    }
}

class Field {
    int[][] c;
    int w, h;

    Field(int w, int h) {
        c = new int[h][w];
        this.w = w;
        this.h = h;
    }

    void put(Block b, int x, int y, int color) {
        for (int i = 0; i < b.h; i++) {
            for (int j = 0; j < b.w; j++) {
                int px = j + x;
                int py = i + y;
                if (px < 0 || py < 0 || px >= w || py >= h)
                    continue;
                if (!b.c[i][j])
                    continue;
                if (c[py][px]!= 0)
                    throw new Error("ã¯ï¼");
                c[py][px] = color;
            }
        }

    void dump() {
        boolean ng = false;
        for (int i = 0; i < h; i++) {
            String s = "";
            for (int j = 0; j < w; j++) {
                s += "RGBY".charAt(c[i][j] - 1);
                if (c[i][j] == 0)
                    ng = true;
                }
            }
            if (ng)
                throw new Error("ã¯ï¼");
            }
        }
    }
}

public class Main {
    private static void solve() {
        int h = ni();
        int w = ni();
        int d = ni();

        Block b = new Block(d);
        Field f = new Field(w, h);

        int sy = 0;
        int sx = 0;
        int line = 0;

        while (sy < h) {
            int cnt = 0;
            int x = sx;
            int y = sy;
            while (x <= w) {
                int dx = 1;
                int dy = 0;
                cnt++;
                x -= b.offx;
                y += b.offy;
                line++;
            }
            if (cnt > 0)
                throw new Error("ã¯ï¼");
            }
        }
    }

    static int[] lis(int[] s) {
        int n = s.length;
        int[] ids = new int[n];
        int[] pids = new int[n];
        ids[0] = 0;
        ids[n - 1] = 0;
        for (int i = n - 1; i++) {
            ids[i] = i;
        }
        int[] lis = new int[n];
        lis[n - 1] = 0;
        for (int i = n - 1; i++) {
            lis[i] = i;
        }
        int[] lis = new int[n];
        lis[n - 1] = 0;
        for (int i = n - 1; i++) {
            lis[i] = i;
        }
        int[] ids = new int[n];
        ids[0] = 0;
        ids[n - 1] = 0;
        for (int i = n - 1; i++) {
            ids[i] = i;
        }
        int[] lis = new int[n];
        lis[0] = 0;
        lis[n - 1] = 0;
        for (int i = n - 1; i++) {
            lis[i] = i;
        }
        int[] ids = new int[n];
        ids[0] = 0;
        ids[n - 1] = 0;
        for (int i = n - 1; i++) {
            ids[i] = i;
        }
        int[] lis = new int[n];
        lis[0] = 0;
        lis[n - 1] = 0;
        for (int i = n - 1; i++) {
            lis[i] = i;
        }
        int[] dx = new int[n];
        dx[0] = 0;
        dx[n - 1] = 0;
        for (int i = n - 1; i++) {
            dx[i] = i;
        }
        int[] dy = new int[n];
        dy[0] = 0;
        dy[n - 1] = 0;
        for (int i = n - 1; i++) {
            dy[i] = i;
        }
        int[] dx = new int[n];
        dx[0] = 0;
        dx[n - 1] = 0;
        for (int i = n - 1; i++) {
            dx[i] = i;
        }
        int[] dy = new int[n];
        dy[0] = 0;
        dy[n - 1] = 0;
        for (int i = n - 1; i++) {
            dy[i] = i;
        }
        int[] ids = new int[n];
        ids[0] = 0;
        ids[n - 1] = 0;
        for (int i = n - 1; i++) {
            ids[i] = i;
        }
        int[] lis = new int[n];
        lis[0] = 0;
        lis[n - 1] = 0;
        for (int i = n - 1; i++) {
            lis[i] = i;
        }
        int[] dx = new int[n];
        dx[0] = 0;
        dx[n - 1] = 0;
        for (int i = n - 1; i++) {
            dx[i] = i;
        }
        int[] ids = new int[n];
        ids[0] = 0;
        ids[n - 1] = 0;
        for (int i = n - 1; i++) {
            ids[i] = i;
        }
        int[] lis = new int[n];
        lis[0] = 0;
        lis[n - 1] = 0;
        for (int i = n - 1; i++) {
            lis[i] = i;
        }
        int[] dx = new int[n];
        dx[0] = 0;
        dx[n - 1] = 0;
        for (int i = n - 1; i++) {
            dx[i] = i;
        }
        int[] ids = new int[n];
        ids[0] = 0;
        ids[n - 1] = 0;
        for (int i = n - 1; i++) {
            ids[i] = i;
        }
        int[] lis = new int[n];