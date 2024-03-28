<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5R2D

Expected output:
nek

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
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
```

This Java code does the same thing as the Python code. It reads a string from the user, processes each character of the string, and adds the corresponding string to an ArrayList. Finally, it prints out all the strings in the ArrayList.
<|EOT|>
