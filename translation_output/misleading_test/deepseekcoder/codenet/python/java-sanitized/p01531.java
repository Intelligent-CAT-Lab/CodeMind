import java.util.*;

public class p01531 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int flag = 0;
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            if (input.charAt(i) == '2') {
                answer.add("k");
            } else if (input.charAt(i) == '3') {
                answer.add("s");
            } else if (input.charAt(i) == '4') {
                answer.add("t");
            } else if (input.charAt(i) == '5') {
                answer.add("n");
            } else if (input.charAt(i) == '6') {
                answer.add("h");
            } else if (input.charAt(i) == '7') {
                answer.add("m");
            } else if (input.charAt(i) == '8') {
                answer.add("y");
            } else if (input.charAt(i) == '9') {
                answer.add("r");
            } else if (input.charAt(i) == '0') {
                i++;
                flag = 1;
                if (input.charAt(i) == 'T') {
                    answer.add("wa");
                } else if (input.charAt(i) == 'D') {
                    answer.add("wo");
                } else if (input.charAt(i) == 'U') {
                    answer.add("nn");
                }
            } else if (input.charAt(i) == 'T') {
                answer.add("a");
            } else if (input.charAt(i) == 'L') {
                answer.add("i");
            } else if (input.charAt(i) == 'U') {
                answer.add("u");
            } else if (input.charAt(i) == 'R') {
                answer.add("e");
            } else if (input.charAt(i) == 'D') {
                answer.add("o");
            }
        }

        for (String s : answer) {
            System.out.print(s);
        }

        System.out.println();
    }
}