System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures 

```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        List<String> wordList = Arrays.asList(words);
        String maxCountWord = wordList.stream()
           .max(Comparator.comparingInt(wordList::indexOf))
           .get();
        String maxLengthWord = wordList.stream()
           .max(Comparator.comparingInt(String::length))
           .get();
        System.out.println(maxCountWord + " " + maxLengthWord);
    }
}
```

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures <|endoftext|>
