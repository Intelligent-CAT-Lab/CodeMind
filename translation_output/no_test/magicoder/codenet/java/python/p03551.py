<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03551 {

	public static void main(String[] args) {
		p03551 m = new p03551();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}

```

@@ Response
```python
class p03551:

    def __init__(self):
        self.sc = self.Scanner(System.in)

    def run(self):
        n = self.sc.nextInt()
        m = self.sc.nextInt()

        base = n*100+m*1800

        print(base << m)


p03551 m = p03551()
m.run()
```

Please note that Python does not have a direct equivalent to Java's `<<` operator for bitwise left shift. Instead, Python uses the `<<` operator for bitwise left shift. Also, Python does not have a built-in `Scanner` class like Java, so we need to create a custom `Scanner` class.<｜end▁of▁sentence｜>
