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
var newVariable_0 = sc.next();		int n = parseInt(newVariable_0);
var newVariable_1 = sc.next();		int r = parseInt(newVariable_1);
		sc.close();
		int na = n>=10?r:100*(10-n)+r;
		out.println(na);
	}
}
