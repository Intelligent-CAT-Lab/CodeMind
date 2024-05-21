import java.util.*;

public class p02393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] s1 = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            s1[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(s1);
        System.out.println(s1[0] + " " + s1[1] + " " + s1[2]);
    }
}