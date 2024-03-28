<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
		    if (keis[i] != 0) {
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
[/INST]
```python
import sys

def p02100():
    arr = sys.stdin.readline().strip().split()
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6
    for c in arr:
        if c == '+':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = ord(c) - ord('0')
                if plus:
                    keis[v] = num
                else:
                    keis[v] = -num
                si = False
            else:
                num = num * 10 + ord(c) - ord('0')
    if plus:
        keis[0] = num
    else:
        keis[0] = -num
    ji = 0
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break
    ans = [0] * ji
    for i in range(1, abs(keis[0]) + 1, 1):
        result = 0
        for j in range(6):
            result += pow(i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = -i
        result = 0
        for j in range(6):
            result += pow(-i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = i
    ans.sort()
    sb = StringBuilder()
    for i in range(len(ans)):
        sb.append('(')
        if ans[i] >= 0:
            sb.append('+')
        sb.append(ans[i]).append(')')
    print(sb)

if __name__ == '__main__':
    p02100()
```</s>
