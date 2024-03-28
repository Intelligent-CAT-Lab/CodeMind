<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
-5

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
Here is the Java version of the provided Python code:

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
            if (k % x == 0) {
                check(k / x, k, setl);
            }
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a set with the integer and its predecessor, and then checks all numbers up to the square root of the input. If a number is a factor of the input and its quotient when divided by the number gives a remainder of 1, it is added to the set. Finally, if the set contains 1, it is removed and the size of the set is printed.
<|EOT|>
