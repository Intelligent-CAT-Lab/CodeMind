import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class p03704 {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		long D = nl();
		long ans = 0;
		for(int len = Long.toString(D).length();len <= 18;len++){
			long res = dfs(D, 0, len);
			ans += res;
		}
		out.println(ans);
	}
	
	static long dfs(long rem, int pos, int len)
	{
		if(len-pos-1 < pos){
			return rem == 0? 1L : 0L;
		}
		if(pos == len-1-pos){
			return rem == 0? 10L : 0L;
		}
		
		long d = 1;
		for(int i = 1;i <= len-pos-1;i++){
			d *= 10;
		}
		long dm = 1;
		for(int i = 1;i <= pos;i++){
			dm *= 10;
		}
		d -= dm;
		if(Math.abs(rem) >= 10L*d)return 0;
		long ret = 0;
		for(int i = -9;i <= 9;i++){
			if(pos == 0 && i >= 0){
				ret += dfs(rem-d*i, pos+1, len) * (9-Math.abs(i));
			}else{
				ret += dfs(rem-d*i, pos+1,