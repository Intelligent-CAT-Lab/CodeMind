System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5R2D

Expected output:
neko


```

moji = input()
flag = 0
answer = []

for i in range(0,len(moji)):
    if flag == 1:
        flag = 0
        continue
    if moji[i] == "2":
        answer.append("k")
    elif moji[i] == "3":
        answer.append("s")
    elif moji[i] == "4":
        answer.append("t")
    elif moji[i] == "5":
        answer.append("n")
    elif moji[i] == "6":
        answer.append("h")
    elif moji[i] == "7":
        answer.append("m")
    elif moji[i] == "8":
        answer.append("y")
    elif moji[i] == "9":
        answer.append("r")
    elif moji[i] == "0":
        i+=1
        flag = 1
        if moji[i] == "T":
            answer.append("wa")
        elif moji[i] == "D":
            answer.append("wo")
        elif moji[i] == "U":
            answer.append("nn")
    elif moji[i] == "T":
        answer.append("a")
    elif moji[i] == "L":
        answer.append("i")
    elif moji[i] == "U":
        answer.append("u")
    elif moji[i] == "R":
        answer.append("e")
    elif moji[i] == "D":
        answer.append("o")

for i in answer:
    print(i, end="")

print()


```


Answer:
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
            if (Character.isDigit(mojo.charAt(i))) {
                switch (mojo.charAt(i)) {
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
                        flag = 1;
                        if (mojo.charAt(i) == 'T') {
                            answer.append("wa");
                        } else if (mojo.charAt(i) == 'D') {
                            answer.append("wo");
                        } else if (mojo.charAt(i) == 'U') {
                            answer.append("nn");
                        }
                        break;
                }
            } else {
                switch (mojo.charAt(i)) {
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
        }

        System.out.println(answer.toString());
    }
}
```<|endoftext|>
