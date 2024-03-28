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
        String[] arr = input.split(" ");
        String max1 = "";
        String max2 = "";
        int count1 = 0;
        int count2 = 0;
        for (String s : arr) {
            if (s.length() > max1.length()) {
                max1 = s;
            }
            if (s.length() > max2.length()) {
                max2 = s;
            }
            if (s.equals(max1)) {
                count1++;
            }
            if (s.equals(max2)) {
                count2++;
            }
        }
        if (count1 == 1) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }
    }
}
```

Explanation:

We first take the input string using the Scanner class and split it into an array of words using the split() method. We then initialize two variables, max1 and max2, to store the longest and second longest words respectively. We also initialize two variables, count1 and count2, to keep track of the number of times max1 and max2 appear in the input string.

We then loop through the array of words and update max1 and max2 if we find a longer word. We also update count1 and count2 if we find max1 or max2 in the current word.

Finally, we check the value of count1 and count2. If count1 is 1, we print max1, otherwise we print max2.<|endoftext|>
