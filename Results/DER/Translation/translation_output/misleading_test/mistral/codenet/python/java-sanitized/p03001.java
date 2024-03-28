import java.util.*;

public class p03001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int mx = w / 2;
        int my = h / 2;
        List<Integer> res = new ArrayList<>();
        res.add(w * h / 2);
        if (x == mx && y == my) {
            res.add(1);
        } else {
            res.add(0);
        }
        System.out.println(res.get(0) + " " + res.get(1));
    }
}