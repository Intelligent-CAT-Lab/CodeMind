<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2 , x + w//2) + max(-W//2, x-w//2))
b = (min(H//2 , y + h//2) + max(-H//2, y-h//2))
print(b/a)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int a = Math.min(W / 2, x + w / 2) + Math.max(-W / 2, x - w / 2);
        int b = Math.min(H / 2, y + h / 2) + Math.max(-H / 2, y - h / 2);
        System.out.println(b / a);
    }
}
```
Note that the `inpl()` function in Python is not necessary in Java, as the `Scanner` class provides a similar functionality. Also, the `map()` function in Python is not necessary in Java, as the `Scanner` class provides a similar functionality.</s>
