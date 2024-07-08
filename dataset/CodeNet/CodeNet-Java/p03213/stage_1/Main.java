import java.util.*;

public class Main {
static ArrayList<int[]> factorization (int n) {
    ArrayList<int[]> list = new ArrayList<int[]>();
    int tmp= n ;
var newVariable_0 = Math.sqrt(n);    for (int i=2;i<=newVariable_0;i++) {
        if (tmp%i==0) {
            int cnt=0;
            while (tmp%i==0) {
                cnt++;
                tmp/=i;
            }
            int[] x = {i, cnt};
var newVariable_1 = list.add(x);        }
    }
    if (tmp!=1) {
        int[] x = {tmp, 1};
var newVariable_2 = list.add(x);    }

var newVariable_3 = list.size();    if (newVariable_3==0) {
        int[] x = {n, 1};
var newVariable_4 = list.add(x);    }
    return list;
}
    static HashMap<Integer, Integer> map;
    static void add_map(Integer x, Integer y) {
var newVariable_5 = map.containsKey(x);        if (newVariable_5) {
var newVariable_6 = map.put(x, map.get(x)+y);var newVariable_7 = map.get(x);            map.put(x, newVariable_7+y);
        } else {
var newVariable_8 = map.put(x, y);        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_9 = sc.next();        int N = Integer.parseInt(newVariable_9);
        map = new HashMap<Integer, Integer>();
        for (int i=2;i<=N;i++) {
            ArrayList<int[]> list = factorization(i);
            for (int[] array : list) {
                add_map(array[0], array[1]);
            }
        }
var newVariable_10 = map.values();        ArrayList<Integer> values = new ArrayList<Integer>(newVariable_10);
        Collections.sort(values);
        Collections.reverse(values);
        int ans = 0;
var newVariable_11 = values.size();        for (int i=0;i<newVariable_11;i++) {
var newVariable_12 = values.get(i);            if (newVariable_12>=74) {
                ans++;
            }
        }
var newVariable_13 = values.size();        for (int i=0;i<newVariable_13;i++) {
var newVariable_14 = values.get(i);            if (newVariable_14>=24) {
var newVariable_15 = values.size();                for (int j=0;j<newVariable_15;j++) {
                    if (i==j) {
                        continue;
                    }
var newVariable_16 = values.get(j);                    if (newVariable_16>=2) {
                        ans++;
                    }
                }
            }
        }
var newVariable_17 = values.size();        for (int i=0;i<newVariable_17;i++) {
var newVariable_18 = values.get(i);            if (newVariable_18>=14) {
var newVariable_19 = values.size();                for (int j=0;j<newVariable_19;j++) {
                    if (i==j) {
                        continue;
                    }
var newVariable_20 = values.get(j);                    if (newVariable_20>=4) {
                        ans++;
                    }
                }
            }
        }
var newVariable_21 = values.size();        for (int i=0;i<newVariable_21;i++) {
var newVariable_22 = values.get(i);            if (newVariable_22>=4) {
var newVariable_23 = values.size();                for (int j=i+1;j<newVariable_23;j++) {
var newVariable_24 = values.get(j);                    if (newVariable_24>=4) {
var newVariable_25 = values.size();                        for (int k=0;k<newVariable_25;k++) {
                            if (i==k || j==k) {
                                continue;
                            }
var newVariable_26 = values.get(k);                            if (newVariable_26>=2) {
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}