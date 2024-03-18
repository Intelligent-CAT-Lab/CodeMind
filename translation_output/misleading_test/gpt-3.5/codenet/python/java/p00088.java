```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextEncoder {

    public static void main(String[] args) {
        Map<Character, String> d1 = new HashMap<>();
        d1.put(' ', "101");
        d1.put('\'', "000000");
        d1.put(',', "000011");
        d1.put('-', "10010001");
        d1.put('.', "010001");
        d1.put('?', "000001");
        d1.put('A', "100101");
        d1.put('B', "10011010");
        d1.put('C', "0101");
        d1.put('D', "0001");
        d1.put('E', "110");
        d1.put('F', "01001");
        d1.put('G', "10011011");
        d1.put('H', "010000");
        d1.put('I', "0111");
        d1.put('J', "10011000");
        d1.put('K', "0110");
        d1.put('L', "00100");
        d1.put('M', "10011001");
        d1.put('N', "10011110");
        d1.put('O', "00101");
        d1.put('P', "111");
        d1.put('Q', "10011111");
        d1.put('R', "1000");
        d1.put('S', "00110");
        d1.put('T', "00111");
        d1.put('U', "10011100");
        d1.put('V', "10011101");
        d1.put('W', "000010");
        d1.put('X', "10010010");
        d1.put('Y', "10010011");
        d1.put('Z', "10010000");

        Map<String, Character> d2 = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            d2.put(Integer.toBinaryString(i), (char) (i + 'A'));
        }
        d2.put("11010", ' ');
        d2.put("11011", '.');
        d2.put("11100", ',');
        d2.put("11101", '-');
        d2.put("11110", '\'');
        d2.put("11111", '?');

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringBuilder encoded = new StringBuilder();
        for (char c : line.toCharArray()) {
            encoded.append(d1.get(c));
        }

        int start = 0;
        while (start + 5 <= encoded.length()) {
            String chunk = encoded.substring(start, start + 5);
            System.out.print(d2.get(chunk));
            start += 5;
        }

        System.out.println();
    }
}
```
The translated Java code above should produce the same output for the given test case.
