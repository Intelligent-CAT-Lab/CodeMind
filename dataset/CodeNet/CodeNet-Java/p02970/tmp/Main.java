import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
System.out.println("[INST]8;N;Integer.parseInt(sc.next());"+N);
System.out.println("[INST]8;None;sc.next();"+sc.next());
		final int D = Integer.parseInt(sc.next());
System.out.println("[INST]9;D;Integer.parseInt(sc.next());"+D);
System.out.println("[INST]9;None;sc.next();"+sc.next());

		BigDecimal ans = BigDecimal.valueOf(N / (D * 2 + 1.0));
System.out.println("[INST]11;ans;BigDecimal.valueOf(N / (D * 2 + 1.0));"+ans);
		ans =  ans.setScale(0, RoundingMode.CEILING);
System.out.println("[INST]12;ans;ans.setScale(0, RoundingMode.CEILING);"+ans);
		System.out.println(ans);


	}

}
