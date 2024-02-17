import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int K = Integer.valueOf(s.next());
		if(K%2==0) {
			System.out.println(-1);
			return;
		}
		
		int cur = 7;
		int cnt = 1;
		for(int i = 0; i < 100000000; i++) {
			if(cur % K == 0) {
				System.out.println(cnt);
				return;
			}else {
				cur = (cur * 10 + 7) % K;
				cnt++;
			}
		}
		System.out.println(-1);
	}
}