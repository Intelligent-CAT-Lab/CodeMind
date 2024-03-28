import java.util.*;

public class p03329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> six = new ArrayList<>();
        List<Integer> nine = new ArrayList<>();
        for(int i=1; i<=7; i++){
            six.add((int)Math.pow(6, i));
            nine.add((int)Math.pow(9, i));
        }
        Collections.reverse(six);
        Collections.reverse(nine);

        System.out.println(DP(N, six, nine));
    }

    public static int DP(int n, List<Integer> six, List<Integer> nine){
        if (n < 6){
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for(int sixx : six){
            if (sixx <= n){
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        count6 += DP(n, six, nine);
        n = tmp;
        if (n < 9){
            return count6;
        }
        for(int ninee : nine){
            if (n >= ninee){
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        count9 += DP(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}