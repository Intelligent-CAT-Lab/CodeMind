import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
System.out.println("[INST]12;n;parseInt(sc.next());"+n);
System.out.println("[INST]12;None;sc.next();"+sc.next());
		int r = parseInt(sc.next());
System.out.println("[INST]13;r;parseInt(sc.next());"+r);
System.out.println("[INST]13;None;sc.next();"+sc.next());
		sc.close();
		int na = n>=10?r:100*(10-n)+r;
		out.println(na);
	}
}
