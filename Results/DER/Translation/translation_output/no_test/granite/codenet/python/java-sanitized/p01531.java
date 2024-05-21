import java.util.Scanner;

public class p01531 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        int flag = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < moji.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            if (Character.toString(moji.charAt(i)).equals("2")) {
                answer.append("k");
            } else if (Character.toString(moji.charAt(i)).equals("3")) {
                answer.append("s");
            } else if (Character.toString(moji.charAt(i)).equals("4")) {
                answer.append("t");
            } else if (Character.toString(moji.charAt(i)).equals("5")) {
                answer.append("n");
            } else if (Character.toString(moji.charAt(i)).equals("6")) {
                answer.append("h");
            } else if (Character.toString(moji.charAt(i)).equals("7")) {
                answer.append("m");
            } else if (Character.toString(moji.charAt(i)).equals("8")) {
                answer.append("y");
            } else if (Character.toString(moji.charAt(i)).equals("9")) {
                answer.append("r");
            } else if (Character.toString(moji.charAt(i)).equals("0")) {
                i += 1;
                flag = 1;
                if (Character.toString(moji.charAt(i)).equals("T")) {
                    answer.append("wa");
                } else if (Character.toString(moji.charAt(i)).equals("D")) {
                    answer.append("wo");
                } else if (Character.toString(moji.charAt(i)).equals("U")) {
                    answer.append("nn");
                }
            } else if (Character.toString(moji.charAt(i)).equals("T")) {
                answer.append("a");
            } else if (Character.toString(moji.charAt(i)).equals("L")) {
                answer.append("i");
            } else if (Character.toString(moji.charAt(i)).equals("U")) {
                answer.append("u");
            } else if (Character.toString(moji.charAt(i)).equals("R")) {
                answer.append("e");
            } else if (Character.toString(moji.charAt(i)).equals("D")) {
                answer.append("o");
            }
        }

        System.out.println(answer.toString());
    }
}