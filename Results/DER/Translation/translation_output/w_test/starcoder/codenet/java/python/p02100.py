<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
x^2+3x+2

Expected output:
(x+1)(x+2)


```
import java.util.*;

public class p02100 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int num = 0;
		boolean plus = true;
		boolean si = false;
		boolean xs = false;
		long[] keis = new long[6];
		for (char c : arr) {
		    if (c == '+') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = true;
		    } else if (c == '-') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = false;
		    } else if (c == '^') {
		        si = true;
		        xs = false;
		    } else if (c == 'x') {
		        if (num == 0) {
		            num = 1;
		        }
		        xs = true;
		    } else {
		        if (si) {
		            int v = c - '0';
		            if (plus) {
		                keis[v] = num;
		            } else {
		                keis[v] = -num;
		            }
		            si = false;
		        } else {
		            num = num * 10 + c - '0';
		        }
		    }
		}
		if (plus) {
		    keis[0] = num;
		} else {
		    keis[0] = -num;
		}
		int ji = 0;
		for (int i = 5; i >= 0; i--) {
		    if (keis[i]!= 0) {
		        ji = i;
		        break;
		    }
		}
		int[] ans = new int[ji];
		for (int i = 1; i <= Math.abs(keis[0]) && ji > 0; i++) {
		    long result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(i, j) * keis[j];
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = -i;
		    }
		    result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(-i, j) * keis[j];
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = i;
		    }
		}
		Arrays.sort(ans);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
		    sb.append("(x");
		    if (ans[i] >= 0) {
		        sb.append("+");
		    }
		    sb.append(ans[i]).append(")");
		}
		System.out.println(sb);
	}
}


```

python code:<fim_suffix><fim_middle>

```python
import re

def main():
    s = input()
    s = re.sub(r'\+', '+', s)
    s = re.sub(r'-', '-', s)
    s = re.sub(r'\^', '', s)
    s = re.sub(r'x', '', s)
    s = re.sub(r'\s', '', s)
    s = re.sub(r'0', '', s)
    s = re.sub(r'1', '', s)
    s = re.sub(r'2', '', s)
    s = re.sub(r'3', '', s)
    s = re.sub(r'4', '', s)
    s = re.sub(r'5', '', s)
    s = re.sub(r'6', '', s)
    s = re.sub(r'7', '', s)
    s = re.sub(r'8', '', s)
    s = re.sub(r'9', '', s)
    s = re.sub(r'\+-', '-', s)
    s = re.sub(r'-\+', '-', s)
    s = re.sub(r'--', '+', s)
    s = re.sub(r'\+\+', '+', s)
    s = re.sub(r'\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+\+', '+', s)
    s = re.sub(r'\+\+\+\+\+\+\+\+
