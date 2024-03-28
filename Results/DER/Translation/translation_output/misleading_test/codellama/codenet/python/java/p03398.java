<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-57

```
print[0,1,2,12,84,770,8340,106400,1546888,25343766,461133960,232367169,627905865,632459808,928262728,919805769,382796331,887217496,639768068,869694124,205875097,205589953,487772376,239955313,998339621,31622834,902930073,146839084,449786840,982224660,865803735,21834818,721531716,26008837,471774471,69010090,700009308,776938882,645550477,526939604,142728157,654489641,128201240,185493259,789721045,977049419,589149550,700648836,25087729,874433491,352791804][input()]
```
[/INST]

Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] arr = new int[] {0,1,2,12,84,770,8340,106400,1546888,25343766,461133960,232367169,627905865,632459808,928262728,919805769,382796331,887217496,639768068,869694124,205875097,205589953,487772376,239955313,998339621,31622834,902930073,146839084,449786840,982224660,865803735,21834818,721531716,26008837,471774471,69010090,700009308,776938882,645550477,526939604,142728157,654489641,128201240,185493259,789721045,977049419,589149550,700648836,25087729,874433491,352791804};
        System.out.println(arr[input]);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print the output to the console. The `int[] arr` array is initialized with the values from the Python code, and the `input()` method is used to read the user's input and store it in the `input` variable. Finally, the value at the index specified by the `input` variable is printed to the console using the `System.out.println()` method.</s>
