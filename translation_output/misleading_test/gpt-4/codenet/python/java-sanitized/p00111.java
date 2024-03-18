import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p00111 {

    public static void main(String[] args) {
        Map<String, String> tableA = new HashMap<>();
        Map<String, String> tableB = new HashMap<>();
        makeTable(tableA, tableB);
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String s = "";
            for (char c : input.toCharArray()) {
                s += tableA.get(Character.toString(c));
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

    public static void makeTable(Map<String, String> tableA, Map<String, String> tableB) {
        // Populate tableA
        String[] keysA = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", ".", ",", "-", "'", "?"
        };
        for (int i = 0; i < keysA.length; i++) {
            tableA.put(keysA[i], String.format("%5s", Integer.toBinaryString(i)).replace(' ', '0'));
        }

        // Populate tableB
        tableB.put("101", " ");
        tableB.put("000000", "'");
        tableB.put("000011", ",");
        tableB.put("10010001", "-");
        tableB.put("010001", ".");
        tableB.put("000001", "?");
        tableB.put("100101", "A");
        tableB.put("10011010", "B");
        tableB.put("0101", "C");
        tableB.put("0001", "D");
        tableB.put("110", "E");
        tableB.put("01001", "F");
        tableB.put("10011011", "G");
        tableB.put("010000", "H");
        tableB.put("0111", "I");
        tableB.put("10011000", "J");
        tableB.put("0110", "K");
        tableB.put("00100", "L");
        tableB.put("10011001", "M");
        tableB.put("10011110", "N");
        tableB.put("00101", "O");
        tableB.put("111", "P");
        tableB.put("10011111", "Q");
        tableB.put("1000", "R");
        tableB.put("00110", "S");
        tableB.put("00111", "T");
        tableB.put("10011100", "U");
        tableB.put("10011101", "V");
        tableB.put("000010", "W");
        tableB.put("10010010", "X");
        tableB.put("10010011", "Y");
        tableB.put("10010000", "Z");
    }
}