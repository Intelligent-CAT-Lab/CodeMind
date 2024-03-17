Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures


```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String maxWord = "";
        String maxWord2 = "";
        int maxCount = 0;
        int maxCount2 = 0;
        for (String word : words) {
            int count = Collections.frequency(Arrays.asList(words), word);
            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
            if (word.length() > maxCount2) {
                maxCount2 = word.length();
                maxWord2 = word;
            }
        }
        System.out.println(maxWord);
        System.out.println(maxWord2);
    }
}
```

Explanation:

We first read the input string using the Scanner class and split it into words using the split() method. We then iterate over the words and use the Collections.frequency() method to count the frequency of each word in the list. We keep track of the maximum frequency and the corresponding word in two variables maxCount and maxWord, and the maximum length and the corresponding word in two variables maxCount2 and maxWord2. Finally, we print the two words.<|endoftext|>
