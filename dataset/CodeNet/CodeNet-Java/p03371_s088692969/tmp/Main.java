import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
System.out.println("[INST]5;tokens;in.nextLine().split(' ');"+tokens);
System.out.println("[INST]5;None;in.nextLine();"+in.nextLine());
		int A = Integer.parseInt(tokens[0]);
System.out.println("[INST]6;A;Integer.parseInt(tokens[0]);"+A);
		int B = Integer.parseInt(tokens[1]);
System.out.println("[INST]7;B;Integer.parseInt(tokens[1]);"+B);
		int C = Integer.parseInt(tokens[2]);
System.out.println("[INST]8;C;Integer.parseInt(tokens[2]);"+C);
		int X = Integer.parseInt(tokens[3]);
System.out.println("[INST]9;X;Integer.parseInt(tokens[3]);"+X);
		int Y = Integer.parseInt(tokens[4]);
System.out.println("[INST]10;Y;Integer.parseInt(tokens[4]);"+Y);
		// 個別にそろえる方法とABを活用する方法双方を計算して，小さいほうを出力する
		int resultA = X * A + Y * B;
		int resultB = 0;
		if (X > Y) {
			// ABをY個買ってAをX-Y個買う
			resultB = (X - Y) * A + Y * C * 2;
		} else {
			resultB = X * C * 2 + (Y - X) * B;
		}
		int resultC = C * (Math.max(X, Y)) * 2;
System.out.println("[INST]20;None;Math.max(X, Y);"+Math.max(X, Y));
		System.out.println(Math.min(Math.min(resultA, resultB), resultC));

		in.close();
	}
}