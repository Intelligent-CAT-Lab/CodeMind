System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            if (moji.charAt(i) == '1') {
                ans += "1";
            } else {
                ans += "9";
            }
        }
        System.out.println(ans);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read user input. We then declare a `String` variable `moji` to store the user's input. Next, we declare an empty `String` variable `ans` to store the translated string.

We then use a `for` loop to iterate over each character in the `moji` string. Inside the loop, we use an `if` statement to check if the current character is equal to `'1'`. If it is, we append `'1'` to the `ans` string. Otherwise, we append `'9'` to the `ans` string.

Finally, we print the `ans` string, which contains the translated string.<|endoftext|>
