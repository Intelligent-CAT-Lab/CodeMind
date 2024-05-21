import java.util.*;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long vamshi = sc.nextLong();
        int z = sc.nextInt();
        long result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}