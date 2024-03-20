import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int inf = 1000000000;
    static int mod = 1000000007;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[] dx8 = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy8 = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dx4 = {1, 0, -1, 0};
    static int[] dy4 = {0, 1, 0, -1};

    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Pair2 {
        int x, y, z;
        Pair2(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Pair3 {
        int x, y, z, w;
        Pair3(int x, int y, int z, int w) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
    }

    static class Pair4 {
        int x, y, z, w, v;
        Pair4(int x, int y, int z, int w, int v) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
        }
    }

    static class Pair5 {
        int x, y, z, w, v, u;
        Pair5(int x, int y, int z, int w, int v, int u) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
            this.u = u;
        }
    }

    static class Pair6 {
        int x, y, z, w, v, u, p;
        Pair6(int x, int y, int z, int w, int v, int u, int p) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
            this.u = u;
            this.p = p;
        }
    }

    static class Pair7 {
        int x, y, z, w, v, u, p, q;
        Pair7(int x, int y, int z, int w, int v, int u, int p, int q) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
            this.u = u;
            this.p = p;
            this.q = q;
        }
    }

    static class Pair8 {
        int x, y, z, w, v, u, p, q, r;
        Pair8(int x, int y, int z, int w, int v, int u, int p, int q, int r) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
            this.u = u;
            this.p = p;
            this.q = q;
            this.r = r;
        }
    }

    static class Pair9 {
        int x, y, z, w, v, u, p, q, r, s;
        Pair9(int x, int y, int z, int w, int v, int u, int p, int q, int r, int s) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
            this.u = u;
            this.p = p;
            this.q = q;
            this.r = r;
            this.s = s;
        }
    }

    static class Pair10 {
        int x, y, z, w, v, u, p, q, r, s, t;
        Pair10(int x, int y, int z, int w, int v, int u, int p, int q, int r, int s, int t) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
            this.u = u;
            this.p = p;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
        }
    }

    static class Pair11 {
        int x, y, z, w, v, u, p, q, r, s, t, a;
        Pair11(int x, int y, int z, int w, int