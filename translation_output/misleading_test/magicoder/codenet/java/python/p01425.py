<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 7 3 1

Expected output:
es

```

import java.util.*;

public class p01425{
	static int N, V, X, Y;
	static int[] L, B, R, T;
	static double g = 9.8;
	static double EPS = 1e-6;

//	æ ¹æ®y&#36724;æ¹åçåéåº¦vyåéågï¼è¿åt&#26102;&#38388;ç¹&#26102;çä½ç½®y
	private static double calc(double vy, double t) {
		return vy*t - g*t*t/2;
	}
	
	private static int cmp(int lb, int ub, double a) {
		return a < lb+EPS ? -1 : a > ub-EPS ? 1 : 0;
	}
	
	private static boolean check(double qx, double qy){
		double a = g*g/4;
		double b = g*qy - V*V;
		double c = qx*qx + qy*qy;
		double D = b*b - 4*a*c;
		if(D<0 & D>-EPS) D=0;
		if(D < 0) return false;
		
		for(int d = -1; d < 2; d=d+2){
			double t2 = (-b + d*Math.sqrt(D)) / (2*a);	

//			System.out.println(t2);
			if(t2 < 0) continue;
			double t = Math.sqrt(t2);
			double vx = qx / t;
			double vy = Math.sqrt(V*V - vx*vx);
			
			double yt = calc(vy, X/vx);
			if(yt < Y - EPS) continue;
			
			boolean ok = true;
			for(int i = 0; i < N; i++){
//				ç³&#22836;å¨pigå³&#36793;ï¼ç´æ¥&#36807;&#28388;
				if(L[i] >= X) continue;
//				å½æ¥å°pigæ­£ä¸æ¹&#26102;ï¼ä¸pigä¹&#38388;ææ²¡æéç¢ç©
				if(R[i] >= X & T[i] >= Y & yt >= B[i]) ok = false;				
//				ä¸­éä¼ä¸ä¼éå°éç¢
//				ä¸å±è¦å¤å®4æ¡
//				ä¸ï¼ä¸&#27599;ä¸ªéç¢ç©çå·¦&#36793;ççç¸&#23545;ä½ç½®
				int yL = cmp(B[i], T[i], calc(vy, L[i]/vx));
//				äºï¼ä¸&#27599;ä¸ªéç¢ç©çå³&#36793;ççç¸&#23545;ä½ç½®
				int yR = cmp(B[i], T[i], calc(vy, R[i]/vx));
//				ä¸ï¼birdåå°æé«ç¹&#26102;ä¸&#27599;ä¸ªéç¢ç©çå·¦å³ççç¸&#23545;ä½ç½®
				int xH = cmp(L[i], R[i], vx*(vy/g));
//				åï¼birdåå°æé«ç¹&#26102;ä¸&#27599;ä¸ªéç¢ç©çä¸ä¸ççç¸&#23545;ä½ç½®ï¼ï¼ï¼
				int yH = cmp(B[i], T[i], calc(vy, vy/g));
				
//				System.out.println(yL+" "+yR+" "+xH+" "+yH);
				if(yL* yR <= 0) ok = false;
				if(xH == 0 & yH >= 0 & yL < 0) ok = false;
			}
			if(ok) return true;
		}		
		return false;
	}	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		V = s.nextInt();
		X = s.nextInt();
		Y = s.nextInt();
		
		L = new int[N];
		B = new int[N];
		R = new int[N];
		T = new int[N];
		
		for(int i = 0; i < N; i ++){
			L[i] = s.nextInt();
			B[i] = s.nextInt();
			R[i] = s.nextInt();
			T[i] = s.nextInt();
			if(R[i] > X) R[i] = X;
		}
		
		boolean ok = check(X,Y);
		for(int i = 0; i < N; i++){
			ok |= check(L[i], T[i]);
			ok |= check(R[i], T[i]);
		}
		
		if(ok)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
```

@@ Response
```python
import math

N, V, X, Y = map(int, input().split())
L, B, R, T = [], [], [], []
g = 9.8
EPS = 1e-6

def calc(vy, t):
    return vy*t - g*t*t/2

def cmp(lb, ub, a):
    return -1 if a < lb+EPS else 1 if a > ub-EPS else 0

def check(qx, qy):
    a = g*g/4
    b = g*qy - V*V
    c = qx*qx + qy*qy
    D = b*b - 4*a*c
    if D < 0: D = 0
    if D < 0: return False

    for d in [-
