import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] n = sc.next().toCharArray();
System.out.println("[INST]10;n;sc.next().toCharArray();"+n);
System.out.println("[INST]10;None;sc.next();"+sc.next());
		sc.close();
		out.println(n[0]==n[2]?"Yes":"No");
	}
}
