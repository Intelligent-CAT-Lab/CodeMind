Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toUpperCase();
        String[] s2 = s1.split(" ");
        String s3 = s2[0];
        for (int i = 1; i < s2.length; i++) {
            s3 += s2[i].charAt(0);
        }
        System.out.println(s3);
    }
}
```

Explanation:

- We first import the `Scanner` class from the `java.util` package to read input from the user.
- We then create a `Scanner` object `sc` to read input from the user.
- We read the input string `s1` from the user and convert it to uppercase using the `toUpperCase()` method.
- We split the string `s1` into an array of substrings using the `split()` method with a space delimiter.
- We assign the first substring of the array to the variable `s3`.
- We loop through the remaining substrings of the array and concatenate their first character to the variable `s3`.
- Finally, we print the concatenated string `s3`.<|endoftext|>
