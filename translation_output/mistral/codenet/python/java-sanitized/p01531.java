import java.util.ArrayList;
import java.util.Scanner;

public class p01531 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < moji.length(); i++) {
            if (i == 1) {
                i = 0;
                continue;
            }
            if (moji.charAt(i) == '2') {
                answer.add('k');
            } else if (moji.charAt(i) == '3') {
                answer.add('s');
            } else if (moji.charAt(i) == '4') {
                answer.add('t');
            } else if (moji.charAt(i) == '5') {
                answer.add('n');
            } else if (moji.charAt(i) == '6') {
                answer.add('h');
            } else if (moji.charAt(i) == '7') {
                answer.add('m');
            } else if (moji.charAt(i) == '8') {
                answer.add('y');
            } else if (moji.charAt(i) == '9') {
                answer.add('r');
            } else if (moji.charAt(i) == '0') {
                i++;
                if (moji.charAt(i) == 'T') {
                    answer.add('wa');
                } else if (moji.charAt(i) == 'D') {
                    answer.add('wo');
                } else if (moji.charAt(i) == 'U') {
                    answer.add('nn');
                }
            } else if (moji.charAt(i) == 'T') {
                answer.add('a');
            } else if (moji.charAt(i) == 'L') {
                answer.add('i');
            } else if (moji.charAt(i) == 'U') {
                answer.add('u');
            } else if (moji.charAt(i) == 'R') {
                answer.add('e');
            } else if (moji.charAt(i) == 'D') {
                answer.add('o');
            }
        }

        for (char c : answer) {
            System.out.print(c);
        }

        System.out.println();
    }
}