import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
                tmp.append(c);
                if (tableB.containsKey(tmp.toString())) {
                    ans.append(tableB.get(tmp.toString()));
                    tmp = new StringBuilder();
                }
            }
            System.out.println(ans.toString());
        }
        scanner.close();
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
        tableA.put('R', "1000