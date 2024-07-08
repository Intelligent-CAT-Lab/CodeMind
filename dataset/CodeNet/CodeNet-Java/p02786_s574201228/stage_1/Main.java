import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();
        long x = 1;

        while (h != 1) {
            h /= 2;
            x *= 2;
            x++;
        }

        System.out.println(x);
    }
}