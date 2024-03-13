import java.util.*;

public class p00111 {
    public static void main(String[] args) {
        Map<Character, String> tableA = makeTableA();
        Map<String, Character> tableB = makeTableB();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            StringBuilder tmp = new StringBuilder();
            StringBuilder ans = new StringBuilder();
            for (char c : s.toCharArray()) {
                tmp.append(tableA.get(c));
                if (tableB.containsKey(tmp.toString())) {
                    ans.append(tableB.get(tmp.toString()));
                    tmp.setLength(0);
                }
            }
            System.out.println(ans.toString());
        }
    }

    private static Map<Character, String> makeTableA() {
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
        tableA.put('\'', "11110");
        tableA.put('?', "11111");
        return tableA;
    }

    private static Map<String, Character> makeTableB() {
        Map<String, Character> tableB = new HashMap<>();
        tableB.put("101", ' ');
        tableB.put("000000", '\'');
        tableB.put("000011", ',');
        tableB.put("10010001", '-');
        tableB.put("010001", '.');
        tableB.put("000001", '?');
        tableB.put("100101", 'A');
        tableB.put("10011010", 'B');
        tableB.put("0101", 'C');
        tableB.put("0001", 'D');
        tableB.put("110", 'E');
        tableB.put("01001", 'F');
        tableB.put("10011011", 'G');
        tableB.put("010000", 'H');
        tableB.put("0111", 'I');
        tableB.put("10011000", 'J');
        tableB.put("0110", 'K');
        tableB.put("00100", 'L');
        tableB.put("10011001", 'M');
        tableB.put("1001