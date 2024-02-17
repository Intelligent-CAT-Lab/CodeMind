import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long n = sc.nextLong();
		
		for(long i = 1 ;i*i <= n;i++){
			if(i*i == n){
				System.out.println((i-1)*2);
				return;
			}
		}
		for(long i = (long)Math.sqrt(n);i >= 1;i--){
			if(n%i == 0){
				System.out.println(i-1+(n/i)-1);
				break;
			}
		}
		


	}
	
//	static void dfs(int y,int x,int num,int count){
//		if((y+1)*(x+1) > num){
//			return;
//		}
//		if((y + 1)*(x+1) == num){
//			ans = Math.min(ans, count);
//			return;
//		}
//		
//		if(y + 1 <= )
//		dfs(y+1, x, num, count);
//		
//	}

	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}








}




