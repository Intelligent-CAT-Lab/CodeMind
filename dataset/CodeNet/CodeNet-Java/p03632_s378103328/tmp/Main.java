import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static boolean found = false;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
System.out.println("[INST]10;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]11;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]12;c;sc.nextInt();"+c);
        int d = sc.nextInt();
System.out.println("[INST]13;d;sc.nextInt();"+d);

        int minSec = Integer.MAX_VALUE;
        int maxSec = 0;

        for (int i = 0; i < 101; i++) {
            boolean alice = (a <= i && i <= b);
            boolean bob = (c <= i && i <= d);

            if (alice && bob) {
                maxSec = Math.max(maxSec, i);
System.out.println("[INST]23;maxSec;Math.max(maxSec, i);"+maxSec);
                minSec = Math.min(minSec, i);
System.out.println("[INST]24;minSec;Math.min(minSec, i);"+minSec);
            }
        }

        if (minSec == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println(maxSec - minSec);
        }
    }

}