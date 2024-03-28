import java.util.Scanner;

public class p01531 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.next();
        int flag = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < moji.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            if (moji.charAt(i) == '2') {
                answer.append("k");
            } else if (moji.charAt(i) == '3') {
                answer.append("s");
            } else if (moji.charAt(i) == '4') {
                answer.append("t");
            } else if (moji.charAt(i) == '5') {
                answer.append("n");
            } else if (moji.charAt(i) == '6') {
                answer.append("h");
            } else if (moji.charAt(i) == '7') {
                answer.append("m");
            } else if (moji.charAt(i) == '8') {
                answer.append("y");
            } else if (moji.charAt(i) == '9') {
                answer.append("r");
            } else if (moji.charAt(i) == '0') {
                i++;
                flag = 1;
                if (moji.charAt(i) == 'T') {
                    answer.append("wa");
                } else if (moji.charAt(i) == 'D') {
                    answer.append("wo");
                } else if (moji.charAt(i) == 'U') {
                    answer.append("nn");
                }
            } else if (moji.charAt(i) == 'T') {
                answer.append("a");
            } else if (moji.charAt(i) == 'L') {
                answer.append("i");
            } else if (moji.charAt(i) == 'U') {
                answer.append("u");
            } else if (moji.charAt(i) == 'R') {
                answer.append("e");
            } else if (moji.charAt(i) == 'D') {
                answer.append("o");
            }
        }

        System.out.println(answer);
    }
}