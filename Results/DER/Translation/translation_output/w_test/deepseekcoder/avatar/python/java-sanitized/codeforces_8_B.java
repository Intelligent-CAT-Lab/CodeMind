import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] temp = {"0", "0"};
        for (char c : path.toCharArray()) {
            if (c == 'L') temp[1] = String.valueOf(Integer.parseInt(temp[1]) - 1);
            else if (c == 'R') temp[1] = String.valueOf(Integer.parseInt(temp[1]) + 1);
            else if (c == 'U') temp[0] = String.valueOf(Integer.parseInt(temp[0]) - 1);
            else temp[0] = String.valueOf(Integer.parseInt(temp[0]) + 1);
            if (coord.contains(temp[0] + "," + temp[1])) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp[0] + "," + temp[1]);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String[] current = que.poll().split(",");
            int i = Integer.parseInt(current[0]), j = Integer.parseInt(current[1]);
            if (coord.contains((i + 1) + "," + j) && coord.remove((i + 1) + "," + j)) que.add((i + 1) + "," + j);
            if (coord.contains((i - 1) + "," + j) && coord.remove((i - 1) + "," + j)) que.add((i - 1) + "," + j);
            if (coord.contains(i + "," + (j + 1)) && coord.remove(i + "," + (j + 1))) que.add(i + "," + (j + 1));
            if (coord.contains(i + "," + (j - 1)) && coord.remove(i + "," + (j - 1))) que.add(i + "," + (j - 1));
        }
        System.out.println("OK");
    }
}