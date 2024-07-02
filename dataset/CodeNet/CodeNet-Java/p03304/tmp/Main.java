import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
        long m = sc.nextLong();
System.out.println("[INST]8;m;sc.nextLong();"+m);
        long d = sc.nextLong();
System.out.println("[INST]9;d;sc.nextLong();"+d);
        
        long s = d == 0 ? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}