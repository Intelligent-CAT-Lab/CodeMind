
import java.util.*;

public class p01425{
	static int N, V, X, Y;
	static int[] L, B, R, T;
	static double g = 9.8;
	static double EPS = 1e-6;

//	根据y&#36724;方向的初速度vy和重力g，返回t&#26102;&#38388;点&#26102;的位置y
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
//				石&#22836;在pig右&#36793;，直接&#36807;&#28388;
				if(L[i] >= X) continue;
//				当来到pig正上方&#26102;，与pig之&#38388;有没有障碍物
				if(R[i] >= X & T[i] >= Y & yt >= B[i]) ok = false;				
//				中途会不会遇到障碍
//				一共要判定4条
//				一：与&#27599;个障碍物的左&#36793;界的相&#23545;位置
				int yL = cmp(B[i], T[i], calc(vy, L[i]/vx));
//				二：与&#27599;个障碍物的右&#36793;界的相&#23545;位置
				int yR = cmp(B[i], T[i], calc(vy, R[i]/vx));
//				三：bird升到最高点&#26102;与&#27599;个障碍物的左右界的相&#23545;位置
				int xH = cmp(L[i], R[i], vx*(vy/g));
//				四：bird升到最高点&#26102;与&#27599;个障碍物的上下界的相&#23545;位置（？）
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