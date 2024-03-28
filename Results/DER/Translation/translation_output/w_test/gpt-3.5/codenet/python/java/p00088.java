```java
import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        HashMap<String, String> d1 = new HashMap<>();
        d1.put(" ", "101"); d1.put("'", "000000"); d1.put(",", "000011");
        d1.put("-", "10010001"); d1.put(".", "010001"); d1.put("?", "000001");
        d1.put("A", "100101"); d1.put("B", "10011010"); d1.put("C", "0101");
        d1.put("D", "0001"); d1.put("E", "110"); d1.put("F", "01001");
        d1.put("G", "10011011"); d1.put("H", "010000"); d1.put("I", "0111");
        d1.put("J", "10011000"); d1.put("K", "0110"); d1.put("L", "00100");
        d1.put("M", "10011001"); d1.put("N", "10011110"); d1.put("O", "00101");
        d1.put("P", "111"); d1.put("Q", "10011111"); d1.put("R", "1000");
        d1.put("S", "00110"); d1.put("T", "00111"); d1.put("U", "10011100");
        d1.put("V", "10011101"); d1.put("W", "000010"); d1.put("X", "10010010");
        d1.put("Y", "10010011"); d1.put("Z", "10010000");

        HashMap<String, Character> d2 = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            d2.put(String.valueOf(i), (char)(i + 'A'));
        }
        String symbols = " .,-'?";
        for (int i = 26; i < 32; i++) {
            d2.put(String.valueOf(i), symbols.charAt(i-26));
        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toUpperCase();
            StringBuilder stream = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                stream.append(d1.get(line.substring(i, i+1)));
            }

            int index = 0;
            while (index < stream.length()) {
                String c = stream.substring(index, Math.min(index + 5, stream.length()));
                while (c.length() < 5) c += "0";
                System.out.print(d2.get(Integer.parseInt(c, 2) + ""));
                index += 5;
            }
            System.out.println();
        }
    }
}
```
```
