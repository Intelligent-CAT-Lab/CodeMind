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
var newVariable_0 = s.length();		String[] tmp = new String[newVariable_0];
		char[] c = s.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
var newVariable_1 = String.valueOf(c[i]);			tmp[i] = newVariable_1;
		}
		return tmp;
	}

	public static String concatStringArray(String[] s){
		StringBuffer sb = new StringBuffer();
		for(String x:s){
var newVariable_2 = sb.append(x);		}
var newVariable_3 = sb.toString();		return newVariable_3;
	}

	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
var newVariable_4 = in.readLine();			Ws = newVariable_4.split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
var newVariable_5 = Integer.parseInt(Ws[wsIndx++]);		return newVariable_5;
	}

	public static long nextLong()throws Exception{
		check();
var newVariable_6 = Long.parseLong(Ws[wsIndx++]);		return newVariable_6;
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
var newVariable_7 = Integer.parseInt(Ws[i]);			tmp[i]=newVariable_7;
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
var newVariable_8 = Long.parseLong(Ws[i]);			tmp[i]=newVariable_8;
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