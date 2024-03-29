import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int mod = 1000000007;
    static int inf = 1000000000;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] ddx = {{0, 1, 0, -1}, {1, 0, -1, 0}};
    static int[][] ddy = {{1, 0, -1, 0}, {0, 1, 0, -1}};
    static int[] ddx2 = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] ddy2 = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[][] ddx4 = {{0, 1, 0, -1}, {1, 0, -1, 0}, {0, 1, 1, 1}, {1, 1, 1, 0}, {1, 0, 0, -1}, {1, -1, -1, -1}, {0, -1, -1, -1}, {-1, -1, -1, 0}};
    static int[][] ddy4 = {{1, 0, 1, 1}, {1, 1, 0, -1}, {0, 1, 1, 0}, {1, 1, 0, -1}, {-1, 0, -1, -1}, {-1, -1, 0, -1}, {-1, -1, -1, 0}, {-1, -1, 0, 1}};
    static int[][] ddx8 = {{0, 1, 1, 1, 0, -1, -1, -1}, {1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}};
    static int[][] ddy8 = {{1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}, {0, 1, 1, 1, 0, -1, -1, -1}};
    static int[][] ddx82 = {{0, 1, 1, 1, 0, -1, -1, -1}, {1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}, {0, 1, 1, 1, 0, -1, -1, -1}, {1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}};
    static int[][] ddy82 = {{1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}, {0, 1, 1, 1, 0, -1, -1, -1}, {1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}, {0, 1, 1, 1, 0, -1, -1, -1}};
    static int[][] ddx12 = {{0, 1, 1, 1, 0, -1, -1, -1}, {1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -1, -1, 0}, {0, 1, 1, 1, 0, -1, -1, -1}, {1, 1, 0, -1, -1, -1, 0, 1}, {1, 0, -1, -1, -1, 0, 1, 1}, {1, 1, 1, 0, -1, -