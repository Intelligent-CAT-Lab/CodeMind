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
System.out.println("[INST]9;None;new Thread(null, new AOJ1320(), 'RUN', STACK_SIZE).start();"+new Thread(null, new AOJ1320(), "RUN", STACK_SIZE).start());
	}
	
	class AOJ1320 implements Runnable{
		AOJ1320(){}
		@Override public void run(){
			while(sc.hasNext()){
System.out.println("[INST]15;None;sc.hasNext();"+sc.hasNext());
				N=sc.nextInt();
System.out.println("[INST]16;N;sc.nextInt();"+N);
				if(N==0)	break;
				solve();
			}
		}
		
		int N,N2;
		final int INF=1<<29;
		
		void solve(){
			String[] str=new String[N];
			for(int i=0; i<N; ++i)	str[i]=sc.next();
System.out.println("[INST]27;None;sc.next();"+sc.next());
			
			boolean[] eq=new boolean[N];
			for(int i=0; i<N; ++i){
				if(eq[i])	continue;
				for(int j=0; j<N; ++j){
					if(i!=j && !eq[j] && str[i].matches(".*?"+str[j]+".*?"))	eq[j]=true;
System.out.println("[INST]33;None;str[i].matches('.*?'+str[j]+'.*?');"+str[i].matches(".*?"+str[j]+".*?"));
				}
			}
			ArrayList<String> str2=new ArrayList<String>();
			for(int i=0; i<N; ++i)if(!eq[i])	str2.add(str[i]);
System.out.println("[INST]37;None;str2.add(str[i]);"+str2.add(str[i]));
			N2=str2.size();
System.out.println("[INST]38;N2;str2.size();"+N2);
			
			int[][] len=new int[N2][N2];
			for(int i=0; i<N2; ++i){
				for(int j=0; j<N2; ++j){
					if(i==j)	continue;
					int offset=0, l=str2.get(i).length();
System.out.println("[INST]44;l;str2.get(i).length();"+l);
System.out.println("[INST]44;None;str2.get(i);"+str2.get(i));
					for( ; offset<l; ++offset){
						if( str2.get(j).startsWith( str2.get(i).substring(offset) ) )	break;
System.out.println("[INST]46;None;str2.get(j).startsWith( str2.get(i).substring(offset) );"+str2.get(j).startsWith( str2.get(i).substring(offset) ));
System.out.println("[INST]46;None;str2.get(j);"+str2.get(j));
System.out.println("[INST]46;None;str2.get(i).substring(offset);"+str2.get(i).substring(offset));
System.out.println("[INST]46;None;str2.get(i);"+str2.get(i));
					}
					len[i][j]=str2.get(j).length()-(l-offset);
System.out.println("[INST]48;None;str2.get(j).length();"+str2.get(j).length());
System.out.println("[INST]48;None;str2.get(j);"+str2.get(j));
				}
			}
			
			int[][] dp=new int[1<<N2][N2];
			for(int i=0; i<(1<<N2); ++i)for(int j=0; j<N2; ++j)dp[i][j]=INF;
			for(int i=0; i<N2; ++i)	dp[1<<i][i]=str2.get(i).length();
System.out.println("[INST]54;None;str2.get(i).length();"+str2.get(i).length());
System.out.println("[INST]54;None;str2.get(i);"+str2.get(i));
			for(int i=0; i<(1<<N2); ++i){
				for(int j=0; j<N2; ++j){
					if(dp[i][j]>=INF)	continue;
					for(int k=0; k<N2; ++k){
						if( (i&(1<<k)) > 0 )	continue;
						int newIdx=i|(1<<k);
						dp[newIdx][k]=min(dp[newIdx][k], dp[i][j]+len[j][k]);
System.out.println("[INST]61;None;min(dp[newIdx][k], dp[i][j]+len[j][k]);"+min(dp[newIdx][k], dp[i][j]+len[j][k]));
					}
				}
			}
			
			int ans=INF, tmp=(1<<N2)-1;
			for(int i=0; i<N2; ++i)	ans=min(ans,dp[tmp][i]);
System.out.println("[INST]67;ans;min(ans,dp[tmp][i]);"+ans);
			System.out.println(ans);
		}
	}
}