import java.util.*;

public class p04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int[] l = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            l[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
    }
}