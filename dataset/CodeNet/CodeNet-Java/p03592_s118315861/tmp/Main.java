import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		int M = nextInt();
		int K = nextInt();

		int[][] b = new int[N][M];
		for(int i=0;i<b.length;i++){
			Arrays.fill(b[i], 1);
System.out.println("[INST]18;None;Arrays.fill(b[i], 1);"+Arrays.fill(b[i], 1));
		}

		for(int i=0;i<=N;i++){
			for(int k=0;k<=M;k++){
				if(K==(M*i+N*k-2*i*k)){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");

	}


	public static String[] toStringArray(String s) {
		String[] tmp = new String[s.length()];
System.out.println("[INST]35;None;s.length();"+s.length());
		char[] c = s.toCharArray();
System.out.println("[INST]36;c;s.toCharArray();"+c);
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = String.valueOf(c[i]);
System.out.println("[INST]38;None;String.valueOf(c[i]);"+String.valueOf(c[i]));
		}
		return tmp;
	}

	public static String concatStringArray(String[] s){
		StringBuffer sb = new StringBuffer();
		for(String x:s){
			sb.append(x);
System.out.println("[INST]46;None;sb.append(x);"+sb.append(x));
		}
		return sb.toString();
System.out.println("[INST]48;None;sb.toString();"+sb.toString());
	}

	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
System.out.println("[INST]56;Ws;in.readLine().split(' ');"+Ws);
System.out.println("[INST]56;None;in.readLine();"+in.readLine());
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
System.out.println("[INST]62;None;Integer.parseInt(Ws[wsIndx++]);"+Integer.parseInt(Ws[wsIndx++]));
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
System.out.println("[INST]67;None;Long.parseLong(Ws[wsIndx++]);"+Long.parseLong(Ws[wsIndx++]));
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
System.out.println("[INST]79;None;Integer.parseInt(Ws[i]);"+Integer.parseInt(Ws[i]));
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
System.out.println("[INST]89;None;Long.parseLong(Ws[i]);"+Long.parseLong(Ws[i]));
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}


}