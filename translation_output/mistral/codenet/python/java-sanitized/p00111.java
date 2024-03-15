import java.util.*;

public class p00111 {
    static Map<Character, String> tableA = new HashMap<>();
    static Map<String, String> tableB = new HashMap<>();

    public static void main(String[] args) {
        Map<Character, String> tableA = makeTable();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String ans = "";
            for (char c : input.toCharArray()) {
                ans += tableA.get(c);
                if (ans.contains(tableB.get(ans))) {
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    public static Map<Character, String> makeTable() {
        Map<Character, String> tableA = new HashMap<>();
        tableA.put('A', "00000");
        tableA.put('B', "00001");
        tableA.put('C', "00010");
        tableA.put('D', "00011");
        tableA.put('E', "00100");
        tableA.put('F', "00101");
        tableA.put('G', "00110");
        tableA.put('H', "00111");
        tableA.put('I', "01000");
        tableA.put('J', "01001");
        tableA.put('K', "01010");
        tableA.put('L', "01011");
        tableA.put('M', "01100");
        tableA.put('N', "01101");
        tableA.put('O', "01110");
        tableA.put('P', "01111");
        tableA.put('Q', "10000");
        tableA.put('R', "10001");
        tableA.put('S', "10010");
        tableA.put('T', "10011");
        tableA.put('U', "10100");
        tableA.put('V', "10101");
        tableA.put('W', "10110");
        tableA.put('X', "10111");
        tableA.put('Y', "11000");
        tableA.put('Z', "11001");
        tableA.put(' ', "11010");
        tableA.put('.', "11011");
        tableA.put(',', "11100");
        tableA.put('-', "11101");
        tableA.put("'", "11110");
        tableA.put('?', "11111");
        return tableA;
    }
}