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
            else if (c == 'U') temp = "-1," + temp.replaceFirst(",", ",");
            else temp = "+1," + temp.replaceFirst(",", ",");
            if (coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>(Arrays.asList("0,0"));
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            String[] tempArr = que.poll().split(",");
            int i = Integer.parseInt(tempArr[0]);
            int j = Integer.parseInt(tempArr[1]);
            for (int p : Arrays.asList(i + 1, i - 1)) {
                for (int q : Arrays.asList(j + 1, j - 1)) {
                    String newTemp = p + "," + q;
                    if (coord.contains(newTemp)) {
                        coord.remove(newTemp);
                        que.add(newTemp);
                    }
                }
            }
        }
        System.out.println("OK");
    }
}