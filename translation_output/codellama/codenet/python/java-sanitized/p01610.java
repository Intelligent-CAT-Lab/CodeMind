import java.util.Scanner;

public class p01610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] s = {
            { "..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...." }
        };
        String a = scanner.nextLine();
        for (int i = 0; i < a.length(); i++) {
            s = rotate(s, a.charAt(i));
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }

    public static String[][] rotate(String[][] s, char k) {
        String[][] s_ = new String[6][8];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[i][j];
            }
        }
        if (k == 'R') {
            s_[0][3] = s[2][3];
            s_[1][3] = s[3][3];
            s_[2][3] = s[4][3];
            s_[3][3] = s[5][3];

            s_[4][3] = s[3][6];
            s_[5][3] = s[2][6];
            s_[3][6] = s[0][3];
            s_[2][6] = s[1][3];

            s_[2][4] = s[3][4];
            s_[3][4] = s[3][5];
            s_[3][5] = s[2][5];
            s_[2][5] = s[2][4];
        } else if (k == 'L') {
            s_[0][2] = s[3][7];
            s_[1][2] = s[2][7];
            s_[2][2] = s[0][2];
            s_[3][2] = s[1][2];

            s_[4][2] = s[2][2];
            s_[5][2] = s[3][2];
            s_[3][7] = s[4][2];
            s_[2][7] = s[5][