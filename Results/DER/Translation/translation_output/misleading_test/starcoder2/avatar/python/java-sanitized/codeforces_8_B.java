import java.util.*;
public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String temp = "0,0";
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'L') {
                temp = temp.split(",")[0] + "," + (Integer.parseInt(temp.split(",")[1]) - 1);
            } else if (c == 'R') {
                temp = temp.split(",")[0] + "," + (Integer.parseInt(temp.split(",")[1]) + 1);
            } else if (c == 'U') {
                temp = (Integer.parseInt(temp.split(",")[0]) - 1) + "," + temp.split(",")[1];
            } else {
                temp = (Integer.parseInt(temp.split(",")[0]) + 1) + "," + temp.split(",")[1];
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String[] tempArr = que.poll().split(",");
            int i = Integer.parseInt(tempArr[0]);
            int j = Integer.parseInt(tempArr[1]);
            for (int[] p : new int[][]{{i + 1, j}, {i - 1, j}, {i, j + 1}, {i, j - 1}}) {
                if (coord.contains(p[0] + "," + p[1])) {
                    coord.remove(p[0] + "," + p[1]);
                    que.add(p[0] + "," + p[1]);
                }
            }
        }
        System.out.println("OK");
    }
}