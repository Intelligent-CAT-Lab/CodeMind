import java.util.*;

public class p04018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        List<Character> w = new ArrayList<>();
        for (char c : word.toCharArray()) {
            w.add(c);
        }
        int n = w.size();
        int t = -1;
        
        int[] zl = Z(w);
        
        Collections.reverse(w);
        int[] zr = Z(w);
        
        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            if (zl[i] == 1 && zr[n-2-i] == 1) {
                cnt++;
            }
        }
        
        if (t == -1) {
            System.out.println("1\n1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            System.out.println("2");
            System.out.println(cnt);
        }
    }
    
    public static int[] Z(List<Character> s) {
        int m = s.size();
        int[] z = new int[m];
        int c = 0;
        int[] f = new int[m];
        Arrays.fill(f, 1);
        
        for (int i = 1; i < m; i++) {
            if (i + z[i-c] < c + z[c]) {
                z[i] = z[i-c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i+j < m && s.get(j).equals(s.get(i+j))) {
                    j++;
                }
                z[i] = j;
                c = i;
            }
        }
        
        for (int p = 1; p < m; p++) {
            for (int k = 2; k <= z[p] / p + 1; k++) {
                f[k*p - 1] = 0;
            }
        }
        
        return f;
    }
}