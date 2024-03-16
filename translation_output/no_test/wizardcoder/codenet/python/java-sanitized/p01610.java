public class p01610 {
    public static void main(String[] args) {
        String a = "R";
        String[][] s = {{"..rr....", "..rr...."}, {"ggyybbww", "ggyybbww"}, {"..oo....", "..oo...."}};
        for (int i = 0; i < a.length(); i++) {
            char k = a.charAt(i);
            if (k == 'R') {
                s = rotateRight(s);
            } else if (k == 'L') {
                s = rotateLeft(s);
            } else if (k == 'U') {
                s = rotateUp(s);
            } else if (k == 'D') {
                s = rotateDown(s);
            } else if (k == 'F') {
                s = rotateFront(s);
            } else {
                s = rotateBack(s);
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }

    public static String[][] rotateRight(String[][] s) {
        String[][] s_ = new String[s.length][s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[j][s.length - 1 - i];
            }
        }
        return s_;
    }

    public static String[][] rotateLeft(String[][] s) {
        String[][] s_ = new String[s.length][s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[s.length - 1 - j][i];
            }
        }
        return s_;
    }

    public static String[][] rotateUp(String[][] s) {
        String[][] s_ = new String[s.length][s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[s.length - 1 - j][i];
            }
        }
        return s_;
    }

    public static String[][] rotateDown(String[][] s) {
        String[][] s_ = new String[s.length][s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[j][i];
            }
        }
        return s_;
    }

    public static String[][] rotateFront(String[][] s) {
        String[][] s_ = new String[s.length][s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[i][j];
            }
        }
        return s_;
    }

    public static String[][] rotateBack(String[][] s) {
        String[][] s_ = new String[s.length][s[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s_[i][j] = s[i][s[i