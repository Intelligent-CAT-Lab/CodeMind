<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k-1);
        for (int x = 2; x <= Math.sqrt(k) + 1; x++) {
            check(x, setl);
            check(k/x, setl);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int i, Set<Integer> setl) {
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
This is the Java code for the given Python code. The `check` function is implemented in Java using a `Set` data structure to keep track of the factors of `k`. The `check` function is called for each factor `x` from 2 to `Math.sqrt(k) + 1`, and the factors are added to the set if they are not already present. Finally, the size of the set is printed as the output.

Note that the `math` module is not required in Java, as the `Math` class provides the same functionality. Additionally, the `setl.__contains__(1)` check is not required in Java, as the `Set` interface provides a `contains` method that can be used to check if an element is present in the set.</s>
