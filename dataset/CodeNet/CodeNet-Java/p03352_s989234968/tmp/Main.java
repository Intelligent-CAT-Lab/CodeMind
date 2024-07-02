import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int x = parseInt(sc.next());
System.out.println("[INST]11;x;parseInt(sc.next());"+x);
System.out.println("[INST]11;None;sc.next();"+sc.next());
		sc.close();
		int mx = 0;
		if(x<4) {
			mx=1;
		} else {
			int sq = (int) floor(sqrt(x));
System.out.println("[INST]17;None;floor(sqrt(x));"+floor(sqrt(x)));
System.out.println("[INST]17;None;sqrt(x);"+sqrt(x));
			int jo=0;
			for (i = 2; i <= sq; i++) {
				jo=(int)pow((double)i,floor(log10((double)x)/log10((double)i)));
System.out.println("[INST]20;None;pow((double)i,floor(log10((double)x)/log10((double)i)));"+pow((double)i,floor(log10((double)x)/log10((double)i))));
System.out.println("[INST]20;None;floor(log10((double)x)/log10((double)i));"+floor(log10((double)x)/log10((double)i)));
System.out.println("[INST]20;None;log10((double)x);"+log10((double)x));
System.out.println("[INST]20;None;log10((double)i);"+log10((double)i));
//				out.printf("%d:%f:%f:%f%n",i,log10((double)x),log10((double)i),floor(log10((double)x)/log10((double)i)));
//				out.printf("%d:%d%n",i,jo);
				if(jo>mx)mx=jo;
			}
		}
		out.println(mx);
	}
}
