<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```

java code:<fim_suffix><fim_middle>
```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(Math.pow(n, 3));
        }
    }
}
```
'''
<|endoftext|>
