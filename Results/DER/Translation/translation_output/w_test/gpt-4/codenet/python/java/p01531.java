Below is the translation of your provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
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
                    i++;
                    flag = true;
                    if (i < moji.length()) {
                        switch (moji.charAt(i)) {
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
    }
}
```

Here's how to run the translated Java code with your test case input and how it will produce the expected output:

- Compile the code. Assuming the file is named `Main.java`:
```sh
javac Main.java
```

- Run the compiled class with input "5R2D" (you'd type this input after running the below command when the program prompts for it):
```sh
java Main
```

Expected output printed to the console once you input "5R2D":
```
neko
```
