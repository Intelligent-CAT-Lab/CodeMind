import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
System.out.println("[INST]8;h;sc.nextLong();"+h);
        long x = 1;

        while (h != 1) {
            h /= 2;
            x *= 2;
            x++;
        }

        System.out.println(x);
    }
}