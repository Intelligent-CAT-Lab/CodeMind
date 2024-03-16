import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p03362 {

    private static final int INF = (int)1e16;
    private static final int MOD = (int)(1e9 + 7);

    private static int ni() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine().trim());
    }

    private static int[] na() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> values = new ArrayList<>();
        while(st.hasMoreTokens()){
            values.add(Integer.parseInt(st.nextToken()));
        }
        return values.stream().mapToInt(i -> i).toArray();
    }

    private static int[] na1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> values = new ArrayList<>();
        while(st.hasMoreTokens()){
            values.add(Integer.parseInt(st.nextToken()) - 1);
        }
        return values.stream().mapToInt(i -> i).toArray();
    }

    // Helper method to print an array joined by spaces
    private static void printArray(List<Integer> array) {
        array.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        // Set recursion limit if needed (not directly translatable to Java, depends on use cases)
        // Increase the stack size in thread creation if recursion depth is very high
        System.setSecurityManager(null);
        List<Integer> primes = makePrimeNums(2000);
        
        int n = ni();
        
        List<Integer> ans = new ArrayList<>();
        for (int pi : primes) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        printArray(ans);
    }
    
    private static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        if (n >= 2) primeNums.add(2);
        
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNums) {
                if (p * p > i) break;
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primeNums.add(i);
        }

        return primeNums;
    }
}