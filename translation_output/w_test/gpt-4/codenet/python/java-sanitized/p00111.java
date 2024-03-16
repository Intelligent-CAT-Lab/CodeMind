import java.util.HashMap;
import java.util.Scanner;

public class p00111 {

    public static void main(String[] args) {
        HashMap<Character, String> tableA;
        HashMap<String, Character> tableB;
        Pair<HashMap<Character, String>, HashMap<String, Character>> tables = makeTable();
        tableA = tables.first;
        tableB = tables.second;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String s = "";
            for (char c : input.toCharArray()) {
                s += tableA.get(c);
            }
            String tmp = "";
            String ans = "";
            for (char c : s.toCharArray()) {
                tmp += c;
                if (tableB.containsKey(tmp)) {
                    ans += tableB.get(tmp);
                    tmp = "";
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }

    public static Pair<HashMap<Character, String>, HashMap<String, Character>> makeTable() {
        HashMap<Character, String> tableA = new HashMap<>();
        HashMap<String, Character> tableB = new HashMap<>();

        // initialize tableA
        // ... (insert tableA initialization here, similar to below)

        // initialize tableB
        tableB.put("101", ' ');
        tableB.put("000000", '\'');
        tableB.put("000011", ',');
        tableB.put("10010001", '-');
        tableB.put("010001", '.');
        tableB.put("000001", '?');
        tableB.put("100101", 'A');
        // ... (complete the rest of tableB initialization)

        return new Pair<>(tableA, tableB);
    }

    private static class Pair<T, U> {
        public final T first;
        public final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
}