import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = (int)Math.sqrt(N);
		List<Integer> plist = new ArrayList<>();
		for(int i = 1; i <= n; i++){
		    if(N % i == 0){
		        plist.add(i);
		        if(i!= N/i){
		            plist.add(N/i);
		        }
		    }
		}
		int ans = 0;
		for(int i = 0; i < plist.size(); i++){
		    int x = plist.get(i);
		    int kari = N/x - 1;
		    if(kari == 0){
		        continue;
		    }
		    int q = N/kari;
		    int r = N%kari;
		    if(q == r){
		        ans += kari;
		    }
		}
		System.out.println(ans);
	}
}