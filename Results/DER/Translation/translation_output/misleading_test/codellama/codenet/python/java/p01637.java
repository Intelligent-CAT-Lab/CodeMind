<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
M r

Expected output:
9277

```
def f(a,b,c):
    return a*b<100*c
m,rd,rr,cd,cr=map(int,input().split())
ex=cd*100//rd
if(f(ex,rd,cd)):ex+=1
ey=cr*100//rr
if(f(ey,rr,cr)):ey+=1
print(m-ex-ey if m-ex-ey>=0 else -1)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int m = Integer.parseInt(tokens[0]);
        int rd = Integer.parseInt(tokens[1]);
        int rr = Integer.parseInt(tokens[2]);
        int cd = Integer.parseInt(tokens[3]);
        int cr = Integer.parseInt(tokens[4]);

        int ex = cd * 100 / rd;
        if (f(ex, rd, cd)) {
            ex += 1;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
        }
        int result = m - ex - ey;
        if (result < 0) {
            result = -1;
        }
        System.out.println(result);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```
This code first reads the input from the user, then it splits the input into tokens using the space character as the delimiter. It then converts the tokens to integers and stores them in the variables `m`, `rd`, `rr`, `cd`, and `cr`.

The code then calculates the values of `ex` and `ey` using the formula `cd * 100 / rd` and `cr * 100 / rr`, respectively. It then checks if the values of `ex` and `ey` are less than 100, and if so, it increments them by 1.

Finally, the code calculates the result as `m - ex - ey`, and if the result is less than 0, it sets the result to -1. It then prints the result to the console.

Note that the `f` function is a helper function that checks if the product of two numbers is less than 100 times the third number. It is used in the code to check if the values of `ex` and `ey` are less than 100.</s>
