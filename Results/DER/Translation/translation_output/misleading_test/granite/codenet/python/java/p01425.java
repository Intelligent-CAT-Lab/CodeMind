System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = 980;
        double eps = 1e-10;
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                obstacles[i][j] = sc.nextInt();
            }
        }
        if (check(X, Y, g, eps, N, V, X, Y, obstacles)) {
            System.out.println("Yes");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (obstacles[i][0] == 0 || obstacles[i][2] == 0) {
                continue;
            }
            if (check(obstacles[i][0], obstacles[i][3], g, eps, N, V, X, Y, obstacles) || check(obstacles[i][2], obstacles[i][3], g, eps, N, V, X, Y, obstacles)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public static boolean check(int qx, int qy, int g, double eps, int N, int V, int X, int Y, int[][] obstacles) {
        if (qx == 0) {
            return false;
        }
        double a = (double) g * g / 4;
        double b = (double) qy * g - (double) V * V;
        double c = (double) qx * qx + (double) qy * qy;
        double D = b * b - 4 * a * c;
        if (D < -eps) {
            return false;
        }
        if (-eps <= D && D < 0) {
            D = 0;
        }
        for (int d = -1; d <= 1; d += 2) {
            double tt = (-b + d * Math.sqrt(D)) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            double t = Math.sqrt(tt);
            double vx = (double) qx / t;
            double vy = (double) qy / t + (double) g * t / 2;
            if (calc(vy, X / vx, g, eps) < Y - eps) {
                return false;
            }
            for (int i = 0; i < N; i++) {
                int L = obstacles[i][0];
                int B = obstacles[i][1];
                int R = obstacles[i][2];
                int T = obstacles[i][3];
                int l = cmp(B, T, calc(vy, L / vx, g, eps), eps);
                int r = cmp(B, T, calc(vy, R / vx, g, eps), eps);
                int xh = cmp(L, R, vx * (vy / g), eps);
                int yh = cmp(B, T, calc(vy, vy / g, g, eps), eps);
                if (l * r <= 0 ||!xh && yh * l <= 0) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int cmp(int lb, int ub, double x, double eps) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        }
        return 0;
    }

    public static double calc(double vy, double t, int g, double eps) {
        return vy * t - (double) g / 2 * t * t;
    }
}
```<|endoftext|>
