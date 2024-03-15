import java.util.*;
import java.io.*;

public class codeforces_203_A {
    static int[] readLine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split(" ");
        int[] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }

    static int[] map(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    static List<Integer> list(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    static defaultdict<Integer, Integer> defaultdict(int defVal) {
        defaultdict<Integer, Integer> result = new defaultdict<>();
        for (int i = 0; i < result.size(); i++) {
            result.put(i, defVal);
        }
        return result;
    }

    static int[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split(" ");
        int[] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }

    static void solve() throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] d = input();
            int[] a = input();
            int[] b = input();
            int[] da = input();
            int[] db = input();
            int[] daa = map(da);
            int[] dab = map(d);
            int[] dba = map(db);
            int[] dbaa = map(dba);
            defaultdict<Integer, Integer> dd = defaultdict(0);
            for (int j = 0; j < d.length; j++) {
                dd.put(d[j], dd.get(d[j]) + 1);
            }
            for (int j = 0; j < a.length; j++) {
                dd.put(a[j], dd.get(a[j]) + 1);
            }
            for (int j = 0; j < b.length; j++) {
                dd.put(b[j], dd.get(b[j]) + 1);
            }
            for (int j = 0; j < da.length; j++) {
                dd.put(da[j], dd.get(da[j]) + 1);
            }
            for (int j = 0; j < db.length; j++) {
                dd.put(db[j], dd.get(db[j]) + 1);
            }
            for (int j = 0; j < dab.length; j++) {
                dd.put(dab[j], dd.get(dab[j]) + 1);
            }
            for (int j = 0; j < dbaa.length; j++) {
                dd.put(dbaa[j], dd.get(dbaa[j]) + 1);
            }
            for (int j = 0; j < t; j++) {
                if (a[j] - daa[j] + b[j] - dbaa[j] == d[j] || a[j] - daa[j] + b[j] - dbaa[j] == d[j] || b[j] - dbaa[j] + d[j] == d[j] || d[j] == 0) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}