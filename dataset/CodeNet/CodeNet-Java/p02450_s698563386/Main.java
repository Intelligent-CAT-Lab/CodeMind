import java.util.*;

public class Main {
    static TreeSet<Integer> all = new TreeSet<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextLine().charAt(0) - '0';
		int[] base = new int[n];
		for (int i = 0; i < n; i++) {
		    base[i] = i + 1;
		}
		make(0, 0, base, n);
		StringBuilder sb = new StringBuilder();
		for (int x : all) {
		    sb.append(toString(x, n)).append("\n");
		}
		System.out.print(sb);
	}
	
	static void make(int value, int mask, int[] base, int size) {
	    if (mask == (1 << size) - 1) {
	        all.add(value);
	        return;
	    }
	    value *= 10;
	    for (int i = 0; i < size; i++) {
	        if ((mask & (1 << i)) != 0) {
	            continue;
	        }
	        make(value + base[i], mask | (1 << i), base, size);
	    }
	}
	
	static char[] toString(int x, int size) {
	    char[] ans = new char[size * 2 - 1];
	    Arrays.fill(ans, ' ');
	    int idx = ans.length - 1;
	    for (int i = 0; i < size; i++) {
	        ans[idx] = (char)(x % 10 + '0');
	        x /= 10;
	        idx -= 2;
	    }
	    return ans;
	}
}

