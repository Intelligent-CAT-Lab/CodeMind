import java.util.*;

public class p02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s == 1){
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<Pair, Integer> p = new HashMap<>();
        for(int k : lis){
            for(int a = 1; a <= k; a++){
                int b = k-a;
                if(a <= b){
                    if(!p.containsKey(new Pair(a,b))){
                        f.put(sum(a,b), f.getOrDefault(sum(a,b), 0) + 1);
                        p.put(new Pair(a,b), 0);
                    }
                }
            }
            for(int a = 1; a <= s; a++){
                int b = k+a-1;
                if(a <= b){
                    int s_ = sum(a,b);
                    if(s_ > s) break;
                    if(!p.containsKey(new Pair(a,b))){
                        f.put(s_, f.getOrDefault(s_, 0) + 1);
                        p.put(new Pair(a,b), 0);
                    }
                }
            }
        }
        int ans = 0;
        for(int k : lis){
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s/k, 0);
        }
        System.out.println(ans);
    }
    static List<Integer> fact(int n){
        List<Integer> res = new ArrayList<>();
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                res.add(i);
                while(n%i == 0) n /= i;
            }
        }
        if(n > 1) res.add(n);
        return res;
    }
    static int sum(int a, int b){
        return (b+a)*(b-a+1)/2;
    }
    static class Pair{
        int a, b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Pair){
                Pair p = (Pair)obj;
                return p.a == a && p.b == b;
            }
            return false;
        }
        @Override
        public int hashCode(){
            return Objects.hash(a, b);
        }
    }
}