import java.util.*;
import java.io.*;
import java.math.*;

class Main {
    static final int inf = 1000000007;
    static final long linf = 1000000000000000000L;
    static final double eps = 1e-10;
    static final double pi = 3.14159265358979323846;
    static final int[] dx = {1, 0, -1, 0};
    static final int[] dy = {0, 1, 0, -1};
    static final int[] dx8 = {1, 1, 0, -1, -1, -1, 0, 1};
    static final int[] dy8 = {0, 1, 1, 1, 0, -1, -1, -1};
    static final int[] dx4 = {1, 0, -1, 0};
    static final int[] dy4 = {0, 1, 0, -1};
    static final int[] dx4d = {1, 0, -1, 0, 1, 1, -1, -1};
    static final int[] dy4d = {0, 1, 0, -1, 1, -1, 1, -1};
    static final int[] dx8d = {1, 1, 0, -1, -1, -1, 0, 1, 1, 1, 0, -1, -1, -1, 0, 1};
    static final int[] dy8d = {0, 1, 1, 1, 0, -1, -1, -1, 0, 1, 1, 1, 0, -1, -1, -1};
    static final int[] dx82 = {1, 1, 1, 0, 0, -1, -1, -1};
    static final int[] dy82 = {1, 0, -1, 1, -1, 1, 0, -1};
    static final int[] dx82d = {1, 1, 1, 0, 0, -1, -1, -1, 1, 1, 1, 0, 0, -1, -1, -1};
    static final int[] dy82d = {1, 0, -1, 1, -1, 1, 0, -1, 1, 0, -1, 1, -1, 1, 0, -1};
    static final int[] dxkn = {1