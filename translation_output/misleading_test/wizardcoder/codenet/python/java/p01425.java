Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 7 3 1

Expected output:
es

```
def calc(vy,t):
     return vy*t - g/2*t*t

def cmp(lb,ub,x):
     if x < lb + eps:
          return -1
     elif x > ub - eps:
          return 1
     return 0

def check(qx,qy):
     if qx == 0:
          return 0
     a = g*g/4
     b = qy*g-V*V
     c = qx*qx+qy*qy
     D = b*b-4*a*c
     if D < -eps:
          return 0
     if -eps<=D<0:
          D = 0
     for d in (-1,1):
          tt = (-b+d*D**.5)/(2*a)
          if tt <= 0:
               continue
          t = tt**.5
          vx = qx/t
          vy = qy/t+g*t/2
          if calc(vy,X/vx) < Y - eps:
               return 0
          for L,B,R,T in obstacles:
               l = cmp(B,T,calc(vy,L/vx))
               r = cmp(B,T,calc(vy,R/vx))
               xh = cmp(L,R,vx*(vy/g))
               yh = cmp(B,T,calc(vy,vy/g))
               if l*r <= 0 or not xh and yh*l <= 0:
                    break
          else:
               return 1
     return 0

g = 9.8
eps = 1e-10
N,V,X,Y = map(int,input().split())
obstacles = []
for i in range(N):
     L,B,R,T = map(int,input().split())
     if L < X:
          obstacles.append((L,B,min(R,X),T))

if check(X,Y):
     print('Yes')
     exit()
for L,B,R,T in obstacles:
     if not L or not R:
          continue
     if check(L,T) or check(R,T):
          print('Yes')
          exit()
print('No')


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = 98;
        double eps = 1e-10;
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        ArrayList<int[]> obstacles = new ArrayList<int[]>();
        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            int B = sc.nextInt();
            int R = sc.nextInt();
            int T = sc.nextInt();
            if (L < X) {
                obstacles.add(new int[]{L, B, Math.min(R, X), T});
            }
        }
        boolean found = false;
        for (int i = 0; i < obstacles.size(); i++) {
            int[] obs = obstacles.get(i);
            if (obs[0] == 0) {
                if (check(X, Y, obs)) {
                    found = true;
                    break;
                }
            } else if (obs[1] <= Y && Y <= obs[3]) {
                if (check(obs[0], obs[3], obs) || check(obs[2], obs[3], obs)) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(int x, int y, int[] obs) {
        double vx = x / (double) obs[0];
        double vy = (y - obs[1]) / (double) (obs[3] - obs[1]) * (obs[2] - obs[0]) + obs[1];
        double t = Math.sqrt(vx * vx + vy * vy / g);
        double vy1 = vy + g * t / 2;
        double vy2 = vy - g * t / 2;
        if (vy1 * vy1 < (y - vy1) * (y - vy1) / (double) (obs[3] - obs[1])) {
            return true;
        }
        if (vy2 * vy2 < (y - vy2) * (y - vy2) / (double) (obs[3] - obs[1])) {
            return true;
        }
        return false;
    }
}
```<|endoftext|>
