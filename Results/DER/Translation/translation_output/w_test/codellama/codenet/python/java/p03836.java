<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1 2

Expected output:
UURDDLLUUURRDRDDDLLU


```
sx,sy,tx,ty = map(int,input().split())
x = (tx-sx)
y = (ty-sy)

order = "L"

order += "U"*(y+1)
order += "R"*(x+1)
order += "D"

order += "R"
order += "D"*(y+1)
order += "L"*(x+1)
order += "U"

order += "U"*y
order += "R"*x
order += "D"*y
order += "L"*x
print(order)

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int sx = Integer.parseInt(input[0]);
        int sy = Integer.parseInt(input[1]);
        int tx = Integer.parseInt(input[2]);
        int ty = Integer.parseInt(input[3]);
        int x = tx - sx;
        int y = ty - sy;

        String order = "L";

        order += "U".repeat(y + 1);
        order += "R".repeat(x + 1);
        order += "D";

        order += "R";
        order += "D".repeat(y + 1);
        order += "L".repeat(x + 1);
        order += "U";

        order += "U".repeat(y);
        order += "R".repeat(x);
        order += "D".repeat(y);
        order += "L".repeat(x);

        System.out.println(order);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it splits the input into four integers using the `split()` method. It then calculates the difference between the starting and ending coordinates, and uses the `repeat()` method to generate the required number of "U", "R", "D", and "L" characters. Finally, it prints the resulting string.</s>
