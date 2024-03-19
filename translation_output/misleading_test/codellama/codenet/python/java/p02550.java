<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2 1001

Expected output:
1459

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
[/INST]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = arr[i] * arr[i] % m;
            if (!s.contains(val)) {
                arr[i + 1] = val;
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }

        if (h != -1) {
            int[] newArr = new int[arr.length - h - 1];
            System.arraycopy(arr, h + 1, newArr, 0, newArr.length);
            int rest = n - (h + 1);
            int c = newArr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < newArr.length; i++) {
                ssum += newArr[i] * q;
            }
            int r = rest % c;
            for (int i = 0; i < r; i++) {
                ssum += newArr[i];
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```
This code is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `Set` and `HashSet` classes to keep track of the values that have already been seen. The `h` and `r` variables are used to keep track of the index of the first repeated value and the value itself, respectively. The `res` variable is used to store the final result.

The code first reads the input from the user and initializes the `arr`, `s`, `h`, and `r` variables. It then loops through the array and calculates the square of each element, and checks if the value has already been seen. If it has, it sets `h` to the index of the first repeated value and `r` to the value itself, and breaks out of the loop. If it hasn't, it adds the value to the set and the array.

After the loop, the code calculates the sum of the array and stores it in `res`. If `h` is not equal to -1, it means that a repeated value was found, so it calculates the sum of the remaining elements in the array and adds it to `res`.

Finally, the code prints the final result.</s>
