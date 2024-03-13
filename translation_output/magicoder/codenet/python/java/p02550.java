<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n, x, m = map(int, input().split())

arr = [x]
s = set()
s.add(x)
h = -1
r = 0
for i in range(n - 1):
	val = arr[-1]**2 % m
	if val not in s:
		arr += [arr[-1]**2 % m]
		s.add(arr[-1])
	else:
		h = i
		r = val
		break


res = sum(arr)
if h != -1:
	new_arr = arr[arr.index(r):]
	rest = n - (h + 1)
	c = len(new_arr)
	q = rest // c
	ssum = sum(new_arr) * q
	r = rest % c
	for i in range(r):
		ssum += new_arr[i]
	res += ssum	
	
print(res)
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(x);
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = (int) Math.pow(arr.get(arr.size() - 1), 2) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = arr.stream().mapToInt(Integer::intValue).sum();
        if (h != -1) {
            List<Integer> newArr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = newArr.size();
            int q = rest / c;
            int ssum = newArr.stream().mapToInt(Integer::intValue).sum() * q;
            rest %= c;
            for (int i = 0; i < rest; i++) {
                ssum += newArr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, creates a list and a set, and then iterates over the range of n - 1. If the square of the last element in the list modulo m is not in the set, it adds it to the list and set. If it is, it breaks the loop and sets h and r. Then it calculates the sum of the list and if h is not -1, it calculates the sum of the sublist from r to the end of the list, multiplies it by the quotient of n - (h + 1) and the size of the sublist, and adds the remainder of the division of n - (h + 1) and the size of the sublist to the sum. Finally, it prints the sum.<｜end▁of▁sentence｜>
