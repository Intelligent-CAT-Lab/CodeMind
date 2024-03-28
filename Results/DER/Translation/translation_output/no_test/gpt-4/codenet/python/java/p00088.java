Here is the equivalent Java code for the Python code given:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaudotCodeDecoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        Map<Integer, Character> d2 = new HashMap<>();
        for (int n = 0; n < 26; n++) {
            d2.put(n, (char) (n + 'A'));
        }
        d2.put(26, ' ');
        d2.put(27, '.');
        d2.put(28, ',');
        d2.put(29, '-');
        d2.put(30, '?');
        d2.put(31, '\'');

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringBuilder binaryString = new StringBuilder();
            for (char c : line.toCharArray()) {
                binaryString.append(d1.get(c));
            }

            StringBuilder decodedString = new StringBuilder();
            for (int i = 0; i < binaryString.length(); i += 5) {
                String chunk = binaryString.substring(i, Math.min(i + 5, binaryString.length()));
                // Pad the chunk if it's less than 5 characters
                while (chunk.length() < 5) {
                    chunk += "0";
                }
                int code = Integer.parseInt(chunk, 2);
                decodedString.append(d2.get(code));
            }
            System.out.println(decodedString.toString());
        }

        scanner.close();
    }
}
```

This code should work similarly to the Python script, reading lines from the standard input, encoding them according to `d1`, and then decoding five bits at a time according to `d2`. Just a reminder that Java doesn't have an inbuilt mechanism for a `stdin` equivalent to Python's, so `Scanner` is used for command-line input.

Keep in mind that Java's `int` type may not handle leading zeros of binary numbers as Python's `int` type does, so the conversion from binary string to integer has been adjusted accordingly. The padding with '0' ensures a full 5-bit block. This code assumes that all input lines consist of characters found in the `d1` map.
