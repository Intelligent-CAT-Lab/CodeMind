import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class p03769 {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		long n = nl();
		List<Integer> perm = permutationWhoseNumberOfIncreasingSequenceIsK(n);
		out.println(perm.size()*2);
		for(int i = 1;i <= perm.size();i++){
			if(i > 1)out.print(" ");
			out.print(i);
		}
		for(int i = 0;i < perm.size();i++){
			out.print(" ");
			out.print(perm.get(i)+1);
		}
		out.println();
	}
	
	public static List<Integer> permutationWhoseNumberOfIncreasingSequenceIsK(long K)
	{
		long cur = Long.highestOneBit(K+1)-1;
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i < Long.bitCount(cur);i++){
			list.add(i);
		}
		int p = Long.bitCount(cur);
		for(int d = Long.bitCount(cur)-1;d >= 0;d--){
			long x = 1L<<d;
			if(cur + x <= K){
				cur += x;
				list.add(d, p++);
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		long G = System.