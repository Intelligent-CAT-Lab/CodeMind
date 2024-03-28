<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
3


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
```
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k-1);
        for (int x = 2; x <= Math.sqrt(k) + 1; x++) {
            check(x);
            check(k/x);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int i) {
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
This is the Java code for the given Python code. The code first takes an input `k` from the user and then creates a set `setl` to store the prime factors of `k`. The code then iterates over the range of `2` to `sqrt(k) + 1` and calls the `check` function for each value of `x`. The `check` function takes an integer `i` as input and checks if `i` is a prime factor of `k`. If `i` is a prime factor, it is added to the set `setl`. Finally, the code prints the size of the set `setl`.

Note that the code uses the `Math.sqrt` method to calculate the square root of `k`, and the `Set.contains` method to check if an element is present in the set. The `Set.remove` method is used to remove the element `1` from the set if it is present.</s>
