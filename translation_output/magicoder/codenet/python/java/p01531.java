<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
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
            if (moji.charAt(i) == '2') {
                answer.append("k");
            } else if (moji.charAt(i) == '3') {
                answer.append("s");
            } else if (moji.charAt(i) == '4') {
                answer.append("t");
            } else if (moji.charAt(i) == '5') {
                answer.append("n");
            } else if (moji.charAt(i) == '6') {
                answer.append("h");
            } else if (moji.charAt(i) == '7') {
                answer.append("m");
            } else if (moji.charAt(i) == '8') {
                answer.append("y");
            } else if (moji.charAt(i) == '9') {
                answer.append("r");
            } else if (moji.charAt(i) == '0') {
                i++;
                flag = 1;
                if (moji.charAt(i) == 'T') {
                    answer.append("wa");
                } else if (moji.charAt(i) == 'D') {
                    answer.append("wo");
                } else if (moji.charAt(i) == 'U') {
                    answer.append("nn");
                }
            } else if (moji.charAt(i) == 'T') {
                answer.append("a");
            } else if (moji.charAt(i) == 'L') {
                answer.append("i");
            } else if (moji.charAt(i) == 'U') {
                answer.append("u");
            } else if (moji.charAt(i) == 'R') {
                answer.append("e");
            } else if (moji.charAt(i) == 'D') {
                answer.append("o");
            }
        }

        System.out.println(answer);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a string from the user, processes it character by character, and appends the corresponding Japanese character to a StringBuilder. The final string is then printed out.<｜end▁of▁sentence｜>
