import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> sList = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            sList.add(c);
        }
        Collections.sort(sList);
        List<List<Character>> g = new ArrayList<>();
        for (int i = 0; i < sList.size(); i++) {
            List<Character> temp = new ArrayList<>();
            temp.add(sList.get(i));
            for (int j = i + 1; j < sList.size(); j++) {
                if (sList.get(j) == sList.get(i)) {
                    continue;
                }
                temp.add(sList.get(j));
            }
            g.add(temp);
        }
        int l = sList.size();
        int res = l * (l - 1) / 2 + 1;
        for (List<Character> k : g) {
            int p = k.size();
            res -= p * (p - 1) / 2;
        }
        System.out.println(res);
    }
}