<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n=list(input())
n.reverse()
lb,ub=0,len(n)
def check(x):
	g=0
	for i in n:
		x-=(x+g-int(i))%10
		if x<0:
			break
		g=(x+g)//10
	return x>=0
while ub-lb>1:
	mid=(lb+ub)//2
	if check(9*mid):
		ub=mid
	else:
		lb=mid
print(ub)
```
[/INST]
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> n = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        Collections.reverse(n);
        int lb = 0, ub = n.size();
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }
    public static int check(int x) {
        int g = 0;
        for (int i : n) {
            x -= (x + g - Integer.parseInt(i)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```</s>
