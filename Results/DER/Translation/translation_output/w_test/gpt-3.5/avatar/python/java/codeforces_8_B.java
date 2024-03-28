```java
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class PathChecker {
    public static void main(String[] args) {
        String path = "LUUDU";
        Set<String> coord = new HashSet<>();
        Set<String> visited = new HashSet<>();
        String temp = "0,0";
        coord.add(temp);

        for(int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            int x = Integer.parseInt(temp.split(",")[0]);
            int y = Integer.parseInt(temp.split(",")[1]);

            if(c == 'L') temp = (x) + "," + (y - 1);
            else if(c == 'R') temp = (x) + "," + (y + 1);
            else if(c == 'U') temp = (x - 1) + "," + (y);
            else temp = (x + 1) + "," + (y);

            if(coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }

        coord.remove("0,0");

        Queue<String> queue = new ArrayDeque<>();
        queue.add("0,0");

        while (!queue.isEmpty()) {
            if(queue.size() > 1) {
                System.out.println("BUG");
                return;
            }

            String current = queue.poll();
            int i = Integer.parseInt(current.split(",")[0]);
            int j = Integer.parseInt(current.split(",")[1]);

            for(int[] dir : new int[][]{{i + 1, j}, {i - 1, j}, {i, j + 1}, {i, j - 1}}) {
                int p = dir[0];
                int q = dir[1];
                String next = p + "," + q;
                if(coord.contains(next)) {
                    coord.remove(next);
                    queue.add(next);
                }
            }
        }

        System.out.println("OK");
    }
}
```
```
