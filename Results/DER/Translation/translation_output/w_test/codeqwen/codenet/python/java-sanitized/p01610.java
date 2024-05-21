import java.util.Scanner;

public class p01610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[][] s = {
                {'.' , '.' , 'r' , 'r' , '.' , '.' , '.' , '.'},
                {'.' , '.' , 'r' , 'r' , '.' , '.' , '.' , '.'},
                {'g' , 'g' , 'y' , 'y' , 'b' , 'b' , 'w' , 'w'},
                {'g' , 'g' , 'y' , 'y' , 'b' , 'b' , 'w' , 'w'},
                {'.' , 'o' , 'o' , '.' , '.' , '.' , '.' , '.'},
                {'.' , 'o' , 'o' , '.' , '.' , '.' , '.' , '.'}
        };

        for (char c : a.toCharArray()) {
            s = rotate(s, c);
        }

        for (char[] chars : s) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static char[][] rotate(char[][] s, char k) {
        char[][] s_ = new char[6][8];
        if (k == 'R') {
            s_[0][3] = s[2][3];
            s_[1][3] = s[3][3];
            s_[2][3] = s[4][3];
            s_[3][3] = s[5][3];

            s_[4][3] = s[3][6];
            s_[5][3] = s[2][6];
            s_[3][6] = s[0][3];
            s_[2][6] = s[