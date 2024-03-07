<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();
        scanner.close();

        int x = tx - sx;
        int y = ty - sy;

        String order = "L";
        order += "U".repeat(y + 1);
        order += "R".repeat(x + 1);
        order += "D";
        order += "R".repeat(y + 1);
        order += "L".repeat(x + 1);
        order += "U".repeat(y);
        order += "R".repeat(x);
        order += "D".repeat(y);
        order += "L".repeat(x);

        System.out.println(order);
    }
}
```
Note that the `repeat` method is used to repeat a string a certain number of times. In this case, it is used to repeat the letters "U", "R", "D", and "L" a certain number of times based on the values of `x`, `y`, `tx`, and `ty`.</s>
