<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def check(i):
	tot=k
	while(tot%i==0):
		tot//=i
	if(tot%i==1):
		setl.add(i)
import math
k=int(input())
setl = set()
setl.add(k); setl.add(k-1)
for x in range(2,int(math.sqrt(k))+1):
	check(x)
	check(k//x)
if(setl.__contains__(1)):
	setl.remove(1)
print(len(setl))
```

### Response:
```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        HashSet<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k-1);
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(x, k, setl);
            check(k/x, k, setl);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int i, int k, HashSet<Integer> setl) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `k` from the standard input, initializes a set `setl` with `k` and `k-1`, and then checks all numbers from 2 to the square root of `k` to see if they divide `k` evenly and leave a remainder of 1. If they do, they are added to `setl`. Finally, if `1` is in `setl`, it is removed and the size of `setl` is printed.
<|EOT|>
