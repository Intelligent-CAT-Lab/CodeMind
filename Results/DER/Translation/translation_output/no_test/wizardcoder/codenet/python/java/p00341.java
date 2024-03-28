Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a=[0]*100
b=list(map(int,input().split()))
for i in range(12):
    a[b[i]-1]+=1
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
print('yes' if c==3 else 'no')
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        List<Integer> b = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            b.add(Integer.parseInt(input[i]));
        }
        for (int i = 0; i < 12; i++) {
            a[b.get(i) - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3? "yes" : "no");
    }
}
```<|endoftext|>
