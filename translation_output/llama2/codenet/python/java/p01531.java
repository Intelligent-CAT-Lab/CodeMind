<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java

String moji = input();
int flag = 0;
String[] answer = new String[0];

for (int i = 0; i < moji.length(); i++) {
    if (flag == 1) {
        flag = 0;
        continue;
    }
    if (moji.charAt(i) == '2') {
        answer[i] = "k";
    } else if (moji.charAt(i) == '3') {
        answer[i] = "s";
    } else if (moji.charAt(i) == '4') {
        answer[i] = "t";
    } else if (moji.charAt(i) == '5') {
        answer[i] = "n";
    } else if (moji.charAt(i) == '6') {
        answer[i] = "h";
    } else if (moji.charAt(i) == '7') {
        answer[i] = "m";
    } else if (moji.charAt(i) == '8') {
        answer[i] = "y";
    } else if (moji.charAt(i) == '9') {
        answer[i] = "r";
    } else if (moji.charAt(i) == '0') {
        i++;
        flag = 1;
        if (moji.charAt(i) == 'T') {
            answer[i] = "wa";
        } else if (moji.charAt(i) == 'D') {
            answer[i] = "wo";
        } else if (moji.charAt(i) == 'U') {
            answer[i] = "nn";
        }
    } else if (moji.charAt(i) == 'T') {
        answer[i] = "a";
    } else if (moji.charAt(i) == 'L') {
        answer[i] = "i";
    } else if (moji.charAt(i) == 'U') {
        answer[i] = "u";
    } else if (moji.charAt(i) == 'R') {
        answer[i] = "e";
    } else if (moji.charAt(i) == 'D') {
        answer[i] = "o";
    }
}

for (String i : answer) {
    System.out.print(i + " ");
}

System.out.println();


```

### 解説

```
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
```

この部分は、`for`ループで文字を読み込んでいる。

```
for (int i = 0; i < moji.length(); i++) {
    if (flag == 1) {
        flag = 0;
        continue;
    }
    if (moji.charAt(i) == '2') {
        answer[i] = "k";
    } else if (moji.charAt(i) == '3') {
        answer[i] = "s";
    } else if (moji.charAt(i) == '4') {
        answer[i] = "t";
    } else if (moji.charAt(i) == '5') {
        answer[i] = "n";
    } else if (moji.charAt(i) == '6') {
        answer[i] = "h";
    } else if (moji.charAt(i) == '7') {
        answer[i] = "m";
    } else if (moji.charAt(i) == '8') {
        answer[i] = "y";
    } else if (moji.charAt(i) == '9') {
        answer[i] = "r";
    } else if (moji.charAt(i) == '0') {
        i++;
        flag = 1;
        if (moji.charAt(i) == 'T') {
            answer[i] = "wa";
        } else if (moji.charAt(i) == 'D') {
            answer[i] = "wo";
        } else if (moji.charAt(i) == 'U') {
            answer[i] = "nn";
        }
    } else if (moji.charAt(i) == 'T') {
        answer[i] = "a";
    } else if (moji.charAt(i) == 'L') {
        answer[i] = "i";
    } else if (moji.charAt(i) == 'U') {
        answer[i] = "u";
    } else if (moji.charAt(i) == 'R') {
        answer[i] = "e";
    } else if (moji.charAt(i) == 'D') {
        answer[i] = "o";
    }
}
```

この部分は、文字を読み込んでいる。

```
for (String i : answer)
