import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();		int n = Integer.parseInt(newVariable_0);
		br.close();

		if (n == 1) {
			System.out.println("Yes");
			System.out.println(2);
			System.out.println("1 1");
			System.out.println("1 1");
			return;
		}
		if (n == 2) {
			System.out.println("No");
			return;
		}

		int k = 0;
		for (int i = 3; i <= n; i++) {
			int ic2 = i * (i - 1) / 2;
			if (ic2 == n) {
				k = i;
				break;
			} else if (ic2 > n) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

		ansList = new ArrayList<List<Integer>>(k);
		int[] target = new int[k];
		for (int i = 0; i < k; i++) {
var newVariable_1 = ansList.add(new ArrayList<Integer>(k - 1));			target[i] = i;
		}
		combination(target, 2, new ArrayList<Integer>());

		System.out.println(k);
		for (int i = 0; i < k; i++) {
			StringBuilder sb = new StringBuilder();
var newVariable_2 = sb.append(k - 1).append(' ');var newVariable_3 = sb.append(k - 1);			newVariable_3.append(' ');
			List<Integer> list = ansList.get(i);
			for (int j : list) {
var newVariable_4 = sb.append(j).append(' ');var newVariable_5 = sb.append(j);				newVariable_5.append(' ');
			}
var newVariable_6 = sb.deleteCharAt(sb.length() - 1);var newVariable_7 = sb.length();			sb.deleteCharAt(newVariable_7 - 1);
			System.out.println(sb.toString());
		}
	}

	static void combination(int[] target, int k, List<Integer> list) {
var newVariable_8 = list.size();		if (newVariable_8 == k) {
			v++;
			for (int i : list) {
var newVariable_9 = ansList.get(i).add(v);var newVariable_10 = ansList.get(i);				newVariable_10.add(v);
			}
			return;
		}

		int i = 0;
var newVariable_11 = list.isEmpty();		if (!newVariable_11) {
var newVariable_12 = list.get(list.size() - 1);var newVariable_13 = list.size();			i = list.get(newVariable_13 - 1) + 1;
var newVariable_14 = list.size();			if (newVariable_14 + target.length - i < k) {
				return;
			}
		}
		for ( ; i < target.length; i++) {
var newVariable_15 = list.add(i);			combination(target, k, list);
var newVariable_16 = list.remove(list.size() - 1);var newVariable_17 = list.size();			list.remove(newVariable_17 - 1);
		}
	}
}
