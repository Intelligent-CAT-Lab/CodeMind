<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
3 3
##.
..#
#.#


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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int h = (A-1)/50;
        int w = (A-1)%50;
        for(int i=0;i<h;i++)
            for(int j=0;j<50;j++)
                System.out.print("#");
        for(int i=0;i<w;i++)
            System.out.print("#");
        System.out.println();
        for(int i=0;i<h;i++)
            for(int j=0;j<50;j++)
                System.out.print(".");
        for(int i=0;i<w;i++)
            System.out.print(".");
        System.out.println();
    }
}
```

'''
<|endoftext|>
