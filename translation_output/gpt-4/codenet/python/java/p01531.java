Here's the translated Java code for your Python script:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        int flag = 0;
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < moji.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            switch (moji.charAt(i)) {
                case '2':
                    answer.add("k");
                    break;
                case '3':
                    answer.add("s");
                    break;
                case '4':
                    answer.add("t");
                    break;
                case '5':
                    answer.add("n");
                    break;
                case '6':
                    answer.add("h");
                    break;
                case '7':
                    answer.add("m");
                    break;
                case '8':
                    answer.add("y");
                    break;
                case '9':
                    answer.add("r");
                    break;
                case '0':
                    i++;
                    flag = 1;
                    if (i < moji.length()) {
                        switch (moji.charAt(i)) {
                            case 'T':
                                answer.add("wa");
                                break;
                            case 'D':
                                answer.add("wo");
                                break;
                            case 'U':
                                answer.add("nn");
                                break;
                        }
                    }
                    break;
                case 'T':
                    answer.add("a");
                    break;
                case 'L':
                    answer.add("i");
                    break;
                case 'U':
                    answer.add("u");
                    break;
                case 'R':
                    answer.add("e");
                    break;
                case 'D':
                    answer.add("o");
                    break;
            }
        }

        for (String s : answer) {
            System.out.print(s);
        }

        System.out.println();

        scanner.close();
    }
}
```

Remember that Java is more verbose and statically typed, so you need to handle certain things differently. For example, iterating over a string character by character and handling user input requires some additional setup.
