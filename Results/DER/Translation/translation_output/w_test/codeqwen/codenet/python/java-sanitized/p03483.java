import java.util.*;

class Bit {
    int size;
    int[] tree;

    Bit(int n) {
        this.size = n;
        this.tree = new int[n + 1];
    }

    int sum(int i) {
        int s = 0;
        while (i > 0) {
            s += tree[i];
            i -= i & -i;
        }
        return s;
    }

    void add(int i, int x) {
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class p03483 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        Map<Character, Integer> c = new HashMap<>();
        for (char si : s.toCharArray()) {
            c.put(si, c.getOrDefault(si, 0) + 1);
        }
        boolean flg = false;
        if (n % 2 == 0) {
            for (int i : c.values()) {
                if (i % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : c.entrySet()) {
                if (entry.getValue() % 2 != 0 && flg) {
                    System.out.println(-1);
                    return;
                } else if (entry.getValue() % 2 != 0) {
                    flg = true;
                }
            }
        }
        int ans = 0;
        List<Character> fstr = new ArrayList<>();
        List<Character> lstr = new ArrayList<>();
        Map<Character, Integer> dc = new HashMap<>();
        int ptr = 0;
        for