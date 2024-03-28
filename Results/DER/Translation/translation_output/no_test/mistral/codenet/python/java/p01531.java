<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < moji.length(); i++) {
            if (i == 1) {
                i = 0;
                continue;
            }
            if (moji.charAt(i) == '2') {
                answer.add('k');
            } else if (moji.charAt(i) == '3') {
                answer.add('s');
            } else if (moji.charAt(i) == '4') {
                answer.add('t');
            } else if (moji.charAt(i) == '5') {
                answer.add('n');
            } else if (moji.charAt(i) == '6') {
                answer.add('h');
            } else if (moji.charAt(i) == '7') {
                answer.add('m');
            } else if (moji.charAt(i) == '8') {
                answer.add('y');
            } else if (moji.charAt(i) == '9') {
                answer.add('r');
            } else if (moji.charAt(i) == '0') {
                i++;
                if (moji.charAt(i) == 'T') {
                    answer.add('wa');
                } else if (moji.charAt(i) == 'D') {
                    answer.add('wo');
                } else if (moji.charAt(i) == 'U') {
                    answer.add('nn');
                }
            } else if (moji.charAt(i) == 'T') {
                answer.add('a');
            } else if (moji.charAt(i) == 'L') {
                answer.add('i');
            } else if (moji.charAt(i) == 'U') {
                answer.add('u');
            } else if (moji.charAt(i) == 'R') {
                answer.add('e');
            } else if (moji.charAt(i) == 'D') {
                answer.add('o');
            }
        }

        for (char c : answer) {
            System.out.print(c);
        }

        System.out.println();
    }
}
```</s>
