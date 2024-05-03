import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<String> coord = new HashSet<>(Arrays.asList("0,0"));
        String temp = "0,0";
        for (char c : path.toCharArray()) {
            if (c == 'L') temp = temp.replaceFirst(",", "-1,");
            else if (c == 'R') temp = temp.replaceFirst(",", "+1,");
            else if (c == 'U') temp = "-1," + temp.substring(temp.indexOf(',') + 1);
            else temp = "+1," + temp.substring(temp.indexOf(',') + 1);
            if (coord.contains(temp)) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        Deque<String> que = new ArrayDeque<>(Arrays.asList("0,0"));
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String i = que.poll();
            String[] split = i.split(",");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            for (int p : Arrays.asList(x + 1, x - 1)) {
                for (int q : Arrays.asList(y + 1, y - 1)) {
                    String t = p + "," + q;
                    if (coord.contains(t)) {
                        coord.remove(t);
                        que.add(t);
                    }
                }
            }
        }
        System.out.println("OK");
    }