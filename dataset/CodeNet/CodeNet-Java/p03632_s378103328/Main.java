import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static boolean found = false;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int minSec = Integer.MAX_VALUE;
        int maxSec = 0;

        for (int i = 0; i < 101; i++) {
            boolean alice = (a <= i && i <= b);
            boolean bob = (c <= i && i <= d);

            if (alice && bob) {
                maxSec = Math.max(maxSec, i);
                minSec = Math.min(minSec, i);
            }
        }

        if (minSec == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println(maxSec - minSec);
        }
    }

}