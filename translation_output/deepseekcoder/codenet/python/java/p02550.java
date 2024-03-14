<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> arr = new ArrayList<>(Arrays.asList(x));
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

        int res = 0;
        for (int num : arr) {
            res += num;
        }

        if (h != -1) {
            List<Integer> newArr = arr.subList(arr.indexOf(r), arr.size());
            int rest = n - (h + 1);
            int c = newArr.size();
            int q = rest / c;
            int ssum = 0;
            for (int num : newArr) {
                ssum += num;
            }
            ssum *= q;
            rest = rest % c;
            for (int i = 0; i < rest; i++) {
                ssum += newArr.get(i);
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```
<|EOT|>
