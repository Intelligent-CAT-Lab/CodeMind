import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.close();
        
        List<List<Integer>> factorization = factorization(p);
        int ans = 1;
        for(int i = 0; i < factorization.size(); i++) {
            if (factorization.get(i).get(1) >= n) {
                ans *= Math.pow(factorization.get(i).get(0), factorization.get(i).get(1) / n);
            }
        }
        System.out.println(ans);
    }
    
    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for(int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if(temp % i == 0) {
                int cnt = 0;
                while(temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(cnt);
                arr.add(pair);
            }
        }
        
        if(temp != 1) {
            List<Integer> lastPair = new ArrayList<>();
            lastPair.add(temp);
            lastPair.add(1);
            arr.add(lastPair);
        }
        
        if(arr.isEmpty()) {
            List<Integer> soloPair = new ArrayList<>();
            soloPair.add(n);
            soloPair.add(1);
            arr.add(soloPair);
        }
        
        return arr;
    }
}