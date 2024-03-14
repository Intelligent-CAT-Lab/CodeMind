Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A,B = map(int,input().split())
X = []
for i in range(100):
    defC = "." if i<50 else "#"
    line = [defC for _ in range(100)]
    X.append(line)

h,w = (B-1)//50,(B-1)%50
for i in range(h):
    for j in range(50):
        X[i*2][j*2] = "#"
for i in range(w):
    X[h*2][i*2] = "#"

h,w = (A-1)//50,(A-1)%50
for i in range(h):
    for j in range(50):
        X[i*2+51][j*2] = "."
for i in range(w):
    X[h*2+51][i*2] = "."

print(100,100)
for i in range(100):
    print("".join(X[i]))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        List<List<Character>> X = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            List<Character> line = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                line.add('.');
            }
            X.add(line);
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X.get(i * 2).set(j * 2, '#');
            }
        }
        for (int i = 0; i < w; i++) {
            X.get(h * 2).set(i * 2, '#');
        }

        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X.get(i * 2 + 51).set(j * 2, '.');
            }
        }
        for (int i = 0; i < w; i++) {
            X.get(h * 2 + 51).set(i * 2, '.');
        }

        System.out.println(100);
        System.out.println(100);
        for (List<Character> line : X) {
            System.out.println(line.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
```<|endoftext|>
