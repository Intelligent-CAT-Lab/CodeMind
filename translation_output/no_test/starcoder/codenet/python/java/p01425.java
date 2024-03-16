<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        double g = 9.8;
        double eps = 1e-10;
        double[][] obstacles = new double[N][4];
        for (int i = 0; i < N; i++) {
            obstacles[i][0] = sc.nextDouble();
            obstacles[i][1] = sc.nextDouble();
            obstacles[i][2] = sc.nextDouble();
            obstacles[i][3] = sc.nextDouble();
        }
        double lb = 0, ub = X;
        while (ub - lb > eps) {
            double mid = (lb + ub) / 2;
            if (check(mid, Y, obstacles, g, eps)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(lb);
    }

    public static boolean check(double x, double y, double[][] obstacles, double g, double eps) {
        double qx = x, qy = y;
        if (qx == 0) {
            return false;
        }
        double a = g * g / 4;
        double b = qy * g - V * V;
        double c = qx * qx + qy * qy;
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
            double vx = qx / t;
            double vy = qy / t + g * t / 2;
            if (vy * t - g / 2 * t * t > Y - eps) {
                continue;
            }
            for (int i = 0; i < obstacles.length; i++) {
                double L = obstacles[i][0], B = obstacles[i][1], R = obstacles[i][2], T = obstacles[i][3];
                double l = cmp(B, T, vy * t - g / 2 * t * t);
                double r = cmp(B, T, vy * t - g / 2 * t * t);
                double xh = cmp(L, R, vx * (vy / g));
                double yh = cmp(B, T, vy * (vy / g));
                if (l * r <= 0 ||!xh && yh * l <= 0) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static double cmp(double a, double b, double c) {
        if (a < b + eps) {
            return -1;
        }
        if (a > b - eps) {
            return 1;
        }
        return 0;
    }
}
```
<|endoftext|>
