import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
System.out.println("[INST]11;n;Integer.parseInt(br.readLine());"+n);
System.out.println("[INST]11;None;br.readLine();"+br.readLine());
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
			ansList.add(new ArrayList<Integer>(k - 1));
System.out.println("[INST]42;None;ansList.add(new ArrayList<Integer>(k - 1));"+ansList.add(new ArrayList<Integer>(k - 1)));
			target[i] = i;
		}
		combination(target, 2, new ArrayList<Integer>());

		System.out.println(k);
		for (int i = 0; i < k; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(k - 1).append(' ');
System.out.println("[INST]50;None;sb.append(k - 1).append(' ');"+sb.append(k - 1).append(' '));
System.out.println("[INST]50;None;sb.append(k - 1);"+sb.append(k - 1));
			List<Integer> list = ansList.get(i);
System.out.println("[INST]51;list;ansList.get(i);"+list);
			for (int j : list) {
				sb.append(j).append(' ');
System.out.println("[INST]53;None;sb.append(j).append(' ');"+sb.append(j).append(' '));
System.out.println("[INST]53;None;sb.append(j);"+sb.append(j));
			}
			sb.deleteCharAt(sb.length() - 1);
System.out.println("[INST]55;None;sb.deleteCharAt(sb.length() - 1);"+sb.deleteCharAt(sb.length() - 1));
System.out.println("[INST]55;None;sb.length();"+sb.length());
			System.out.println(sb.toString());
		}
	}

	static void combination(int[] target, int k, List<Integer> list) {
		if (list.size() == k) {
System.out.println("[INST]61;None;list.size();"+list.size());
			v++;
			for (int i : list) {
				ansList.get(i).add(v);
System.out.println("[INST]64;None;ansList.get(i).add(v);"+ansList.get(i).add(v));
System.out.println("[INST]64;None;ansList.get(i);"+ansList.get(i));
			}
			return;
		}

		int i = 0;
		if (!list.isEmpty()) {
System.out.println("[INST]70;None;list.isEmpty();"+list.isEmpty());
			i = list.get(list.size() - 1) + 1;
System.out.println("[INST]71;None;list.get(list.size() - 1);"+list.get(list.size() - 1));
System.out.println("[INST]71;None;list.size();"+list.size());
			if (list.size() + target.length - i < k) {
System.out.println("[INST]72;None;list.size();"+list.size());
				return;
			}
		}
		for ( ; i < target.length; i++) {
			list.add(i);
System.out.println("[INST]77;None;list.add(i);"+list.add(i));
			combination(target, k, list);
			list.remove(list.size() - 1);
System.out.println("[INST]79;None;list.remove(list.size() - 1);"+list.remove(list.size() - 1));
System.out.println("[INST]79;None;list.size();"+list.size());
		}
	}
}
