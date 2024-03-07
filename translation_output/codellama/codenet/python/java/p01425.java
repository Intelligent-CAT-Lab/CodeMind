<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int g = 98;
        int eps = 1e-10;
        int[][] obstacles = new int[N][4];
        for (int i = 0; i < N; i++) {
            obstacles[i][0] = scanner.nextInt();
            obstacles[i][1] = scanner.nextInt();
            obstacles[i][2] = scanner.nextInt();
            obstacles[i][3] = scanner.nextInt();
        }
        if (check(X, Y)) {
            System.out.println("Yes");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (obstacles[i][0] < X && obstacles[i][2] > X) {
                if (check(obstacles[i][0], obstacles[i][3]) || check(obstacles[i][2], obstacles[i][3])) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static boolean check(int qx, int qy) {
        if (qx == 0) {
            return false;
        }
        int a = g * g / 4;
        int b = qy * g - V * V;
        int c = qx * qx + qy * qy;
        int D = b * b - 4 * a * c;
        if (D < -eps) {
            return false;
        }
        if (-eps <= D && D < 0) {
            D = 0;
        }
        for (int d = -1; d <= 1; d++) {
            int tt = (-b + d * D ** 0.5) / (2 * a);
            if (tt <= 0) {
                continue;
            }
            int t = (int) Math.sqrt(tt);
            int vx = qx / t;
            int vy = qy / t + g * t / 2;
            if (calc(vy, X / vx) < Y - eps) {
                return false;
            }
            for (int[] obstacle : obstacles) {
                int l = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[0] / vx));
                int r = cmp(obstacle[1], obstacle[3], calc(vy, obstacle[2] / vx));
                int xh = cmp(obstacle[0], obstacle[2], vx * (vy / g));
                int yh = cmp(obstacle[1], obstacle[3], calc(vy, vy / g));
                if (l * r <= 0 || !xh && yh * l <= 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public static int cmp(int lb, int ub, int x) {
        if (x < lb + eps) {
            return -1;
        } else if (x > ub - eps) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int calc(int vy, int t) {
        return vy * t - g / 2 * t * t;
    }
}
```
Note that I had to make some assumptions about the types of the variables in the Python code, since the Python code did not specify the types. I assumed that `N`, `V`, `X`, `Y`, `g`, and `eps` are all integers, and that `obstacles` is a list of lists of integers. I also assumed that `calc` and `cmp` are functions that take integers as input and return integers as output.</s>
