
```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> tableA = make_tableA();
        HashMap<String, String> tableB = make_tableB();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String tmp = "";
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                tmp += tableA.get(String.valueOf(s.charAt(i)));
                if (tableB.containsKey(tmp)) {
                    ans += tableB.get(tmp);
                    tmp = "";
                }
            }
            System.out.println(ans);
        }
    }

    private static HashMap<String, String> make_tableA() {
        HashMap<String, String> tableA = new HashMap<>();
        tableA.put("A", "00000");
        tableA.put("B", "00001");
        tableA.put("C", "00010");
        tableA.put("D", "00011");
        tableA.put("E", "00100");
        tableA.put("F", "00101");
        tableA.put("G", "00110");
        tableA.put("H", "00111");
        tableA.put("I", "01000");
        tableA.put("J", "01001");
        tableA.put("K", "01010");
        tableA.put("L", "01011");
        tableA.put("M", "01100");
        tableA.put("N", "01101");
        tableA.put("O", "01110");
        tableA.put("P", "01111");
        tableA.put("Q", "10000");
        tableA.put("R", "10001");
        tableA.put("S", "10010");
        tableA.put("T", "10011");
        tableA.put("U", "10100");
        tableA.put("V", "10101");
        tableA.put("W", "10110");
        tableA.put("X", "10111");
        tableA.put("Y", "11000");
        tableA.put("Z", "11001");
        tableA.put(" ", "11010");
        tableA.put(".", "11011");
        tableA.put(",", "11100");
        tableA.put("-", "11101");
        tableA.put("'", "11110");
        tableA.put("?", "11111");
        return tableA;
    }

    private static HashMap<String, String> make_tableB() {
        HashMap<String, String> tableB = new HashMap<>();
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
        tableB.put("1001001
