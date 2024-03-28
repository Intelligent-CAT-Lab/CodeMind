import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p00111 {

    public static void main(String[] args) {
        Map<Character, String> tableA = new HashMap<>();
        Map<String, Character> tableB = new HashMap<>();

        makeTable(tableA, tableB);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String result = decodeLine(line, tableA, tableB);
            System.out.println(result);
        }
        scanner.close();
    }

    private static void makeTable(Map<Character, String> tableA, Map<String, Character> tableB) {
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
        tableB.put("10011110", 'N');
        tableB.put("00101", 'O');
        tableB.put("111", 'P');
        tableB.put("10011111", 'Q');
        tableB.put("1000", 'R');
        tableB.put("00110", 'S');
        tableB.put("00111", 'T');
        tableB.put("10011100", 'U');
        tableB.put("10011101", 'V');
        tableB.put("000010", 'W');
        tableB.put("10010010", 'X');
        tableB.put("10010011", 'Y');
        tableB.put("10010000", 'Z');
    }

    private static String decodeLine(String line, Map<Character, String> tableA, Map<String, Character> tableB) {
        StringBuilder decoded = new StringBuilder();
        String s = "";
        for (char c : line.toCharArray()) {
            s += tableA.get(c);
            if (tableB.containsKey(s)) {
                decoded.append(tableB.get(s));
                s = "";
            }
        }
        return decoded.toString();
    }
}