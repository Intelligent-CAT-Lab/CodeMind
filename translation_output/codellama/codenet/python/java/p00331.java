<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

H,R = map(int,input().split())

if H>=0:
    print(1)
elif  H<0:
    if H+R>0:
        print(1)
    elif H+R==0:
        print(0)
    else:
        print(-1)
        



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int R = sc.nextInt();

        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print output to the console.</s>
