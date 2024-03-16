<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def p(x):
 for i in range(7,int(x**.5+1),2):
  if x%i==0:return 0
 return 1
def f():
 n,c=map(int,input().split());s='9'*n
 if c<0:return(11,s+s)[n>1]
 for h in'9731':
  if n-1:
   for m in range(int(10**~-n),0,-1):
    m=str(m-1)
    if(sum(int(k)for k in h+m)*2+c)%3:
     t=h+m.zfill(n-1);a=int(t+str(c)+t[::-1])
     if p(a):return a
  else:
   a=int(h+str(c)+h)
   if p(a):return a
print(f())

```
[/INST]
```java
public class Main {
    public static int p(int x) {
        for (int i = 7; i <= (int) Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int f() {
        Scanner sc = new Scanner(System.in);
        int n, c = sc.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (11, s + s)[n > 1];
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1) {
                for (int m = (int) Math.pow(10, n - 1); m >= 0; m--) {
                    String mStr = Integer.toString(m - 1);
                    int sum = 0;
                    for (char k : h + mStr.toCharArray()) {
                        sum += Integer.parseInt(String.valueOf(k));
                    }
                    if ((sum * 2 + c) % 3 == 0) {
                        String t = h + mStr.substring(1, n - 1) + String.valueOf(c) + t.substring(0, 1);
                        int a = Integer.parseInt(t);
                        if (p(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (p(a)) {
                    return a;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
```</s>
