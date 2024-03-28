<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static double g = 9.8;
    static double eps = 1e-10;
    static int N, V, X, Y;
    static List<int[]> obstacles = new ArrayList<>();

    static double calc(double vy, double t) {
        return vy*t - g/2*t*t;
    }

    static int cmp(int lb, int ub, double x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    static int check(int qx, int qy) {
        if (qx == 0) {
            return 0;
        }
        double a = g*g/4;
        double b = qy*g-V*V;
        double c = qx*qx+qy*qy;
        double D = b*b-4*a*c;
        if (D < -eps) {
            return 0;
        }
        if (-eps<=D && D<0) {
            D = 0;
        }
        for (double d : new double[]{-1,1}) {
            double tt = (-b+d*Math.sqrt(D))/(2*a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = qx/t;
            double vy = qy/t+g*t/2;
            if (calc(vy,X/vx) < Y - eps) {
                return 0;
            }
            for (int[] obstacle : obstacles) {
                int L = obstacle[0], B = obstacle[1], R = obstacle[2], T = obstacle[3];
                int l = cmp(B, T, calc(vy,L/vx));
                int r = cmp(B, T, calc(vy,R/vx));
                int xh = cmp(L, R, vx*(vy/g));
                int yh = cmp(B, T, calc(vy,vy/g));
                if (l*r <= 0 || (!xh && yh*l <= 0)) {
                    break;
                }
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        V = scanner.nextInt();
        X = scanner.nextInt();
        Y = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt();
            int B = scanner.nextInt();
            int R = scanner.nextInt();
            int T = scanner.nextInt();
            if (L < X) {
                obstacles.add(new int[]{L, B, Math.min(R, X), T});
            }
        }
        if (check(X, Y) == 1) {
            System.out.println("Yes");
            System.exit(0);
        }
        for (int[] obstacle : obstacles) {
            if (obstacle[0] == 0 || obstacle[2] == 0) {
                continue;
            }
            if (check(obstacle[0], obstacle[3]) == 1 || check(obstacle[2], obstacle[3]) == 1) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as your Python code. It reads input from the standard input, and prints "Yes" if the ball can hit the target, and "No" otherwise. The obstacles are represented as a list of integer arrays, where each array has four elements: the left, bottom, right, and top coordinates of an obstacle.
<|EOT|>
