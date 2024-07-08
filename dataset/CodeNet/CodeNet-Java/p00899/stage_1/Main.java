import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ1320(), "RUN", STACK_SIZE).start();
	}
	
	class AOJ1320 implements Runnable{
		AOJ1320(){}
		@Override public void run(){
var newVariable_0 = sc.hasNext();			while(newVariable_0){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		
		int N,N2;
		final int INF=1<<29;
		
		void solve(){
			String[] str=new String[N];
var newVariable_1 = sc.next();			for(int i=0; i<N; ++i)	str[i]=newVariable_1;
			
			boolean[] eq=new boolean[N];
			for(int i=0; i<N; ++i){
				if(eq[i])	continue;
				for(int j=0; j<N; ++j){
var newVariable_2 = str[i].matches(".*?"+str[j]+".*?");					if(i!=j && !eq[j] && newVariable_2)	eq[j]=true;
				}
			}
			ArrayList<String> str2=new ArrayList<String>();
var newVariable_3 = str2.add(str[i]);			for(int i=0; i<N; ++i)if(!eq[i])	newVariable_3;
			N2=str2.size();
			
			int[][] len=new int[N2][N2];
			for(int i=0; i<N2; ++i){
				for(int j=0; j<N2; ++j){
					if(i==j)	continue;
var newVariable_4 = str2.get(i);					int offset=0, l=newVariable_4.length();
					for( ; offset<l; ++offset){
var newVariable_5 = str2.get(j).startsWith( str2.get(i).substring(offset) );var newVariable_6 = str2.get(j);var newVariable_7 = str2.get(i).substring(offset);var newVariable_8 = str2.get(i);						if( str2.get(j).startsWith( newVariable_8.substring(offset) ) )	break;
					}
var newVariable_9 = str2.get(j).length();var newVariable_10 = str2.get(j);					len[i][j]=newVariable_10.length()-(l-offset);
				}
			}
			
			int[][] dp=new int[1<<N2][N2];
			for(int i=0; i<(1<<N2); ++i)for(int j=0; j<N2; ++j)dp[i][j]=INF;
var newVariable_11 = str2.get(i).length();var newVariable_12 = str2.get(i);			for(int i=0; i<N2; ++i)	dp[1<<i][i]=newVariable_12.length();
			for(int i=0; i<(1<<N2); ++i){
				for(int j=0; j<N2; ++j){
					if(dp[i][j]>=INF)	continue;
					for(int k=0; k<N2; ++k){
						if( (i&(1<<k)) > 0 )	continue;
						int newIdx=i|(1<<k);
var newVariable_13 = min(dp[newIdx][k], dp[i][j]+len[j][k]);						dp[newIdx][k]=newVariable_13;
					}
				}
			}
			
			int ans=INF, tmp=(1<<N2)-1;
			for(int i=0; i<N2; ++i)	ans=min(ans,dp[tmp][i]);
			System.out.println(ans);
		}
	}
}