import java.util.Scanner;

public class p01531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        int flag = 0;
        String[] answer = new String[moji.length()];

        for (int i = 0; i < moji.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            if (moji.charAt(i) == '2') {
                answer[i] = "k";
            } else if (moji.charAt(i) == '3') {
                answer[i] = "s";
            } else if (moji.charAt(i) == '4') {
                answer[i] = "t";
            } else if (moji.charAt(i) == '5') {
                answer[i] = "n";
            } else if (moji.charAt(i) == '6') {
                answer[i] = "h";
            } else if (moji.charAt(i) == '7') {
                answer[i] = "m";
            } else if (moji.charAt(i) == '8') {
                answer[i] = "y";
            } else if (moji.charAt(i) == '9') {
                answer[i] = "r";
            } else if (moji.charAt(i) == '0') {
                i++;
                flag = 1;
                if (moji.charAt(i) == 'T') {
                    answer[i] = "wa";
                } else if (moji.charAt(i) == 'D') {
                    answer[i] = "wo";
                } else if (moji.charAt(i) == 'U') {
                    answer[i] = "nn";
                }
            } else if (moji.charAt(i) == 'T') {
                answer[i] = "a";
            } else if (moji.charAt(i) == 'L') {
                answer[i] = "i";
            } else if (moji.charAt(i) == 'U') {
                answer[i] = "u";
            } else if (moji.charAt(i) == 'R') {
                answer[i] = "e";
            } else if (moji.charAt(i) == 'D') {
                answer[i] = "o";
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
        System.out.println();
    }
}