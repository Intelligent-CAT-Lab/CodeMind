Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x;
                if (j < a ^ i < b) {
                    x = 1;
                } else {
                    x = 0;
                }
                sb.append(x);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
```

### Response:
```python
import java.util.*;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x;
                if (j < a ^ i < b) {
                    x = 1;
                } else {
                    x = 0;
                }
                sb.append(x);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
```<|endoftext|>
