<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

class p03551:

    def run(self):
        n = int(input())
        m = int(input())

        base = n*100+m*1800

        print(base << m)

if __name__ == "__main__":
    p03551 = p03551()
    p03551.run()
```</s>
