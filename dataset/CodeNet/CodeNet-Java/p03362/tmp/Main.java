import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    static final int INF = Integer.MAX_VALUE;

    static int[] mh = {0, 1, 0, -1};
    static int[] mw = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        int N = ni();
        
        int count = 0;
        for (int i = 6; i <= 55555; i+=5) {
            if (isPrime(i)) {
                so.print(i + " ");
                count++;
            }
            if (count == N)
                break;
        }
    } 
    
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
System.out.println("[INST]26;None;Math.sqrt(n);"+Math.sqrt(n));
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int ni() {
        return sc.nextInt();
System.out.println("[INST]35;None;sc.nextInt();"+sc.nextInt());
    }
    
    static long nl() {
        return sc.nextLong();
System.out.println("[INST]39;None;sc.nextLong();"+sc.nextLong());
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
System.out.println("[INST]43;None;sc.next().toCharArray();"+sc.next().toCharArray());
System.out.println("[INST]43;None;sc.next();"+sc.next());
    }
}
