<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
Christmas


```
D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```
[/INST]
```java
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        String[] days = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        System.out.println(days[D - 25]);
    }
}
```
This code uses a `Scanner` to read the input from the user, and then uses an array of strings to store the names of the days. The `D - 25` expression is used to calculate the index of the array, based on the input value. Finally, the name of the day is printed to the console using `System.out.println()`.</s>
