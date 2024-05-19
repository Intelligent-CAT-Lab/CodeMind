System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
a,*b,c = input()
print(a+str(len(b))+c)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        int middleWordsCount = words.length - 2;
        String middleWords = "";
        for (int i = 1; i < words.length - 1; i++) {
            middleWords += words[i];
        }
        String output = firstWord + middleWordsCount + lastWord;
        System.out.println(output);
    }
}
```

Test input:
internationalization

Expected output:
i18n<|endoftext|>
