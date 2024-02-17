import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List <Long> unko=new ArrayList<Long>();
		int N=sc.nextInt();
		long M=sc.nextLong();
		fra(M,unko);
		long[][] map=new long[65][2];

		for(int i=0; i<65; i++) {
			for(int j=0; j<2; j++) {
				map[i][j]=0;
			}
		}
		int counter=0;
		boolean zumi=false;
		while(unko.size()>0) {
			long a=unko.get(0);
			unko.remove(0);
			zumi=false;
			for(int i=0; i<=counter; i++) {
				if(a==map[i][0] && a!=1) {
					map[i][1]++;
					zumi=true;
					break;
				}
			}
			if(a!=1 && zumi==false) {
				map[counter][0]=a;
				map[counter][1]++;
				counter++;
			}
			else if(a==1) {
				//
			}
		}

		for(int i=0; i<counter; i++) {
			//System.out.println(map[i][0]+" cntr="+counter);
		}
		long ans=1;

		for(int i=0; i<=counter; i++) {
			long cmb=Combi(map[i][1]+N-1,N-1)%1000000007;
			ans=(ans*cmb)%1000000007;
		}
		System.out.println(ans);
	}


	public static void fra(long a,List<Long> p) {//long型用
		for(long i=2; i*i<=a; i++) {
			if(a%i==0) {
				p.add(i);
				fra(a/i,p);
				return;
			}
		}
		p.add(a);
	}


	public static long Combi(long n,long r) {		// nCr
		if(r==0 || r==n) return 1L;

		if(r>n-r) {
			r=n-r;
		}

		long[] bunsi=new long[(int)r];
		long[] bunbo=new long[(int)r];

		for(int k=0; k<r; k++) {
			bunsi[k]=n-r+k+1;
			bunbo[k]=k+1;
		}

		for(long p=2; p<=r; p++) {
			long pivot=bunbo[(int)p-1];
			if(pivot>1) {
				long offset=(n-r)%p;
				for(long k=p-1; k<r; k+=p) {
					bunsi[(int)(k-offset)]/=pivot;
					bunbo[(int)k]/=pivot;
				}
			}
		}

		long kotae=1;

		for(long k=0; k<r; k++) {
			if(bunsi[(int)k]>1) {
				kotae*=bunsi[(int)k];
				kotae=kotae%1000000007;
			}
		}

		return kotae;
	}
}
