//package atcoder028D;
import java.util.stream.*;
import java.util.function.Supplier;
import java.util.function.BiFunction;
import java.util.*;
interface Computations{
	final int MOD = 1000000007;
	final BiFunction <Integer, Integer, Integer> Add = (x, y) ->  (x + y) >= MOD ? (x + y - MOD) : (x + y);
	final BiFunction <Integer, Integer, Integer> Mul = (x, y) -> (int)(((1L * x * y) % MOD));
	final BiFunction<Integer, Integer, Integer> Sub = (x, y) -> (x - y) < 0 ? (x - y + MOD) : (x - y);
	default Integer operate(Integer x, Integer y, BiFunction <Integer, Integer, Integer> op) {
		return op.apply(x, y);
System.out.println("[INST]11;None;op.apply(x, y);"+op.apply(x, y));
	}
}
class PartialCompute implements Computations{
	private List <Integer> Partial; 
	PartialCompute(int sz){
		Partial = new ArrayList<Integer>();
		for(int i = 1; i <= sz; i++)
			Partial.add(0);
System.out.println("[INST]19;None;Partial.add(0);"+Partial.add(0));
	}
	public void setVal(int pos, int val) {
		Partial.set(pos, val);
System.out.println("[INST]22;None;Partial.set(pos, val);"+Partial.set(pos, val));
	}
	public void precalcPartialSum() {
		for(int i = 1; i < Partial.size(); i++) {
System.out.println("[INST]25;None;Partial.size();"+Partial.size());
			Partial.set(i, operate(Partial.get(i), Partial.get(i - 1), Add));
System.out.println("[INST]26;None;Partial.get(i);"+Partial.get(i));
System.out.println("[INST]26;None;Partial.get(i - 1);"+Partial.get(i - 1));
		}
	}
	public void precalcPartialProd() {
		Partial.set(0, 1);
System.out.println("[INST]30;None;Partial.set(0, 1);"+Partial.set(0, 1));
		for(int i = 2; i < Partial.size(); i++) {
System.out.println("[INST]31;None;Partial.size();"+Partial.size());
			Partial.set(i, i - 1);
System.out.println("[INST]32;None;Partial.set(i, i - 1);"+Partial.set(i, i - 1));
			Partial.set(i, operate(Partial.get(i), Partial.get(i - 2), Mul));
System.out.println("[INST]33;None;Partial.get(i);"+Partial.get(i));
System.out.println("[INST]33;None;Partial.get(i - 2);"+Partial.get(i - 2));
		}
	}
	public int getSum(int a, int b) {
		return operate(Partial.get(b), Partial.get(a - 1), Sub);
System.out.println("[INST]37;None;Partial.get(b);"+Partial.get(b));
System.out.println("[INST]37;None;Partial.get(a - 1);"+Partial.get(a - 1));
	}
	public int getProd(int pos) {
		return Partial.get(pos);
System.out.println("[INST]40;None;Partial.get(pos);"+Partial.get(pos));
	}
}
public class Main implements Computations{
	int N, K;
	PartialCompute Psum;
	PartialCompute Pprod;
	PartialCompute Prand;
	int[][] DP;
	int ans;
	Main() {
		Psum = new PartialCompute(1205);
		Pprod = new PartialCompute(1205);
		Prand = new PartialCompute(1205);
		DP = new int[1205][1205];
		ans = 0;
	}
	private void setP(int x, int y,int r) {
		Psum.setVal(x, 0);
		Psum.setVal(y, 0);
		Psum.setVal(x + N * 2 , 0);
		Psum.setVal(y + N * 2, 0);
		Prand.setVal(x, r);
		Prand.setVal(x + 2 * N, r);
		Prand.setVal(y, MOD - r);
		Prand.setVal(y + 2 * N, MOD - r);
	}
	private void Read() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
System.out.println("[INST]69;N;in.nextInt();"+N);
		K = in.nextInt();
System.out.println("[INST]70;K;in.nextInt();"+K);
		for(int i = 1; i <= 4 * N; i++) {
			Psum.setVal(i, 1);
		}
		Random rnd = new Random();
		for(int i = 1; i <= K; i++) {
			int x = in.nextInt(), y = in.nextInt();
System.out.println("[INST]76;x;in.nextInt();"+x);
System.out.println("[INST]76;y;in.nextInt();"+y);
			int r = rnd.nextInt(MOD);
System.out.println("[INST]77;r;rnd.nextInt(MOD);"+r);
			setP(x, y, r);
		}
		in.close();
	}
	private void precalcP() {
		Psum.precalcPartialSum();
		Pprod.precalcPartialProd();
		Prand.precalcPartialSum();
	}
	private void UpdatePartialCircle(int i, int j) {
		for(int k = j - 1; k > i; k--) {
			int aux = Pprod.getProd(Psum.getSum(k + 1, j));
			aux = operate(DP[i][k], aux, Mul);
			DP[i][j] = operate(DP[i][j], aux, Sub);
		}
	}
	private void UpdateFullCircle(int i, int j) {
		for(int k = 2; k < 2 * N + 1; k++) {
			for(int l = 2 * N; l - k < 2 * N - 1; l++) {
				int sum = Psum.getSum(k, l);
				int p2 = Pprod.getProd(N * 2 - 2 * K - sum);
				int aux = operate(DP[k][l], p2, Mul);
				DP[i][j] = operate(DP[i][j], aux, Sub);
			}
			
		}
	}
	private void solveDP() {
		for(int dist = 1; dist < N * 2; dist += 2) {
			for(int i = 1; i <= N * 2; i++) {
				int j = i + dist;
				if(Prand.getSum(i, j) != 0)
					continue;
				int sum = Psum.getSum(i, j);
				int p = Pprod.getProd(N * 2 - 2 * K - sum);
				DP[i][j] = Pprod.getProd(sum);
				if(dist != 2 * N - 1) {
					UpdatePartialCircle(i, j);
				}
				
				if(dist == N * 2 - 1) {
					UpdateFullCircle(i, j);
				}
				ans = operate(ans, operate(DP[i][j], p, Mul), Add);
				if(dist == N * 2 - 1 && i == 1)
					return;
			}
		}
	}
	public static void main(String args[]) {
		Main instance = new Main();
		instance.Read();
		instance.precalcP();
		instance.solveDP();
		System.out.println(instance.ans);
	}
}
