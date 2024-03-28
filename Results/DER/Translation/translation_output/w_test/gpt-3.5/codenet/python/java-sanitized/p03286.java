import java.util.HashSet;
import java.util.Set;

public class p03286 {

    public static void main(String[] args) {
        int N = -9;
        String result = convertToBinary(N);
        System.out.println(result);
    }

    public static String convertToBinary(int N) {
        if (N == 0) {
            return "0";
        }
        
        Set<Integer> set = new HashSet<>();
        
        while (N != 0) {
            int r;
            if (N > 0) {
                r = plus(N);
                set.add(r);
                N -= Math.pow(2, r);
            } else {
                r = minus(N);
                set.add(r);
                N += Math.pow(2, r);
            }
        }
        
        int maxVal = set.stream().max(Integer::compareTo).orElse(0);
        int[] arr = new int[maxVal + 1];
        
        for (int i : set) {
            arr[i] = 1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        
        while (true) {
            p += Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        
        return n;
    }

    public static int minus(int N) {
        int p = 0;
        int n = 1;
        
        while (true) {
            p -= Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        
        return n;
    }
}