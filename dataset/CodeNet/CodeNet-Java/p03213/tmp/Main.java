import java.util.*;

public class Main {
static ArrayList<int[]> factorization (int n) {
    ArrayList<int[]> list = new ArrayList<int[]>();
    int tmp= n ;
    for (int i=2;i<=Math.sqrt(n);i++) {
System.out.println("[INST]6;None;Math.sqrt(n);"+Math.sqrt(n));
        if (tmp%i==0) {
            int cnt=0;
            while (tmp%i==0) {
                cnt++;
                tmp/=i;
            }
            int[] x = {i, cnt};
            list.add(x);
System.out.println("[INST]14;None;list.add(x);"+list.add(x));
        }
    }
    if (tmp!=1) {
        int[] x = {tmp, 1};
        list.add(x);
System.out.println("[INST]19;None;list.add(x);"+list.add(x));
    }

    if (list.size()==0) {
System.out.println("[INST]22;None;list.size();"+list.size());
        int[] x = {n, 1};
        list.add(x);
System.out.println("[INST]24;None;list.add(x);"+list.add(x));
    }
    return list;
}
    static HashMap<Integer, Integer> map;
    static void add_map(Integer x, Integer y) {
        if (map.containsKey(x)) {
System.out.println("[INST]30;None;map.containsKey(x);"+map.containsKey(x));
            map.put(x, map.get(x)+y);
System.out.println("[INST]31;None;map.put(x, map.get(x)+y);"+map.put(x, map.get(x)+y));
System.out.println("[INST]31;None;map.get(x);"+map.get(x));
        } else {
            map.put(x, y);
System.out.println("[INST]33;None;map.put(x, y);"+map.put(x, y));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
System.out.println("[INST]38;N;Integer.parseInt(sc.next());"+N);
System.out.println("[INST]38;None;sc.next();"+sc.next());
        map = new HashMap<Integer, Integer>();
        for (int i=2;i<=N;i++) {
            ArrayList<int[]> list = factorization(i);
            for (int[] array : list) {
                add_map(array[0], array[1]);
            }
        }
        ArrayList<Integer> values = new ArrayList<Integer>(map.values());
System.out.println("[INST]46;None;map.values();"+map.values());
        Collections.sort(values);
System.out.println("[INST]47;None;Collections.sort(values);"+Collections.sort(values));
        Collections.reverse(values);
System.out.println("[INST]48;None;Collections.reverse(values);"+Collections.reverse(values));
        int ans = 0;
        for (int i=0;i<values.size();i++) {
System.out.println("[INST]50;None;values.size();"+values.size());
            if (values.get(i)>=74) {
System.out.println("[INST]51;None;values.get(i);"+values.get(i));
                ans++;
            }
        }
        for (int i=0;i<values.size();i++) {
System.out.println("[INST]55;None;values.size();"+values.size());
            if (values.get(i)>=24) {
System.out.println("[INST]56;None;values.get(i);"+values.get(i));
                for (int j=0;j<values.size();j++) {
System.out.println("[INST]57;None;values.size();"+values.size());
                    if (i==j) {
                        continue;
                    }
                    if (values.get(j)>=2) {
System.out.println("[INST]61;None;values.get(j);"+values.get(j));
                        ans++;
                    }
                }
            }
        }
        for (int i=0;i<values.size();i++) {
System.out.println("[INST]67;None;values.size();"+values.size());
            if (values.get(i)>=14) {
System.out.println("[INST]68;None;values.get(i);"+values.get(i));
                for (int j=0;j<values.size();j++) {
System.out.println("[INST]69;None;values.size();"+values.size());
                    if (i==j) {
                        continue;
                    }
                    if (values.get(j)>=4) {
System.out.println("[INST]73;None;values.get(j);"+values.get(j));
                        ans++;
                    }
                }
            }
        }
        for (int i=0;i<values.size();i++) {
System.out.println("[INST]79;None;values.size();"+values.size());
            if (values.get(i)>=4) {
System.out.println("[INST]80;None;values.get(i);"+values.get(i));
                for (int j=i+1;j<values.size();j++) {
System.out.println("[INST]81;None;values.size();"+values.size());
                    if (values.get(j)>=4) {
System.out.println("[INST]82;None;values.get(j);"+values.get(j));
                        for (int k=0;k<values.size();k++) {
System.out.println("[INST]83;None;values.size();"+values.size());
                            if (i==k || j==k) {
                                continue;
                            }
                            if (values.get(k)>=2) {
System.out.println("[INST]87;None;values.get(k);"+values.get(k));
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