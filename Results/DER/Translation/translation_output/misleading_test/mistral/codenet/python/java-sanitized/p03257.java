import java.util.*;

public class p03257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = (j == 0 || j == N - 1) ? 1 : 0;
                }
            } else {
                for (int j = 0; j < N; j++) {
                    A[i][j] = (j == 0 || j == N - 1) ? 1 : 0;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (A[i][j] == 1) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 2;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 2) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 3;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 3) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 4;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 4) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 5;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 5) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 6;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 6) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 7;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 7) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 8;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 8) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 9;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 9) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1) {
                            A[i][j] = 10;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 10) {
                    for (int k = 0; k < N; k++) {
                        if (A[i][k] == 1 && A[j][k] == 1