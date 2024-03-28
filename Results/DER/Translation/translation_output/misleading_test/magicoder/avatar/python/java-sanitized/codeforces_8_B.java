import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] temp = {"0", "0"};
        for (char c : path.toCharArray()) {
            if (c == 'L') {
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) - 1);
            } else if (c == 'R') {
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) + 1);
            } else if (c == 'U') {
                temp[0] = String.valueOf(Integer.parseInt(temp[0]) - 1);
            } else {
                temp[0] = String.valueOf(Integer.parseInt(temp[0]) + 1);
            }
            if (coord.contains(String.join(",", temp))) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(String.join(",", temp));
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String[] ij = que.poll().split(",");
            for (String pq : new String[]{String.valueOf(Integer.parseInt(ij[0]) + 1), ij[1]},
                    new String[]{String.valueOf(Integer.parseInt(ij[0]) - 1), ij[1]},
                    new String[]{ij[0], String.valueOf(Integer.parseInt(ij[1]) + 1)},
                    new String[]{ij[0], String.valueOf(Integer.parseInt(ij[1]) - 1)}) {
                if (coord.contains(pq)) {
                    coord.remove(pq);
                    que.add(pq);
                }
            }
        }
        System.out.println("OK");
    }
}