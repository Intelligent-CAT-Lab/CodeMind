import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int i = 1, req = 1;

        while (k - req >= 0) {
            if (k - req >= 0) {
                k = k - req;
            } else {
                break;
            }
            i++;
            if (i % n != 0) {
                req = i % n;
            } else {
                req = n;
            }
        }

        System.out.println(k);
    }
}