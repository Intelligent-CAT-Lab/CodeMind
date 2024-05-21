import java.util.*;

public class p03073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)!= '0') {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }
        int oneStartCounter = n - zeroStartCounter;
        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }
}