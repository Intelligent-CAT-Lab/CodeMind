import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long mod = (long)(Math.pow(10, 9)+7);
		int n  = sc.nextInt();

		long sosu[] = new long[n+1];

		for(int i = 2;i <= n;i++){
			int j = i;
			while(j > 1){
				for(int k = 2;k <= j;k++){
					if(j%k == 0){
						//System.out.println("i:"+i+" j:"+j);
						sosu[k]++;
						j /= k;
						break;
					}
				}
			}
		}
		long answer = 1;
		for(int i = 2;i < sosu.length;i++){
			if(sosu[i] > 0)answer = (answer*(sosu[i]+1))%mod;
		}

		System.out.println(answer);
	}
}
