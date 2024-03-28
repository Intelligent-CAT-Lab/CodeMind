<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.*;
public class Main {
    public static void check(int i) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(x);
            check(k / x);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }
}
```</s>
