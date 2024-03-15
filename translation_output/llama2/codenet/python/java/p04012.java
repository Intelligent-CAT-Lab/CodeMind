<s> Translate the following python code to java and enclose your solution inside ```java```:
```
# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (char i : Alfa.toCharArray()) {
            if (w.contains(i) && w.count(i) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```

### 解説

```
# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")
```

この問題は、文字列の中にある文字を数える問題です。

```python
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
```

この部分は、文字列wに含まれる文字iを数え、その数が奇数である場合に、「No」と表示して終了する処理です。

```java
for (char i : Alfa.toCharArray()) {
    if (w.contains(i) && w.count(i) % 2 == 1) {
        System.out.println("No");
        return;
    }
}
```

この部分は、文字列wに含まれる文字iを数え、その数が奇数である場合に、「No」と表示して終了する処理です。

```python
print("Yes")
```

この部分は、文字列wに含まれる文字iを数え、その数が偶数である場合に、「Yes」と表示する処理です。

```java
System.out.println("Yes");
```

この部分は、文字列wに含まれる文字iを数え、その数が偶数である場合に、「Yes」と表示する処理です。

### 参考

- [Pythonで文字列の中にある文字を数える](https://qiita.com/yuu_k/items/499999000000000000)
</s>
