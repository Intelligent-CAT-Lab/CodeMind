import java.util.Scanner;
import java.util.Arrays;

public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] w = input.toCharArray();
        int n = w.length;
        int t = -1;
        
        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && input.substring(0, n-j).equals(input.substring(j))) {
                t = j;
                break;
            }
        }
        
        if (t == -1) {
            System.out.println("1");
            System.out.println("1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println("1");
        } else {
            int[] zl = Z(w);
            reverse(w);
            int[] zr = Z(w);
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (zl[i] > 0 && zr[n - 2 - i] > 0)
                    cnt++;
            }
            System.out.println("2");
            System.out.println(cnt);
        }

        sc.close();
    }
    
    public static int[] Z(char[] s) {
        int m = s.length;
        int[] z = new int[m];
        boolean[] f = new boolean[m];
        Arrays.fill(f, true);
        int c = 0;
        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < s.length && s[j] == s[i + j]) {
                    j++;
                }
                z[i] = j;
                c = i;
            }
        }
        for (int p = 1; p < m; p++) {
            for (int k = 2; k <= z[p] / p + 1; k++) {
                if (k * p - 1 < m) {
                    f[k * p - 1] = false;
                }
            }
        }
        // Convert boolean flags to integers as requested in the original Python code
        int[] intF = new int[m];
        for (int i = 0; i < m; i++) {
            intF[i] = f[i] ? 1 : 0;
        }
        return intF;
    }

    public static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}