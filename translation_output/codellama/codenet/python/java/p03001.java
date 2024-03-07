<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

w,h,x,y = map(float,input().split())
mx,my = w/2,h/2
res= []
res.append(w*h/2)
if x==mx and y==my:
    res.append(1)
else:
    res.append(0)
print(res[0],res[1])

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double mx = w / 2;
        double my = h / 2;
        double res = w * h / 2;
        if (x == mx && y == my) {
            res = 1;
        } else {
            res = 0;
        }
        System.out.println(res);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextDouble()` method is used to read a double value from the input. The `System.out.println()` method is used to print the result to the console.</s>
