<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= Math.sqrt(k) + 1; x++) {
            check(x);
            check(k / x);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    private static void check(int i) {
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
Note that the `check` method is the same as the Python `check` function, and the `setl` variable is a `Set` of `Integer`s, which is equivalent to the Python `setl` set. The rest of the code is similar to the Python code, with the exception of the `Scanner` class being used to read input from the user.</s>
