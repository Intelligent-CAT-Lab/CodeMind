import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int C = Integer.parseInt(tokens[2]);
		int X = Integer.parseInt(tokens[3]);
		int Y = Integer.parseInt(tokens[4]);
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
		System.out.println(Math.min(Math.min(resultA, resultB), resultC));

		in.close();
	}
}