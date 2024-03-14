import java.util.*;
public class p04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l.get(i) % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l.get(0) * l.get(1);
            }
        }
        System.out.println(ans);
    }
}