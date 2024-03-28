Here's the translated Python code to Java:

```java
import java.util.Scanner;

public class MojiConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        boolean flag = false;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < moji.length(); i++) {
            if (flag) {
                flag = false;
                continue;
            }
            switch (moji.charAt(i)) {
                case '2':
                    answer.append("k");
                    break;
                case '3':
                    answer.append("s");
                    break;
                case '4':
                    answer.append("t");
                    break;
                case '5':
                    answer.append("n");
                    break;
                case '6':
                    answer.append("h");
                    break;
                case '7':
                    answer.append("m");
                    break;
                case '8':
                    answer.append("y");
                    break;
                case '9':
                    answer.append("r");
                    break;
                case '0':
                    flag = true;
                    if (i + 1 < moji.length()) {
                        switch (moji.charAt(++i)) {
                            case 'T':
                                answer.append("wa");
                                break;
                            case 'D':
                                answer.append("wo");
                                break;
                            case 'U':
                                answer.append("nn");
                                break;
                        }
                    }
                    break;
                case 'T':
                    answer.append("a");
                    break;
                case 'L':
                    answer.append("i");
                    break;
                case 'U':
                    answer.append("u");
                    break;
                case 'R':
                    answer.append("e");
                    break;
                case 'D':
                    answer.append("o");
                    break;
            }
        }

        System.out.print(answer.toString());
        scanner.close();
    }
}
```

To test this Java program, you can run it and provide the input `5R2D` in your console. It should print `nek` as expected.
