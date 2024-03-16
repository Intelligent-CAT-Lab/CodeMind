import java.util.*;
public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        Set<Integer> coord = new HashSet<>();
        coord.add(0);
        int temp = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'L') {
                temp = temp - 1;
            } else if (path.charAt(i) == 'R') {
                temp = temp + 1;
            } else if (path.charAt(i) == 'U') {
                temp = temp - 10;
            } else {
                temp = temp + 10;
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove(0);
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            int i = que.poll();
            for (int p = i + 1; p < 100; p++) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
            for (int p = i - 1; p >= 0; p--) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
            for (int p = i + 10; p < 1000; p += 10) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
            for (int p = i - 10; p >= 0; p -= 10) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
        }
        System.out.println("OK");
    }
}