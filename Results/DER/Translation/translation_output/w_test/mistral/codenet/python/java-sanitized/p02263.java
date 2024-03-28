import java.util.*;

public class p02263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("+")) {
                int b = s.remove(s.size() - 1);
                int a = s.remove(s.size() - 1);
                s.add(b + a);
            } else if (n[i].equals("-")) {
                int b = s.remove(s.size() - 1);
                int a = s.remove(s.size() - 1);
                s.add(b - a);
            } else if (n[i].equals("*")) {
                int b = s.remove(s.size() - 1);
                int a = s.remove(s.size() - 1);
                s.add(b * a);
            } else {
                s.add(Integer.parseInt(n[i]));
            }
        }
        System.out.println(s.remove(s.size() - 1));
    }
}