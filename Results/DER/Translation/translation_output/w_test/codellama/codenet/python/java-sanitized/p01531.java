import java.util.Scanner;

public class p01531 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] moji = input.split("");
        String[] answer = new String[moji.length];
        int flag = 0;

        for (int i = 0; i < moji.length; i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            if (moji[i].equals("2")) {
                answer[i] = "k";
            } else if (moji[i].equals("3")) {
                answer[i] = "s";
            } else if (moji[i].equals("4")) {
                answer[i] = "t";
            } else if (moji[i].equals("5")) {
                answer[i] = "n";
            } else if (moji[i].equals("6")) {
                answer[i] = "h";
            } else if (moji[i].equals("7")) {
                answer[i] = "m";
            } else if (moji[i].equals("8")) {
                answer[i] = "y";
            } else if (moji[i].equals("9")) {
                answer[i] = "r";
            } else if (moji[i].equals("0")) {
                i++;
                flag = 1;
                if (moji[i].equals("T")) {
                    answer[i] = "wa";
                } else if (moji[i].equals("D")) {
                    answer[i] = "wo";
                } else if (moji[i].equals("U")) {
                    answer[i] = "nn";
                }
            } else if (moji[i].equals("T")) {
                answer[i] = "a";
            } else if (moji[i].equals("L")) {
                answer[i] = "i";
            } else if (moji[i].equals("U")) {
                answer[i] = "u";
            } else if (moji[i].equals("R")) {
                answer[i] = "e";
            } else if (moji[i].equals("D")) {
                answer[i] = "o";
            }
        }

        for (String s : answer) {
            System.out.print(s);
        }
        System.out.println();
    }
}