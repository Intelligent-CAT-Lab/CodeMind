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
                    if (j % 2 == 0) {
                        A[i][j] = 1;
                    } else {
                        A[i][j] = 1;
                    }
                }
            } else {
                for (int j = 0; j < N; j++) {
                    if (j % 2 == 0) {
                        A[i][j] = 1;
                    } else {
                        A[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    A[i][j] *= 2;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    A[i][j] *= 3;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    A[i][j] *= 4;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    A[i][j] *= 5;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    A[i][j] *= 2;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    A[i][j] *= 3;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    A[i][j] *= 4;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    A[i][j] *= 5;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    A[i][j] *= 2;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    A[i][j] *= 3;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    A[i][j] *= 4;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    A[i][j] *= 5;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    A[i][j] *= 2;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    A[i][j] *= 3;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    A[i][j] *= 4;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    A[i][j] *= 5;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    A[i][j] *= 2;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    A[i][j] *= 3;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    A[i][j] *= 4;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    A[i][j] *= 5;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    A[i][j] *= 2;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    A[i][j] *= 3;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    A[i][j] *= 4;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    A[i][j] *= 5;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2