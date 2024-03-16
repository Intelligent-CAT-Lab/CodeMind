```java
import java.util.Scanner;

public class PythonToJavaTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int flag = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            switch (input.charAt(i)) {
                case '2':
                    answer.append('k');
                    break;
                case '3':
                    answer.append('s');
                    break;
                case '4':
                    answer.append('t');
                    break;
                case '5':
                    answer.append('n');
                    break;
                case '6':
                    answer.append('h');
                    break;
                case '7':
                    answer.append('m');
                    break;
                case '8':
                    answer.append('y');
                    break;
                case '9':
                    answer.append('r');
                    break;
                case '0':
                    i++;
                    flag = 1;
                    char nextChar = input.charAt(i);
                    switch (nextChar) {
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
                    break;
                case 'T':
                    answer.append('a');
                    break;
                case 'L':
                    answer.append('i');
                    break;
                case 'U':
                    answer.append('u');
                    break;
                case 'R':
                    answer.append('e');
                    break;
                case 'D':
                    answer.append('o');
                    break;
            }
        }

        System.out.println(answer.toString());
    }
}
```

