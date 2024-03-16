<s> Translate the following python code to java and enclose your solution inside ```java```:
```
print[0,1,2,12,84,770,8340,106400,1546888,25343766,461133960,232367169,627905865,632459808,928262728,919805769,382796331,887217496,639768068,869694124,205875097,205589953,487772376,239955313,998339621,31622834,902930073,146839084,449786840,982224660,865803735,21834818,721531716,26008837,471774471,69010090,700009308,776938882,645550477,526939604,142728157,654489641,128201240,185493259,789721045,977049419,589149550,700648836,25087729,874433491,352791804][input()]
```

### Hint

- Use ```System.out.println``` to print the output.
- Use ```input()``` to get the input from the user.
- Use ```int[]``` to store the input.
- Use ```Arrays.toString()``` to convert the array to a string.

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(input));
    }
}
```
</s>
