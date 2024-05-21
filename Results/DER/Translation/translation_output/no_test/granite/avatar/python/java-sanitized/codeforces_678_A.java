import java.util.*;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int vamshi = Integer.parseInt(input[0]);
        int z = Integer.parseInt(input[1]);
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}