import java.util.Scanner;

public class p01610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] s = {
            {".", ".", "r", "r", ".", ".", ".", ".", "."},
            {".", ".", "r", "r", ".", ".", ".", ".", "."},
            {"g", "g", "y", "y", "b", "b", "w", "w", "."},
            {"g", "g", "y", "y", "b", "b", "w", "w", "."},
            {".", ".", "o", "o", ".", ".", ".", ".", "."},
            {".", ".", "o", "o", ".", ".", ".", ".", "."}
        };

        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            char k = a.charAt(i);
            switch (k) {
                case 'R':
                    s[0][3] = s[2][3];
                    s[1][3] = s[3][3];
                    s[2][3] = s[4][3];
                    s[3][3] = s[5][3];

                    s[4][3] = s[3][6];
                    s[5][3] = s[2][6];
                    s[3][6] = s[0][3];
                    s[2][6] = s[1][3];

                    s[2][4] = s[3][4];
                    s[3][4] = s[3][5];
                    s[3][5] = s[2][5];
                    s[2][5] = s[2][4];
                    break;
                case 'L':
                    s[0][2] = s[3][7];
                    s[1][2] = s[2][7];
                    s[2][2] = s[0][2];
                    s[3][2] = s[1][2];

                    s[4][2] = s[2][2];
                    s[5][2] = s[3][2];
                    s[3][7] = s[4][2];
                    s[2][7] = s[5][2];

                    s