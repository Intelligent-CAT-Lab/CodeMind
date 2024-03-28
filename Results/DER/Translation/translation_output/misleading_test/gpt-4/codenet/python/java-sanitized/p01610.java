public class p01610 {
    public static void main(String[] args) {
        char[][] s = {
            "..rr....".toCharArray(),
            "..rr....".toCharArray(),
            "ggyybbww".toCharArray(),
            "ggyybbww".toCharArray(),
            "..oo....".toCharArray(),
            "..oo....".toCharArray()
        };

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String a = scanner.nextLine();
        scanner.close();

        for (char k : a.toCharArray()) {
            s = rotate(s, k);
        }

        for (char[] row : s) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static char[][] rotate(char[][] s, char k) {
        char[][] s_ = new char[6][8];
        for (int i = 0; i < 6; i++) {
            System.arraycopy(s[i], 0, s_[i], 0, 8);
        }

        switch (k) {
            case 'R':
                s_[0][3] = s[2][3];
                s_[1][3] = s[3][3];
                s_[2][3] = s[4][3];
                s_[3][3] = s[5][3];

                s_[4][3] = s[3][6];
                s_[5][3] = s[2][6];
                s_[3][6] = s[0][3];
                s_[2][6] = s[1][3];

                rotateSubFaceRight(s_, 2, 4, 3, 4);
                break;

            case 'L':
                s_[0][2] = s[3][7];
                s_[1][2] = s[2][7];
                s_[2][2] = s[0][2];
                s_[3][2] = s[1][2];

                s_[4][2] = s[2][2];
                s_[5][2] = s[3][2];
                s_[3][7] = s[4][2];
                s_[2][7] = s[5][2];

                rotateSubFaceRight(s_, 2, 0, 3, 1);
                break;

            case 'U':
                rotateEdgeUp(s_, s, 2, 0, 2, 7);
                rotateSubFaceRight(s_, 0, 2, 1, 3);
                break;

            case 'D':
                rotateEdgeDown(s_, s, 3, 0, 3, 5);
                rotateSubFaceRight(s_, 4, 2, 5, 3);
                break;

            case 'F':
                s_[1][2] = s[3][1];
                s_[1][3] = s[2][1];
                s_[3][1] = s[4][3];
                s_[2][1] = s[4][2];

                s_[4][3] = s[2][4];
                s_[4][2] = s[3][4];
                s_[2][4] = s[1][2];
                s_[3][4] = s[1][3];

                rotateSubFaceRight(s_, 2, 2, 3, 3);
                break;

            case 'B':
                s_[0][2] = s[2][5];
                s_[0][3] = s[3][5];
                s_[2][5] = s[5][3];
                s_[3][5] = s[5][2];

                s_[5][3] = s[3][0];
                s_[5][2] = s[2][0];
                s_[3][0] = s[0][2];
                s_[2][0] = s[0][3];

                rotateSubFaceRight(s_, 2, 6, 3, 7);
                break;
        }

        return s_;
    }

    private static void rotateSubFaceRight(char[][] s, int i1, int j1, int i2, int j2) {
        char temp = s[i1][j1];
        s[i1][j1] = s[i2][j1];
        s[i2][j1] = s[i2][j2];
        s[i2][j2] = s[i1][j2];
        s[i1][j2] = temp;
    }

    private static void rotateEdgeUp(char[][] s_, char[][] s, int iStart, int jStart, int iEnd, int jEnd) {
        int i;
        for (i = 0; i <= iEnd - iStart; i++) {
            s_[iStart][i + jStart] = s[iStart][(i + 2) % (iEnd - iStart + 1) + jStart];
        }
        for (i = 0; i <= jEnd - jStart; i++) {
            s_[iStart][(i + 2) % (jEnd - jStart + 1) + jStart] = s[iStart][i + jStart];
        }
    }

    private static void rotateEdgeDown(char[][] s_, char[][] s, int iStart, int jStart, int iEnd, int jEnd) {
        int i;
        for (i = 0; i <= iEnd - iStart; i++) {
            s_[iStart][(i + 6) % (iEnd - iStart + 1) + jStart] = s[iStart][i + jStart];
        }
        for (i = 0; i <= jEnd - jStart; i++) {
            s_[iStart][i + jStart] = s[iStart][(i + 6) % (jEnd - jStart + 1) + jStart];
        }
    }
}