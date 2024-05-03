Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
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
            char c = moji.charAt(i);
            if (c == '2') {
                answer.append("k");
            } else if (c == '3') {
                answer.append("s");
            } else if (c == '4') {
                answer.append("t");
            } else if (c == '5') {
                answer.append("n");
            } else if (c == '6') {
                answer.append("h");
            } else if (c == '7') {
                answer.append("m");
            } else if (c == '8') {
                answer.append("y");
            } else if (c == '9') {
                answer.append("r");
            } else if (c == '0') {
                i++;
                flag = 1;
                if (moji.charAt(i) == 'T') {
                    answer.append("wa");
                } else if (moji.charAt(i) == 'D') {
                    answer.append("wo");
                } else if (moji.charAt(i) == 'U') {
                    answer.append("nn");
                }
            } else if (c == 'T') {
                answer.append("a");
            } else if (c == 'L') {
                answer.append("i");
            } else if (c == 'U') {
                answer.append("u");
            } else if (c == 'R') {
                answer.append("e");
            } else
