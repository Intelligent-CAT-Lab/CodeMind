Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
if h!= -1:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        arr.add(x);
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = arr.get(arr.size() - 1) * arr.get(arr.size() - 1) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = 0;
        for (int i : arr) {
            res += i;
        }

        if (h!= -1) {
            List<Integer> new_arr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = new_arr.size();
            int q = rest / c;
            int ssum = 0;
            for (int i : new_arr) {
                ssum += i;
            }
            ssum *= q;
            r = rest % c;
            for (int i = 0; i < r; i++) {
                ssum += new_arr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```<|endoftext|>
