System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
            if (Character.toString(moji.charAt(i)).equals("2")) {
                answer.append("k");
            } else if (Character.toString(moji.charAt(i)).equals("3")) {
                answer.append("s");
            } else if (Character.toString(moji.charAt(i)).equals("4")) {
                answer.append("t");
            } else if (Character.toString(moji.charAt(i)).equals("5")) {
                answer.append("n");
            } else if (Character.toString(moji.charAt(i)).equals("6")) {
                answer.append("h");
            } else if (Character.toString(moji.charAt(i)).equals("7")) {
                answer.append("m");
            } else if (Character.toString(moji.charAt(i)).equals("8")) {
                answer.append("y");
            } else if (Character.toString(moji.charAt(i)).equals("9")) {
                answer.append("r");
            } else if (Character.toString(moji.charAt(i)).equals("0")) {
                i += 1;
                flag = 1;
                if (Character.toString(moji.charAt(i)).equals("T")) {
                    answer.append("wa");
                } else if (Character.toString(moji.charAt(i)).equals("D")) {
                    answer.append("wo");
                } else if (Character.toString(moji.charAt(i)).equals("U")) {
                    answer.append("nn");
                }
            } else if (Character.toString(moji.charAt(i)).equals("T")) {
                answer.append("a");
            } else if (Character.toString(moji.charAt(i)).equals("L")) {
                answer.append("i");
            } else if (Character.toString(moji.charAt(i)).equals("U")) {
                answer.append("u");
            } else if (Character.toString(moji.charAt(i)).equals("R")) {
                answer.append("e");
            } else if (Character.toString(moji.charAt(i)).equals("D")) {
                answer.append("o");
            }
        }

        System.out.println(answer.toString());
    }
}
```<|endoftext|>
