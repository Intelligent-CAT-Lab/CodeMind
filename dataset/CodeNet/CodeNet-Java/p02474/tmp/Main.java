import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input[] = br.readLine().split("\\s+");
System.out.println("[INST]15;input;br.readLine().split('\\s+');"+input);
System.out.println("[INST]15;None;br.readLine();"+br.readLine());

			BigInteger A = new BigInteger(input[0]);
			BigInteger B = new BigInteger(input[1]);

			BigInteger ans;

			ans = A.multiply(B);
System.out.println("[INST]22;ans;A.multiply(B);"+ans);
			System.out.println(ans);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}


