import java.util.*;

public class p02742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        System.out.println(ceil((double) H * W / 2) == 1 && H != 1 && W != 1 ? (double) H * W / 2 : 1);
    }
}