import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		if(H%3==0 || W%3==0){
			System.out.println(0);
			return;
		}
		
		int h1 = H/2;
		int h2;
		if( H%2==0 ){
			h2 = h1;
		}else{
			h2 = h1+1;
		}
		int w1 = W/2;
		int w2;
		if( W%2==0 ){
			w2 = w1;
		}else{
			w2 = w1+1;
		}
		
		
		long a1 = W/3;
		if(a1==0)a1++;
		long a2 = (W-a1)*h1;
		long a3 = (W-a1)*h2;
		long cur = Math.max(a1*H,Math.max(a2, a3)) - Math.min(a1*H, Math.min(a2,a3));
		a1++;
		if(a1 < W){
			a2 = (W-a1)*h1;
			a3 = (W-a1)*h2;
			cur = Math.min(cur, Math.max(a1*H,Math.max(a2, a3)) - Math.min(a1*H, Math.min(a2,a3)));
		}
		
		a1 = H/3;
		if(a1==0)a1++;
		a2 = (H-a1)*w1;
		a3 = (H-a1)*w2;
		cur = Math.min(cur, Math.max(a1*W,Math.max(a2, a3)) - Math.min(a1*W, Math.min(a2,a3)));
		a1++;
		if(a1 < H){
			a2 = (H-a1)*w1;
			a3 = (H-a1)*w2;
			cur = Math.min(cur, Math.max(a1*W,Math.max(a2, a3)) - Math.min(a1*W, Math.min(a2,a3)));
		}
		
		cur = Math.min(cur, Math.min(H, W));
		System.out.println(cur);
		return;
	}
}