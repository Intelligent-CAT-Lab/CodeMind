import java.util.*;

public class p03779 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int t = (int)Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}