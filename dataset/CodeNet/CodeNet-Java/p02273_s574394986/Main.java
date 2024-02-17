import java.util.Scanner;

public class Main {
	
	static class P{
		double x, y;
		P(double x, double y){
			this.x=x;
			this.y=y;
		}
	}
	
	static void kock(int n, P p1, P p2) {
		if(n==0) return;
		P s=new P(0.0, 0.0);
		P t=new P(0.0, 0.0);
		P u=new P(0.0, 0.0);
		s.x=(2.0*p1.x+p2.x)/3.0;
		s.y=(2.0*p1.y+p2.y)/3.0;
		t.x=(p1.x+2.0*p2.x)/3.0;
		t.y=(p1.y+2.0*p2.y)/3.0;
		u.x=(t.x-s.x)/2.0 - (t.y-s.y)*Math.sqrt(3.0)/2.0+s.x;
		u.y=(t.x-s.x)*Math.sqrt(3.0)/2.0 + (t.y-s.y)/2.0+s.y;
		
		kock(n-1, p1, s);
		System.out.println(s.x+" "+s.y);
		kock(n-1, s, u);
		System.out.println(u.x+" "+u.y);
		kock(n-1, u, t);
		System.out.println(t.x+" "+t.y);
		kock(n-1, t, p2);
		
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			System.out.println(0.000000+" "+0.0000000);
			kock(n, new P(0.0, 0.0), new P(100.0, 0.0));
			System.out.println(100.000000+" "+0.000000);
		}
	}
}
