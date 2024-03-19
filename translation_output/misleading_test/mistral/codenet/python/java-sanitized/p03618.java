import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        Collections.sort(list);
        List<List<Character>> groups = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Character> temp = new ArrayList<>();
            temp.add(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    temp.add(list.get(j));
                } else {
                    groups.add(temp);
                    temp = new ArrayList<>();
                    temp.add(list.get(j));
                }
            }
            groups.add(temp);
        }
        int res = 0;
        for (List<Character> group : groups) {
            res += group.size() * (group.size() - 1) / 2 + 1;
        }
        System.out.println(res);
    }
}